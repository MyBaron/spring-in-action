package src.partfour.springaop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Configuration
@ComponentScan
//开启AspectJ自动代理
// 非常重要！！！
// 没有开启自动代理 只是普通的bean类
@EnableAspectJAutoProxy
public class config {
    @Bean
    public Audience getAudience(){
        return new Audience();
    }
}
