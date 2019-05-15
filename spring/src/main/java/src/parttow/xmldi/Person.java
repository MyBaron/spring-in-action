package src.parttow.xmldi;


public class Person {


    private EatAction eatAction;

    public Person(EatAction eatAction) {
        this.eatAction = eatAction;
    }

    public void setEatAction(EatAction eatAction) {
        this.eatAction = eatAction;
    }

    public void action() {
        eatAction.eat();
    }
}
