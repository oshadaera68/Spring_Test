/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) // request in a scope singleton(2nd method)
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // request in a scope prototype(2nd method)
public class SpringBeanOne implements DisposableBean {
    public SpringBeanOne() {
        System.out.println("Spring bean worked");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean one destroyed");
    }
}
