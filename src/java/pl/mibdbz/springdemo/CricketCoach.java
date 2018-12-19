
package pl.mibdbz.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;
    
    //no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }
    
    //our setter methods
    public void setFortuneService(FortuneService fortuneService){
        System.out.println("CricketCoach: inside setter method - getFortuneService");
        this.fortuneService = fortuneService;
    }
    
    public void setEmailAddress(String emailAddress){
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }
    
    public void setTeam(String team){
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }
    //----------------------------------
    //getters
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
    public String getEmailAddress(){
        return this.emailAddress;
    }
    
    public String getTeam(){
        return this.team;
    }
    
}
