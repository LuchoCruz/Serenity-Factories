package demo.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class TheresNoMoney implements Question<String>{
    public TheresNoMoney(){}

    public static TheresNoMoney zero(){
        return new TheresNoMoney();
    }

    @Override
    @Step("{0} has no money left")
    public String answeredBy(Actor actor) {
        return "No money left";
    }

}
