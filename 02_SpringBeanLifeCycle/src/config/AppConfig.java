/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

package config;

import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

    @Bean
    @Scope("prototype")
    public MyConnection myConnection() {
        return new MyConnection();
    }

}
