/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

package config;

import bean.MyConnection;
import bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean") //1st method(Scan Package name)
//@ComponentScan(basePackageClasses = SpringBeanOne.class) //2nd method(Scan clz)
public class AppConfig {
    public AppConfig() {
        System.out.println("App Config Object Created");
    }

    @Bean("connection")
    public MyConnection getMyConnection() {
        return new MyConnection();
    }

}