package soapTest;

import interactions.Post;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashMap;

@RunWith(SerenityRunner.class)
public class FirstTestSoap {
    private static final String URL_BASE = "https://www.dataaccess.com/";


    @Test
    public void numberToWordTest() {
        String resource = "webservicesserver/NumberConversion.wso";
        HashMap<String, Object> headers = new HashMap<>();
        headers.put("Content-Type", "text/xml; charset=utf-8");

        Actor actor = Actor.named("Jualian");
        actor.can(CallAnApi.at(URL_BASE));
        String bodyRequest = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Body>\n" +
                "    <NumberToWords xmlns=\"http://www.dataaccess.com/webservicesserver/\">\n" +
                "      <ubiNum>500</ubiNum>\n" +
                "    </NumberToWords>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>");

        actor.attemptsTo(
                Post.to(resource)
                        .with(
                                requestSpecification -> requestSpecification.headers(headers)
                                        .body(bodyRequest)
                       )
        );

        System.out.println(LastResponse.received().answeredBy(actor).asString());
    }
}
