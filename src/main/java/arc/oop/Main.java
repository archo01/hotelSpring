package arc.oop;

import arc.oop.dao.spa.impls.DaoSpaImpl;
import arc.oop.dao.spa.interfaces.IDaoSpa;
import arc.oop.model.BillsManager;
import arc.oop.model.bill.Bill;
import arc.oop.model.chamber.Chamber;
import arc.oop.model.spa.Spa;
import arc.oop.service.bill.impls.BillServiceImpl;
import arc.oop.service.bill.interfaces.IBillService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Created by initium on 20.03.17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
//  connect to XML
        ApplicationContext
                mySpringContext = new
                ClassPathXmlApplicationContext("spring-context.xml");
//  get beans
        IBillService billsMananger = (BillServiceImpl) mySpringContext.getBean("service_bill");


//  start testing

        billsMananger.showAll();




    }
}
