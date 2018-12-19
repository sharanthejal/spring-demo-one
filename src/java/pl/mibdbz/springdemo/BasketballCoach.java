
package pl.mibdbz.springdemo;

public class BasketballCoach implements Coach{

    //define private field for the dependency
    private FortuneService fortuneService;
    
    //define a contructor for the dependency
    public BasketballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    
    @Override
    public String getDailyWorkout() {
        return "shoot 100 times to basket";
    }

    @Override
    public String getDailyFortune() {
        //use fortune service to get fortune
        return fortuneService.getFortune();
    }
    
    public void doMyStartupStuff(){
        System.out.println("No i co teraz powiesz?!");
    }
    
    public void doMyCleanupStuff(){
        System.out.println("Hahaha!!!!!!!!");
    }
    
}
