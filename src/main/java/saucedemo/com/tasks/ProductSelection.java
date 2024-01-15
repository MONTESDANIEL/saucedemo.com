package saucedemo.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import saucedemo.com.userinterface.Interfaces;

public class ProductSelection implements Task {
    public static ProductSelection productSelection() { return Tasks.instrumented(ProductSelection.class); }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Interfaces.FILTER),
                Hit.the(Keys.ARROW_DOWN).into(Interfaces.FILTER),
                Hit.the(Keys.ARROW_DOWN).into(Interfaces.FILTER),
                Hit.the(Keys.ARROW_DOWN).into(Interfaces.FILTER),
                Hit.the(Keys.ENTER).into(Interfaces.FILTER),
                Click.on(Interfaces.PRODUCT),
                Click.on(Interfaces.ADD_TO_CART),
                Click.on(Interfaces.VIEW_CART)
        );
    }
}
