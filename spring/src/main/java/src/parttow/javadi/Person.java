package src.parttow.javadi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Person {


    private EatAction eatAction;

    public void setEatAction(EatAction eatAction) {
        this.eatAction = eatAction;
    }

    public void action() {
        eatAction.eat();
    }
}
