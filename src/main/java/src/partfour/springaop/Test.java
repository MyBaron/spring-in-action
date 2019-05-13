package src.partfour.springaop;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = config.class)
public class Test {


    @Autowired
    private Performance Dancer;

    @org.junit.Test
    public void test(){
        Dancer.perform();

    }
}
