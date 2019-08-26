package demo.cucumber.steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.screenplay.questions.MoneyLeft;
import demo.screenplay.tasks.Buy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Assert;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class DemoStepDefs {
    private Actor user;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        user = Actor.named("user A").describedAs("Money waster");
    }
    @Given("^user A goes shopping$")
    public void userAGoesShopping() {
        user.attemptsTo();
    }

    @When("^user A buys socks$")
    public void userABuysSocks() {
        user.attemptsTo(Buy.socks("No-show"));
    }


    @Then("^user A has no money left$")
    public void userAHasNoMoneyLeft() {
        user.should(seeThat(MoneyLeft.isZero(), equalTo("No money left")));
    }

    @When("^user A buys pants$")
    public void userABuysPants() {
        user.attemptsTo(Buy.pants("Navy-blue"));
    }

    @Then("^user A has a lot of money left$")
    public void userAHasALotOfMoneyLeft() {
        user.should(seeThat(MoneyLeft.isATon(), equalTo("A lot of money left")));
    }
}
