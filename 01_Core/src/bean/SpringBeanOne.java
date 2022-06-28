/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

package bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*scopes are divided 2 parts.
 * 1.singleton scope
 * 2.prototype scope
 */

@Component
//@Scope("prototype") //changing default scope in Bean class
@Scope("singleton")
public class SpringBeanOne {
    public SpringBeanOne() {
        System.out.println("Bean one");
    }
}
