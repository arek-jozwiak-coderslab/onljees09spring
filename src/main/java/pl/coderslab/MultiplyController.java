package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@Controller
public class MultiplyController {
    @GetMapping("/multiply")
    public String randomMax(Model model, @RequestParam(defaultValue = "10") int size) {
        model.addAttribute("size", size);
        return "multiply";
    }

    @GetMapping("/paramMultiply/{rows}/{cols}")
    public String paramMultiply(Model model, @PathVariable int rows, @PathVariable int cols, HttpServletRequest request) {
        model.addAttribute("rows", rows);
        model.addAttribute("cols", cols);

        Cookie c = WebUtils.getCookie(request, "cookie2");


        return "multiply";
    }
}
