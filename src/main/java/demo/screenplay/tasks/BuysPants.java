package demo.screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuysPants implements Task {
    private String color;

    public BuysPants(String color){
        this.color = color;
    }
    public BuysPants(){}

    @Override
    @Step("{0} buys #color pants")
    public <T extends Actor> void performAs(T user) {}

    public static BuysPants ofColor(String color){
        return instrumented(BuysPants.class, color);
    }
}
