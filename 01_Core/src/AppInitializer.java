import bean.MyConnection;
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
        // 1st method
        /*Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is shut down");
            }
        }));*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        //Request Bean 1st method(ClassName.class request bean)
        //SpringBeanOne bean1 = context.getBean(SpringBeanOne.class);
        //SpringBeanTwo bean2 = context.getBean(SpringBeanTwo.class);
        //System.out.println(bean1);
        //System.out.println(bean2);
        //SpringBeanThree bean3 = context.getBean(SpringBeanThree.class);
        //System.out.println(bean3);

        //Request Bean 2nd method(Bean Id request bean)
        //SpringBeanOne => springBeanOne(Bean Id)
        //casting in spring bean one class
        //SpringBeanOne springBeanOne = (SpringBeanOne) context.getBean("springBeanOne");
        //System.out.println(springBeanOne);

        //SpringBeanTwo => springBeanTwo(Bean Id)
        //SpringBeanTwo springBeanTwo = (SpringBeanTwo) context.getBean("springBeanTwo");
        //System.out.println(springBeanTwo);

        //SpringBeanThree => springBeanThree(Bean Id)
//        SpringBeanThree springBeanThree = (SpringBeanThree) context.getBean("BeanThree");
//        System.out.println(springBeanThree);

        MyConnection bean = context.getBean(MyConnection.class);
        System.out.println(bean);

        //MyConnection myConnection = (MyConnection) context.getBean("myConnection");
        //System.out.println(myConnection);

        //Bean - bean id => bean method name
        //MyConnection myConnection = (MyConnection) context.getBean("getMyConnection");
        //System.out.println(myConnection);

        MyConnection myConnection = (MyConnection) context.getBean("connection");
        System.out.println(myConnection);

        //1st method
        //context.close();

        //2nd method
        context.registerShutdownHook();
    }
}