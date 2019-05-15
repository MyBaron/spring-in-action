package src.partfour.springaop;


import org.aspectj.lang.annotation.*;

@Aspect //切面类
public class Audience {


    @Pointcut("execution(* src.partfour.springaop.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhone(){
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CALP CALP CALP");
    }

    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Deamnding a refund");
    }
}
