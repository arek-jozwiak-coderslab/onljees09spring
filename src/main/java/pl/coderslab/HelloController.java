package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/helloView")
    public String helloView(Model model) {
        int hour = LocalDateTime.now().getHour();
//        int hour = 22;
        String color = "#000";
        String backgroundColor = "#fff";
        if (hour > 20 || hour < 8) {
            color = "#fff";
            backgroundColor = "#000";
        }
        model.addAttribute("color", color);
        model.addAttribute("backgroundColor", backgroundColor);
        return "home";
    }
}
