package pl.kodolamacz.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext context =
            new ClassPathXmlApplicationContext("context.xml");

       Car car = context.getBean(Car.class);
//  Car car = (Car) context.getBean("car"); ale lepiej tak:
//  Car car = context.getBean("car", Car.class);
       Car car2 = context.getBean("car2", Car.class);
       Car car3 = context.getBean("car3", Car.class);

    // printCarWithWheel(car);
    // printCarWithWheel(car2);
    // printCarWithWheel(car3);

    //System.out.println("car2.getWheel() == car3.getWheel() -> " + (car2.getWheel() == car3.getWheel()));

    System.out.println("-------------------");
    Car auto = context.getBean("car7", Car.class);

    printCarWithWheel(auto);

    context.close();

  }

  private static void printCarWithWheel(Car car) {
    System.out.println(car.toString() + " with wheel: " + car.getWheel());
  }
}
