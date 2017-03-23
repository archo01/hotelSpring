package arc.oop;

import arc.oop.dao.chamber.impls.DaoChamberImpl;
import arc.oop.model.BillsManager;
import arc.oop.model.chamber.Chamber;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by initium on 20.03.17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ApplicationContext mySpringContext = new ClassPathXmlApplicationContext("spring-context.xml");

        Chamber chamber01 = (Chamber) mySpringContext.getBean("ch_01");
        System.out.println(chamber01.getId());
        BillsManager billsManager = (BillsManager)
                mySpringContext.getBean("BillsManager");

        System.out.println(billsManager.getList());
        System.out.println(billsManager.getList().size());

        System.out.println("--------------------------------------");



        DaoChamberImpl chamberImpls = new DaoChamberImpl();

        System.out.println("----");
        System.out.println("----");
        System.out.println("----");


        chamberImpls.showAll();
        System.out.println("----");

        Chamber testChamber = chamberImpls.getChamber(2);
        System.out.println(testChamber.isJacusi());
        testChamber.setJacusi(true);
        System.out.println(testChamber.isJacusi());
        chamberImpls.showAll();
        System.out.println("----");
        chamberImpls.updateChamber(testChamber);
        System.out.println("----");
        chamberImpls.showAll();


    }
}
