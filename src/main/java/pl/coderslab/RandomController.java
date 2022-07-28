package pl.coderslab;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@Slf4j
public class RandomController {

    @GetMapping("/show-random")
    @ResponseBody
    public String showRandom() {

        Random random = new Random();
        int i = random.nextInt(100) + 1;

        return "" + i;
    }

    @GetMapping("/random/{max}/{min}")
    @ResponseBody
    public String randomMax(@PathVariable int max, @PathVariable int min) {
        log.debug("max {} ", max);
        log.debug("min {} ", min);
        Random random = new Random();
        int i = random.nextInt(max - min) + min;

        return "" + i;
    }
}
