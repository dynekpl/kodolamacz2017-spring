package pl.kodolamacz.spring;

import org.springframework.stereotype.Component;

@Component
public class Leg {

  private int fingerAmount;

  public Leg() {
  }

  public Leg(int fingerAmount) {
    this.fingerAmount = fingerAmount;
  }
}
