package demo.screenplay.tasks;

import net.serenitybdd.screenplay.Performable;

public class Buy {
    public static Performable socks(String type){return new BuysSocks(type);}
    public static Performable pants(String color){return new BuysPants(color);}
}
