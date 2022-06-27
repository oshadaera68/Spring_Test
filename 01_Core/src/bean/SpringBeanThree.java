/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

package bean;

import org.springframework.stereotype.Component;

@Component("BeanThree")
public class SpringBeanThree {
    public SpringBeanThree() {
        System.out.println("Bean Three");
    }
}
