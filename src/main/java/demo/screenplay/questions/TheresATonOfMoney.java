package demo.screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.thucydides.core.annotations.Step;

public class TheresATonOfMoney implements Question<String> {
    public TheresATonOfMoney(){}

    public static TheresATonOfMoney left(){
        return new TheresATonOfMoney();
    }

    @Override
    @Step("{0} has a ton of money left")
    public String answeredBy(Actor actor) {
        return "A lot of money left";
    }
}
