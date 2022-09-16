package spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyMethod() {
        return "Get daily workout from class TennisCoach which implements Coach interface";
    }
}
