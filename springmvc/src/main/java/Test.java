import controller.TestController;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebAppInitializer.class)
public class Test {

    @org.junit.Test
    public void test() {
        TestController testController = new TestController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(testController).build();
        try {
//            mockMvc.perform(get("/"))
////                    .andExpect(view().name("index"));
            mockMvc.perform(post("/form"))
//            .param("username","13")
//            .param("password","213")
//            .param("age","12"))
                    .andExpect(view().name("index"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
