package src.parttow.javadi;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import src.parttow.javadi.myconfig.JavaConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class Test {

    @Autowired
    private Person person;

    @org.junit.Test
    public void tset(){
        person.action();
    }
}
