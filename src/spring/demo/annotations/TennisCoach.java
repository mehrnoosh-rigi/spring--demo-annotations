package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    private FortuneService fortuneService;

    //define default constructor
    public TennisCoach(){
        System.out.println("TennisCoach: inside default constructor");
    }

    // define setter method
    @Autowired
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println("TennisCoach: inside setFortuneService");
        this.fortuneService = theFortuneService;
    }

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService){
//
//        this.fortuneService = theFortuneService;
//    }
    @Override
    public String getDailyMethod() {
        return "Get daily method from class TennisCoach which implements Coach interface";
    }

    @Override
    public String getDailyFortune() {
        return "Get daily fortune from class TennisCoach which implements Coach interface " + fortuneService.getFortune();
    }

}
