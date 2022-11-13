package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.demo.Delivery.DHLDeliveryStrategy;
import ua.edu.ucu.apps.demo.Delivery.*;
import ua.edu.ucu.apps.demo.Flower.*;
import ua.edu.ucu.apps.demo.Item.Item;
import ua.edu.ucu.apps.demo.Payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.demo.Payment.PayPalPaymentStrategy;
import ua.edu.ucu.apps.demo.User.User;

import java.util.ArrayList;
import java.util.List;

public class PaymentTest {

    private PayPalPaymentStrategy paypal;
    private CreditCardPaymentStrategy credit;

    @BeforeEach
    public void init() {

        paypal = new PayPalPaymentStrategy();
        credit = new CreditCardPaymentStrategy();
    }

    @Test
    public void testPayment() {
        User user = new User("Bob", 200);
        credit.pay(20, user);
        Assertions.assertEquals(user.getMoney(), 179);
        paypal.pay(10, user);
        Assertions.assertEquals(user.getMoney(), 168);
    }
}

