package pl.mibdbz.springdemo;

public class MyApp {

    public static void main(String[] args) {
       
        //create the objects
        Coach theCoach = new TrackCoach();
        
        //use the object
        System.out.println(theCoach.getDailyWorkout());
    }
    
}
