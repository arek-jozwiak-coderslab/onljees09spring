package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
@RequestMapping("/first")
public class FormController {

    @GetMapping("/form")
    public String showForm() {
        return "/register/ddd";
    }

    @PostMapping("/form")
    @ResponseBody
    public String save(@RequestParam String paramName, @RequestParam String paramDate) {
        LocalDate date = LocalDate.parse(paramDate);
        return "" + paramName + " " + date.toString();
    }
}
