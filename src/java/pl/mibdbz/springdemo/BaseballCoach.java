
package pl.mibdbz.springdemo;

public class BaseballCoach implements Coach{
    
    //define a private field for dependancy
    private final FortuneService fortuneService;
    
    //constructor for dependancy injection
    public BaseballCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }
    
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //use fortune service to get fortune
        return fortuneService.getFortune();
    }
}
