/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

package bean;

import org.springframework.beans.factory.DisposableBean;

public class MyConnection implements DisposableBean {
    public MyConnection() {
        System.out.println("My connection");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("My connection destroyed");
    }
}
