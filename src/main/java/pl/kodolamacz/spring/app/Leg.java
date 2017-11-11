package pl.kodolamacz.spring.app;

import org.springframework.stereotype.Component;

@Component
public class Leg {

    private int fingerAmount;

    public Leg(){}

    public Leg(int fingerAmount) {
        this.fingerAmount = fingerAmount;
    }

    public int getFingerAmount() {
        return fingerAmount;
    }

    public void setFingerAmount(int fingerAmount) {
        this.fingerAmount = fingerAmount;
    }

    public void init(){
        System.out.println("HELLO. I was created! I have " + fingerAmount + " fingers");
    }

    @Override
    public String toString() {
        return "Leg{" +
                "fingerAmount=" + fingerAmount +
                '}';
    }
}
