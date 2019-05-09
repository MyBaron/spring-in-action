package src.partone.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
//        加载xml配置
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/one-aop-spring.xml");
        King king = context.getBean(King.class);
        king.execute();
    }
}
