import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();

        //SpringBean bean = context.getBean(SpringBean.class);
        //SpringBean bean2 = context.getBean(SpringBean.class);
        //SpringBean bean3 = context.getBean(SpringBean.class);
        // System.out.println(bean);
        //System.out.println(bean2);
        //System.out.println(bean3);
    }
}