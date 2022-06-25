/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

package bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean() {
        System.out.println("Spring bean object created.");
    }

    public void testBean(){
        System.out.println("Hureeee...!");
    }
}
