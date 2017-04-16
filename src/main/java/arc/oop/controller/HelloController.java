package arc.oop.controller;

import arc.oop.model.spa.Spa;
import arc.oop.service.bill.impls.BillServiceImpl;
import arc.oop.service.bill.interfaces.IBillService;
import arc.oop.service.spa.impls.SpaServiceImpl;
import arc.oop.service.spa.interfaces.ISpaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by initium on 10.04.17.
 */
@RestController
public class HelloController {


    @RequestMapping(value = "info", method = RequestMethod.GET)
    public String helloOne(){
        return "index.html";
    }

    @RequestMapping("/hello")
    public String hello(){




    return "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "\t<title>Hello World</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "\n" +
            "<style>\n" +
            "\tbody {\n" +
            "\t\tpadding: 100px;\n" +
            "\t}\n" +
            "\t.first {\n" +
            "\t\tfont-size: 14px;\n" +
            "\t\ttext-align: left;\n" +
            "\t\tmargin-left: 150px;\n" +
            "\t\t\n" +
            "\t\t}\n" +
            "\t.mini {\n" +
            "\t\tpadding-top: 20px;\n" +
            "\t\ttext-align: center;\n" +
            "\t\tpadding-left: 30px;\n" +
            "\t}\n" +
            "\t.title {\n" +
            "\t\t\n" +
            "\t\tfont-size: 20px;\n" +
            "\t\tfont-weight: 700;\n" +
            "\t\ttext-align: center;\n" +
            "\t\tpadding-left: 200px;\n" +
            "\t\tpadding-right: 200px;\n" +
            "\t}\n" +
            "</style>\n" +
            "\n" +
            "<div class=\"first\">КУРСОВИЙ ПРОЕКТ</div>\n" +
            "<div class=\"mini\">на тему:</div>\n" +
            "<div class=\"title\">ДОСЛІДЖЕННЯ ФУНКЦІЙ \n" +
            "НА МАКСИМУМ І МІНІМУМ</div>\n" +
            "<div>\n" +
            "\t<div>\n" +
            "\t\t<div></div>\n" +
            "\t</div>\n" +
            "</div>\n" +
            "\n" +
            "</body>\n" +
            "</html>";

    }

}
