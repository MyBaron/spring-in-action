package src.parttow.javaconfigdi.myconfig;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import src.parttow.javaconfigdi.EatAction;
import src.parttow.javaconfigdi.Person;

@Configuration
@ComponentScan(basePackageClasses = {EatAction.class, Person.class})
public class JavaConfig {
}
