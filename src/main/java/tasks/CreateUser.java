package tasks;

import interactions.Post;
import io.restassured.http.ContentType;
import models.users.CreateUserInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateUser implements Task {
    private static CreateUserInfo userInfo;
    public CreateUser(CreateUserInfo userInfo){
        CreateUser.userInfo = userInfo;
    }

    public static Performable withInfo(String userInfo){
        return instrumented(CreateUser.class, userInfo);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to("models/users").with(
                        requestSpecification -> requestSpecification.
                                contentType(ContentType.JSON).
                                body(userInfo)
                )
        );

    }
}
