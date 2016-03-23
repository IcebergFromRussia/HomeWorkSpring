package foo.bar;

import foo.bar.performers.BandList;
import foo.bar.performers.Collective;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

import java.util.Collection;
import java.util.LinkedList;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-forCollective.xml");
        BandList bandList = (BandList) context.getBean("bandList");
        for (Collective collective :bandList.getCollectives()) {
            collective.play(0);
            collective.play(1);
        }
    }
}