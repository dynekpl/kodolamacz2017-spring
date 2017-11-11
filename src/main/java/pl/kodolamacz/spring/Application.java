package pl.kodolamacz.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);

    Human human = context.getBean(Human.class);
    Leg leg = context.getBean(Leg.class);

    System.out.println(human);
    System.out.println(leg);

    context.close();
  }

}