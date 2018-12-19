
package pl.mibdbz.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLiveCycleDemoApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLiveCycle-applicationContext.xml");
        
        BasketballCoach theCoach = context.getBean("myCoach", BasketballCoach.class);
        BasketballCoach alphaCoach = context.getBean("myCoach", BasketballCoach.class);
        
        boolean result = (theCoach == alphaCoach);
        
        System.out.println("result: " + result);
        System.out.println("miejsce w pamieci " + theCoach);
        System.out.println("miejsce drugie " + alphaCoach);
        
        context.close();
        
        
    }
    
}
