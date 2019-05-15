package src.partfour.springaop;


import org.springframework.stereotype.Component;

@Component
public class Dancer implements Performance {
    @Override
    public void perform() {
        System.out.println("now the perform is dancer");
    }
}
