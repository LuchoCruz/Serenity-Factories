package demo.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuysSocks implements Task {
    private String type;//Low cut, No-show, Executive
    public BuysSocks(String type){
        this.type = type;
    }
    public BuysSocks(){}

    @Override
    @Step("{0} buys #type socks")
    public <T extends Actor> void performAs(T user) {}

    public static BuysSocks ofType(String type){
        return instrumented(BuysSocks.class, type);
    }

}
