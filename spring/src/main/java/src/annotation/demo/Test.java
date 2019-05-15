package src.annotation.demo;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class Test {


    public static void main(String[] args) {

        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
        Validator validator = vf.getValidator();
        UserVO userVO = new UserVO();
        userVO.setAge(40);
        System.out.println(userVO);
        Set<ConstraintViolation<UserVO>> set = validator.validate(userVO);
        for (ConstraintViolation<UserVO> constraintViolation : set) {
            System.out.println(constraintViolation.getMessage());
        }
    }
}
