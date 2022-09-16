package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "In Happy fortune service: getFortune()";
    }



}
