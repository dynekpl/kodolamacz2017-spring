package pl.kodolamacz.podstawy;

public class Singleton {

  private static Singleton instance;

  private Singleton() {
  }

  public Singleton init() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
