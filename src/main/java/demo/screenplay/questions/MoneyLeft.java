package demo.screenplay.questions;

import net.serenitybdd.screenplay.Question;

public class MoneyLeft {
    public static Question<String> isZero(){return new TheresNoMoney();}
    public static Question<String> isATon(){return new TheresATonOfMoney();}
}
