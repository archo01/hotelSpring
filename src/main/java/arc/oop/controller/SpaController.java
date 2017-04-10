package arc.oop.controller;

import arc.oop.model.spa.Spa;
import arc.oop.service.spa.impls.SpaServiceImpl;
import arc.oop.service.spa.interfaces.ISpaService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by initium on 10.04.17.
 */

@RestController
public class SpaController {

    ApplicationContext
            mySpringContext = new
            ClassPathXmlApplicationContext("service-spa-context.xml");

    ISpaService spaService = (SpaServiceImpl) mySpringContext.getBean("services_spa");


    @RequestMapping("/api/spa/get_all")
    public List<Spa> getAll(){
       return spaService.getAll();

    }


    @RequestMapping("/api/spa/get_spa__{id}")
    public Spa getSpa(@PathVariable int id){
        return spaService.getSpa(id);

    }

    @RequestMapping("/api/spa/create_spa__{id}_{type}_{price}")
    public void createSpa(@PathVariable int id ,@PathVariable String type ,@PathVariable int price){
        Spa spa = new Spa(id, type, price);
        spaService.createSpa(spa);
    }

    @RequestMapping("/api/spa/update_spa__{id}_{type}_{price}")
    public void updateSpa(@PathVariable int id ,@PathVariable String type ,@PathVariable int price){
        Spa spa = new Spa(id, type, price);
        spaService.updateSpa(spa);
    }

    @RequestMapping("/api/spa/delete_spa__{id}")
    public void deleteSpa(@PathVariable int id){
        spaService.deleteSpa(id);

    }

    @RequestMapping("/api/spa/hello")
    public  String hello(){
        return "hello";
    }
}

