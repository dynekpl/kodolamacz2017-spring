package pl.kodolamacz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {

  private Leg leg;

  public Human() {
  }

  @Autowired
  public Human(Leg leg) {
    this.leg = leg;
  }

}
