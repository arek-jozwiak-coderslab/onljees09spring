package pl.coderslab.cookises;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class CartController {

    private final Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addtocart() {
        Random rand = new Random();
        cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
        return "addtocart";
    }

    @RequestMapping("/cart")
    @ResponseBody
    public String cart() {
        cart.getCartItems().
                forEach(
                   ci-> System.out.println(ci.getProduct().getName() + " : "
                  + ci.getProduct().getPrice()         )
                );
        return "cart";
    }

}
