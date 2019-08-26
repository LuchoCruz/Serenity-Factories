package demo.screenplay.tasks;

import net.serenitybdd.screenplay.Task;

public class Buy {
    public static Task socks(String type){return new BuysSocks(type);}
    public static Task pants(String color){return new BuysPants(color);}
}
