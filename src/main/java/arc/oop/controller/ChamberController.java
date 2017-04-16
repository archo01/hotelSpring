package arc.oop.controller;

import arc.oop.model.bill.Bill;
import arc.oop.model.chamber.Chamber;
import arc.oop.service.chamber.impls.ChamberServiceImpl;
import arc.oop.service.chamber.interfaces.IChamberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by initium on 10.04.17.
 */

@RestController
public class ChamberController {

    ApplicationContext
            mySpringContext = new
            ClassPathXmlApplicationContext("service-chamber-context.xml");

    IChamberService chamberService = (ChamberServiceImpl) mySpringContext.getBean("service_ch");


    @RequestMapping("/api/chamber/get_all")
    public List<Chamber> getAll(){
       return chamberService.getAll();

    }


    @RequestMapping("/api/chamber/get_chamber__{id}")
    public Chamber getChamber(@PathVariable int id){
        return chamberService.getChamber(id);

    }


    @RequestMapping("/api/chamber/create_chamber__{id}_{fridge}_{bar}_{conditioner}_{jacusi}")
    public void createChamber(@PathVariable int id ,@PathVariable boolean fridge ,@PathVariable boolean bar ,@PathVariable boolean conditioner ,@PathVariable boolean jacusi){
        Chamber chamber = new Chamber(id, fridge, bar, conditioner, jacusi);
        chamberService.createChamber(chamber);
    }

    @RequestMapping("/api/chamber/update_chamber__{id}_{fridge}_{bar}_{conditioner}_{jacusi}")
    public void updateChamber(@PathVariable int id ,@PathVariable boolean fridge ,@PathVariable boolean bar ,@PathVariable boolean conditioner ,@PathVariable boolean jacusi){
        Chamber chamber = new Chamber(id, fridge, bar, conditioner, jacusi);
        chamberService.updateChamber(chamber);
    }

    @RequestMapping("/api/chamber/delete_chamber__{id}")
    public void deleteChamber(@PathVariable int id){
        chamberService.deleteChamber(id);

    }

    @RequestMapping("/api/chamber/hello")
    public  String hello(){
        return "hello";
    }
}

