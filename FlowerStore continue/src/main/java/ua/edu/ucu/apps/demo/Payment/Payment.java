package ua.edu.ucu.apps.demo.Payment;

import ua.edu.ucu.apps.demo.User.User;

public interface Payment {
    void pay(double price, User user);
}
