package pl.kodolamacz.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Human {

    @Autowired
    private Leg leg;

    public Human() {
        System.out.println("Bezparametrowy");
    }

    @PostConstruct
    public void init() {
        System.out.println("ZARAZ PO POWOŁANIU BEANA");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean umiera");
    }

//    public Human(Leg leg) {
//        Assert.notNull(leg, "Leg is NULL!");
//        this.leg = leg;
//        System.out.println("Wstrzykuję nogę");
//    }

    public Leg getLeg() {
        return leg;
    }

//    public void setLeg(Leg leg) {
//        this.leg = leg;
//    }

    @Override
    public String toString() {
        return "Human{" +
                "leg=" + leg +
                '}';
    }
}
