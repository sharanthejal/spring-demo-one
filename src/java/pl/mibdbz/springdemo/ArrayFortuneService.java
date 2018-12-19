
package pl.mibdbz.springdemo;

import java.util.Random;

public class ArrayFortuneService implements FortuneService{

    private String[] tab = new String[]{"First fortune", "second fortune", "third fortune"};
    

    @Override
    public String getFortune() {
        return tab[randomizeFortune()];
    }
    
    private int randomizeFortune(){
        Random generator = new Random();
        int randomNumber = generator.nextInt(tab.length);
        return randomNumber;
    }
    
}
