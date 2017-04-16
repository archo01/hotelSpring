package arc.oop.controller;

import arc.oop.model.bill.Bill;
import arc.oop.model.bill.Bill;
import arc.oop.model.chamber.Chamber;
import arc.oop.model.restaurant.Restaurant;
import arc.oop.model.spa.Spa;
import arc.oop.service.bill.impls.BillServiceImpl;
import arc.oop.service.bill.interfaces.IBillService;
import arc.oop.service.bill.impls.BillServiceImpl;
import arc.oop.service.bill.interfaces.IBillService;
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
public class BillController {

    ApplicationContext
            mySpringContext = new
            ClassPathXmlApplicationContext("service-bill-context.xml");

    IBillService billService = (BillServiceImpl) mySpringContext.getBean("service_bill");


    @RequestMapping("/api/bill/get_all")
    public List<Bill> getAll(){
       return billService.getAll();

    }


    @RequestMapping("/api/bill/get_bill__{id}")
    public Bill getBill(@PathVariable int id){
        return billService.getBill(id);

    }


    @RequestMapping("/api/bill/create_bill__{id}__chamber__{id1}_{fridge}_{bar}_{conditioner}_{jacusi}__restaurant__{id2}_{food}_{price}__spa__{id3}_{type}_{price1}")
    public void createBill(@PathVariable int id ,
                           @PathVariable int id1 ,
                           @PathVariable boolean fridge ,
                           @PathVariable boolean bar ,
                           @PathVariable boolean conditioner ,
                           @PathVariable boolean jacusi,
                           @PathVariable int id2 ,
                           @PathVariable String food ,
                           @PathVariable int price,
                           @PathVariable int id3 ,
                           @PathVariable String type ,
                           @PathVariable int price1
    ){
        Chamber chamber = new Chamber(id1, fridge, bar, conditioner, jacusi);
        Restaurant restaurant = new Restaurant(id2, food, price);
        Spa spa = new Spa(id3, type, price1);
        Bill bill = new Bill(id, chamber,restaurant,spa);
        billService.createBill(bill);
    }

    @RequestMapping("/api/bill/update_bill__{id}__chamber__{id1}_{fridge}_{bar}_{conditioner}_{jacusi}__restaurant__{id2}_{food}_{price}__spa__{id3}_{type}_{price1}")
    public void updateBill(@PathVariable int id ,
                           @PathVariable int id1 ,
                           @PathVariable boolean fridge ,
                           @PathVariable boolean bar ,
                           @PathVariable boolean conditioner ,
                           @PathVariable boolean jacusi,
                           @PathVariable int id2 ,
                           @PathVariable String food ,
                           @PathVariable int price,
                           @PathVariable int id3 ,
                           @PathVariable String type ,
                           @PathVariable int price1
    ){
        Chamber chamber = new Chamber(id1, fridge, bar, conditioner, jacusi);
        Restaurant restaurant = new Restaurant(id2, food, price);
        Spa spa = new Spa(id3, type, price1);
        Bill bill = new Bill(id, chamber,restaurant,spa);
        billService.updateBill(bill);
    }

    @RequestMapping("/api/bill/delete_bill__{id}")
    public void deletebill(@PathVariable int id){
        billService.deleteBill(id);

    }

    @RequestMapping("/api/bill/hello")
    public  String hello(){
        return "hello";
    }
}

