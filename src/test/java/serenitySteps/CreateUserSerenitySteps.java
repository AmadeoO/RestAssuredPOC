package serenitySteps;

import models.users.CreateUserInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.annotations.Step;
import questions.ResponseCodeQuestion;
import tasks.CreateUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class CreateUserSerenitySteps {
    Actor actor;
    private static final String restApiUrl = "https://reqres.in/api/";

    @Step("connect API")
    public void connectAPI(){
        this.actor = Actor.named("Julian Gonzales")
                .whoCan(CallAnApi.at(restApiUrl));
    }
    @Step("create user and send POST")
    public void postCreateUser(String name, String job) {
        CreateUserInfo userInfo = new CreateUserInfo("morpheus", "TAE");
        this.actor.attemptsTo(
                new CreateUser(userInfo)
        );
    }
    @Step("validate query status ")
    public void validateStatus() {
        actor.should(
                seeThat("status Code", ResponseCodeQuestion.was(), equalTo(201)));
    }
}
