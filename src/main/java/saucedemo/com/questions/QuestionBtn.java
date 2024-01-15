package saucedemo.com.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import saucedemo.com.userinterface.Interfaces;

public class QuestionBtn implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return Interfaces.BTN_VALIDATION.resolveFor(actor).getText();
    }
    public static net.serenitybdd.screenplay.Question<String> value() {return new QuestionBtn();}
}
