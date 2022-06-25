/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("App Config Object Created");
    }
}
