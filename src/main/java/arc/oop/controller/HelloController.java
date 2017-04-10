package arc.oop.controller;

import arc.oop.model.spa.Spa;
import arc.oop.service.bill.impls.BillServiceImpl;
import arc.oop.service.bill.interfaces.IBillService;
import arc.oop.service.spa.impls.SpaServiceImpl;
import arc.oop.service.spa.interfaces.ISpaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by initium on 10.04.17.
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(){


    return "Hello";


    }

}
