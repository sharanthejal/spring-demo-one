
package pl.mibdbz.springdemo;

public class TrackCoach implements Coach {

    //define private filed for dependancy
    private FortuneService fortuneService;
    
    //constructor for dependancy injection
    public TrackCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }
    
    //default constructor
    public TrackCoach(){};
    
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        //use fortune service to get fortune
        return "Just do it: " + fortuneService.getFortune();
    }
    
    //add an init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: Inside method doMyStartupStuff");
    }
    
    //add a destroy method
    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: Inside method doMyCleanupStuffYOYO");
    }
}
