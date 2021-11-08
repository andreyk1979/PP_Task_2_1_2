import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("getHelloWorld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("getHelloWorld");
        Boolean comparisonHelloworld = bean == bean1;
        System.out.println(comparisonHelloworld);

        System.out.println();

        Cat bean3 = (Cat) applicationContext.getBean("getHelloCat");
        System.out.println(bean3.getMessage());
        Cat bean4 = (Cat) applicationContext.getBean("getHelloCat");
        Boolean comparisonHelloCat = bean3 == bean4;
        System.out.println(comparisonHelloCat);

    }
}