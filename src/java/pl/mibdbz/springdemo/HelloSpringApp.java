
package pl.mibdbz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach secCoach = context.getBean("secondCoach", Coach.class);
        
        //call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(secCoach.getDailyWorkout());
        
        //let's call fortune methods
        System.out.println(theCoach.getDailyFortune());
        System.out.println(secCoach.getDailyFortune());
        
        //close the context
        context.close();
    }
    
}
