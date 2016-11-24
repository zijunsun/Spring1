import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Performer;

/**
 * Created by SUN on 2016/11/14.
 */
public class test {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();
    }
}
