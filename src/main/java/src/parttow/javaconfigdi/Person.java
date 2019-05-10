package src.parttow.javaconfigdi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    private EatAction eatAction;

    public void action() {
        eatAction.eat();
    }
}
