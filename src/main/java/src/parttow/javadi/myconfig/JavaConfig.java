package src.parttow.javadi.myconfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import src.parttow.javadi.EatAction;
import src.parttow.javadi.Person;

@Configuration
@ComponentScan(basePackageClasses = {EatAction.class, Person.class})
public class JavaConfig {

    @Bean
    public EatAction eatAction() {
        return new EatAction();
    }

    @Bean
    public Person person(EatAction eatAction){
        Person person = new Person();
        person.setEatAction(eatAction);
        return person;
    }
}
