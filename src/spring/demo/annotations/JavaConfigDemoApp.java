package spring.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String args[]){
        //read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        //calls method on the bean
        System.out.println("Result:: " + theCoach.getDailyMethod());
        System.out.println("Result:: " + theCoach.getDailyFortune());

        //close the context
        context.close();
    }
}
