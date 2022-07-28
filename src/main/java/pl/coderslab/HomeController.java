package pl.coderslab;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class HomeController {

//    private static final Logger log
//            = LoggerFactory.getLogger(HomeController.class);


    @RequestMapping("/start")
    public String showStart() {
        int a = 10;
        log.debug("info {} : {}", a, a);
        return "hello";
    }

    @RequestMapping("/app")
    public String showStartManager() {
        System.out.println("hello manger");
        return "app";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "awedawe awe aw ";
    }

    @RequestMapping("/hello/{firstName}/{lastName}")
    @ResponseBody
    public String hello(@PathVariable String firstName, @PathVariable String lastName) {

        return "Witaj" + firstName + " " + lastName;
    }

}
