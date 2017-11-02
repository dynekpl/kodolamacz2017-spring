package pl.kodolamacz.zadanka;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.kodolamacz.spring.Car;

/*
 * Napisać contex.xml tworzący 2 Beany (jeden zalezy od drugiego
 * tj. w pierwszym beanie jest pole gdzie wstrzykiwany jest bean
 * drugi). Dodatkowo jeden z beanów tworzony jest przez fabrykę.
 * Sprawdzić czy w konstruktorze mamy już dostęp do wstrzykiwanych
 * obiektów.
 */
public class Zadanie {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("zadanie.xml");

        Car car = context.getBean("car", Car.class);
        car.getWheel();

        context.close();
    }
}
