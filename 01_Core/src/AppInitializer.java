import bean.SpringBeanOne;
import bean.SpringBeanThree;
import bean.SpringBeanTwo;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Owner - Oshada Eranga
 * @Version - v0.1.0
 **/

public class AppInitializer {
    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is shut down");
            }
        }));

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        SpringBeanOne bean1 = context.getBean(SpringBeanOne.class);
        SpringBeanTwo bean2 = context.getBean(SpringBeanTwo.class);
        System.out.println(bean1);
        System.out.println(bean2);

        SpringBeanThree bean3 = context.getBean(SpringBeanThree.class);
        System.out.println(bean3);

        //context.close();
    }
}
