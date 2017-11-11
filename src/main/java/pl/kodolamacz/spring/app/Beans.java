package pl.kodolamacz.spring.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(value = "pl.kodolamacz.spring.app")
// albo:
//@ComponentScan // wtedy skanuje ten package i wszystkie w głąb
public class Beans {

}
