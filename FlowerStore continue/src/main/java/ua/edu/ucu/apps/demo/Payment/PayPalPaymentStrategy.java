package ua.edu.ucu.apps.demo.Payment;

import ua.edu.ucu.apps.demo.User.User;

public class PayPalPaymentStrategy {
    public void pay(double price, User user){
        user.setMoney(user.getMoney() - price * 1.1);
    }
}
