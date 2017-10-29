package pl.kodolamacz.spring;

public class Leg {

  int fingerAmount;

  public Leg(int fingerAmount) {
    this.fingerAmount = fingerAmount;
  }

  public int getFingerAmount() {
    return fingerAmount;
  }

  public void setFingerAmount(int fingerAmount) {
    this.fingerAmount = fingerAmount;
  }

  public void init() {
    System.out.println("Hello, I'm leg with " + fingerAmount + " fingers");
  }
}
