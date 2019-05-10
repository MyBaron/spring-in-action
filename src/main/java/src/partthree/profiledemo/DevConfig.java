package src.partthree.profiledemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {

    @Bean
    public Data data(){
        System.out.println("dev 配置生产的data");
        return new Data("dev");
    }
}
