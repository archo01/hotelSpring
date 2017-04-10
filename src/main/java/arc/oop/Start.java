package arc.oop;

import arc.oop.service.bill.impls.BillServiceImpl;
import arc.oop.service.bill.interfaces.IBillService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by initium on 10.04.17.
 */
@SpringBootApplication
public class Start {
    public static void main(String[] args) {


        SpringApplication.run(Start.class, args);
    }
}
