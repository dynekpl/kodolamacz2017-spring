package pl.kodolamacz.spring;

public class Human {

  Leg leg;

  public Human(Leg leg) {
    this.leg = leg;
  }

  public Human() {
  }

  public Leg getLeg() {
    return leg;
  }

  public void setLeg(Leg leg) {
    this.leg = leg;
  }

  @Override
  public String toString() {
    return "Human{" +
            "leg=" + leg +
            '}';
  }
}
