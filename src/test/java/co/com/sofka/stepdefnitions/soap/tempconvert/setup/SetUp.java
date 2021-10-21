package co.com.sofka.stepdefnitions.soap.tempconvert.setup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.LastResponse;
import org.apache.log4j.PropertyConfigurator;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;

import static co.com.sofka.util.Log4jValues.LOG4J_PROPERTIES_FILE_PATH;

public class SetUp {
    protected static final String URL_BASE = "https://www.w3schools.com/xml";
    protected static final String RESOURCE = "/tempconvert.asmx";
    protected String bodyRequest;
    protected Actor actor;
    protected static final String USER_DIR = System.getProperty("user.dir");

    private void setUpActor(){
        actor = Actor.named("Antonio");
    }

    private void setUpActorAndApi(){
        actor.can(CallAnApi.at(URL_BASE));
    }

    protected void setUp(){
        setUpLog4j2();
        setUpActor();
        setUpActorAndApi();
    }

    protected HashMap<String, Object> headers(){
        HashMap<String, Object> headersCollection = new HashMap<>();
        headersCollection.put("Content-Type", "text/xml;charset=UTF-8");
        headersCollection.put("SOAPAction", "https://www.w3schools.com/xml/CelsiusToFahrenheit");
        return headersCollection;
    }

    protected String fromLastResponseBy(Actor actor){
        return  new String(
                LastResponse.received().answeredBy(actor).asByteArray(),
                StandardCharsets.UTF_8
        );
    }

    protected void setUpLog4j2(){
        PropertyConfigurator.configure( USER_DIR+ LOG4J_PROPERTIES_FILE_PATH.getValue());
    }
}
