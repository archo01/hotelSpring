package arc.oop;

import arc.oop.dao.bill.impl.DaoBillImpl;
import arc.oop.dao.bill.interfaces.IDaoBill;
import arc.oop.dao.chamber.impls.DaoChamberImpl;
import arc.oop.dao.chamber.interfaces.IDaoChamber;
import arc.oop.dao.spa.impls.DaoSpaImpl;
import arc.oop.dao.spa.interfaces.IDaoSpa;
import arc.oop.model.BillsManager;
import arc.oop.model.chamber.Chamber;
import arc.oop.model.spa.Spa;
import arc.oop.service.chamber.interfaces.IChamberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

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



//        DaoChamberImpl chamberImpls = new DaoChamberImpl();
//
//        System.out.println("----");
//        System.out.println("----");
//        System.out.println("----");
//
//
//        chamberImpls.showAll();
//        System.out.println("----");
//
//        Chamber testChamber = chamberImpls.getChamber(2);
//        System.out.println(testChamber.isJacusi());
//        testChamber.setJacusi(true);
//        System.out.println(testChamber.isJacusi());
//        chamberImpls.showAll();
//        System.out.println("----");
//        chamberImpls.updateChamber(testChamber);
//        System.out.println("----");
//        chamberImpls.showAll();
//        testChamber.setId(7);
//        System.out.println("----");
//        chamberImpls.createChamber(testChamber);
//        System.out.println("----");
//        chamberImpls.showAll();

//        IChamberService daoChamber = (IChamberService) mySpringContext.getBean("dao_ch");
//        daoChamber.showAll();
//        Chamber chamber02 = daoChamber.getChamber(1);
//        chamber02.setId(8);
//        daoChamber.updateChamber(chamber02);
//        System.out.println("----------------------");
//        daoChamber.showAll();
//        System.out.println("----------------------");
//        daoChamber.deleteChamber(2);
//        System.out.println("----------------------");
//        daoChamber.showAll();
//        ApplicationContext mySpringContextToo = new ClassPathXmlApplicationContext("dao-bill-context.xml");
//
//        IDaoBill daoBill = (DaoBillImpl) mySpringContextToot.getBean("dao_bill");
//        daoBill.showAll();
//

        ApplicationContext mySpringContextToot = new ClassPathXmlApplicationContext("dao-spa-context.xml");

        IDaoSpa spa = (DaoSpaImpl) mySpringContextToot.getBean("dao_spa");

        spa.showAll();
        Spa leviy = spa.getSpa(1);
        leviy.setId(7);
        System.out.println(
                leviy.toString());
//        spa.getAll();
        System.out.println("-----");
        spa.createSpa(leviy);
        spa.showAll();










    }
}
