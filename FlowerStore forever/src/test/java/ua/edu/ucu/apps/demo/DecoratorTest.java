package ua.edu.ucu.apps.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.aop.scope.ScopedProxyUtils;
import ua.edu.ucu.apps.demo.Flower.*;
import ua.edu.ucu.apps.demo.Item.BasketDecorator;
import ua.edu.ucu.apps.demo.Item.PaperDecorator;
import ua.edu.ucu.apps.demo.Item.RibbonDecorator;

public class DecoratorTest {


    @Test
    public void testDecorator() {
        Flower flower_1 = new Rose();
        flower_1.setPrice(10);
        Flower flower_2 = new Tulip();
        flower_2.setPrice(10);
        Flower flower_3 = new Chamomile();
        flower_3.setPrice(10);
        RibbonDecorator ribbon_flower = new RibbonDecorator(flower_1);
        BasketDecorator basket_flower = new BasketDecorator(flower_2);
        PaperDecorator paper_flower = new PaperDecorator(flower_3);
        Assertions.assertEquals(paper_flower.price(), 23);
        Assertions.assertEquals(ribbon_flower.price(), 50);
        Assertions.assertEquals(basket_flower.price(), 14);
    }
}
