package pl.kodolamacz.spring;

import java.util.regex.Pattern;

public class Car {

  private Wheel wheel;

  private String name;

  private Pattern pattern;

  public Car() {
    System.out.println("Konstruktor bezargumentowy");
  }

  public Car(Wheel wheel) {
    System.out.println("Konstruktor z kołem");
    this.wheel = wheel;
  }

  public Car(String carName) {
    System.out.println("Konstruktor z nazwą samochodu");
    this.name = carName;
    this.wheel = new Wheel();
  }

  public void postConstruct() {
    System.out.println("postConstruct" + wheel);
  }

  //    wymagane public, void i bez argumentów
  public void init() {
    System.out.println("START CAR");
  }

  // te same restrykcje
  public void destroy() {
    System.out.println("STOP CAR");
  }

  public void setName(String name) {
    this.name = name;
  }

  public Wheel getWheel() {
    return wheel;
  }

  public void setWheel(Wheel wheel) {
    this.wheel = wheel;
  }

  public void setPattern(Pattern pattern) {
    this.pattern = pattern;
  }

  @Override
  public String toString() {
    return name;
  }

  public static Pollution produceStaticPollution() {
    System.out.println("static pollution...");
    return new Pollution();
  }

  public Pollution producePollution() {
    System.out.println("pollution...");
    return new Pollution();
  }
}
