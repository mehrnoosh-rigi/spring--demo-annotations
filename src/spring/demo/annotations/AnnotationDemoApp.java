package spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String args[]){
        //read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //get the bean from spring container
        Coach theCoach = context.getBean("TestForIdOfBean", Coach.class);

        //calls method on the bean
        System.out.println("Result:: " + theCoach.getDailyMethod());

        //close the context
        context.close();
    }
}
