package ua.edu.ucu.apps.demo.Payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.demo.User.User;


@RequestMapping
@RestController
public class PaymentController {
    @GetMapping(value = "/payment")
    public String payment() {
        CreditCardPaymentStrategy credit = new CreditCardPaymentStrategy();
        PayPalPaymentStrategy paypal = new PayPalPaymentStrategy();
        User user = new User("Bob", 200);
        credit.pay(20, user);
        String message = "Bob have 200$. He pay 10$ using CreditCard. Now he have: " + user.getMoney() + "\n";
        paypal.pay(20, user);
        message += "Then, he also pay 20$ using PayPal. Now he have: " + user.getMoney();
        return message;
    }
}
