package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Steps;
import serenitySteps.CreateUserSerenitySteps;

public class CreateUserStepDefinition {
    @Steps
    CreateUserSerenitySteps createUser;
    Actor actor;
//    private static final String restApiUrl = "http://localhost:5000/api/";

    @Given("^a user who want uses the application")
    public void aUserWhoWantUsesTheApplication() {
        createUser.connectAPI();
    }

    @When("^sent your information for create account")
    public void sentYourInformationForCreateAccount() {
        ValidatableResponse responseCreateUser;
        createUser.postCreateUser("morpheus", "TAE");
    }

    @Then("^create account user successfully")
    public void createAccountUserSuccessfully() {
        createUser.validateStatus();
    }
}
