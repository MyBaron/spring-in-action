package src.partthree.profiledemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfig {

    @Bean
    public Data data(){
        System.out.println("prod 配置生产的data");
        return new Data("prod");
    }
}
