package src.annotation.demo;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.PARAMETER,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy=ageValidator.class)
public @interface isYoung {

    int maxAge() default 30;
    String message() default "年龄太大了";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
