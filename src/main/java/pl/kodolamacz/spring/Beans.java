package pl.kodolamacz.spring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

  @Bean(initMethod = "init")
  @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
  public Leg createLeg() {
    return new Leg(5);
  }

  @Bean
  public Human createHuman(){
    return new Human(createLeg());
  }

  @Bean
  public Human getUnnormalHuman(){
    Human human = new Human();
    Leg leg = createLeg();
    leg.setFingerAmount(4);
    human.setLeg(leg);
    return human;
  }

}
