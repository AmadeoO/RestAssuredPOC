package facts;


import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.facts.Fact;
import net.serenitybdd.screenplay.rest.interactions.Get;
import org.codehaus.groovy.util.ListHashMap;

import java.util.HashMap;
import java.util.List;

public class NetflixPlans implements Fact {
    private String listNamePlans;

    public static NetflixPlans toViewSeries(){
        return new NetflixPlans();
    }
    @Override
    public void setup(Actor actor) {
        actor.attemptsTo(
                Get.resource("plans")
        );

        List<HashMap<String,String>> listPlans = SerenityRest.lastResponse().path("data");
        actor.remember("plans", listPlans);
        this.listNamePlans = listPlans.toString();
    }

    public String toString(){
        return "Los planes son" + this.listNamePlans;
    }
}