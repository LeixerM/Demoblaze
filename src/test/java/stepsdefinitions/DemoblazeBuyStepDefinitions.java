package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.NavigateTo;
import tasks.addProducts;
import utils.ReadJson;

import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DemoblazeBuyStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("the user is on the Demoblaze homepage")
    public void theUserIsOnTheDemoblazeHomepage() {
        theActorCalled("User").wasAbleTo(NavigateTo.navigatePageDemoBlaze());
    }

    @When("they add products to the cart")
    public void theyAddProductsToTheCart() {
        theActorInTheSpotlight().attemptsTo(
                addProducts.buyProduct(),
                addProducts.theShoppingCart()
        );
    }
    @Then("they successfully complete the purchase of the products")
    public void theySuccessfullyCompleteThePurchaseOfTheProducts() {
        Map<String, String> allData = ReadJson.getTestData("form");

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("the purchase was successful", questions.BuySucessfullDemoBlaze.validateBuy(allData),
                        org.hamcrest.Matchers.is(true))
        );

    }
}
