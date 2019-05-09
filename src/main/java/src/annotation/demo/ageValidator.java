package src.annotation.demo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ageValidator  implements ConstraintValidator<isYoung,Integer> {

    private int age;

    public void initialize(isYoung constraintAnnotation) {
        this.age = constraintAnnotation.maxAge();
    }

    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        System.out.println("this value"+value);
        return 30 > value;
    }
}
