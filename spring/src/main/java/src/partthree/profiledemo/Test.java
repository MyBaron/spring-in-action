package src.partthree.profiledemo;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DevConfig.class,ProdConfig.class})
@ActiveProfiles("prod")
public class Test {

    @Autowired
    public Data data;

    @org.junit.Test
    public void test(){
        data.say();
    }
}
