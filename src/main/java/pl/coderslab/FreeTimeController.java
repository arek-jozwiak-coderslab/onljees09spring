package pl.coderslab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Controller
public class FreeTimeController {
    @GetMapping("/free")
    public String doSth() {

        LocalDateTime now = LocalDateTime.now();
        String free = "Pracuje";
        if (now.getDayOfWeek().equals(DayOfWeek.SUNDAY)
                || now.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            free = "Wolne";
        } else {
            if (now.getHour() > 17 || now.getHour() < 9) {
                free = "Wolne";
            }
        }

        return free;
    }

}
