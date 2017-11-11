package pl.kodolamacz.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.kodolamacz.spring.dao.UserService;

public class Aplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Human human = context.getBean(Human.class);

        Leg leg = context.getBean(Leg.class);

        System.out.println(human);
        System.out.println(leg);

        System.out.println("leg == human.getLeg() = " + (leg == human.getLeg()));

//        Human unnormalHuman = context.getBean("getUnnormalHuman", Human.class);

        UserService userService = context.getBean(UserService.class);
        System.out.println("userService = " + userService);

        context.close();

    }
}
