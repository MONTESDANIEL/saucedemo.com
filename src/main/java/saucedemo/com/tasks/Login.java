package saucedemo.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import saucedemo.com.model.DataSaucedemo;
import saucedemo.com.userinterface.Interfaces;

public class Login implements Task {
    private DataSaucedemo datos;
    public Login(DataSaucedemo datos) {
        this.datos = datos;
    }
    public static Login elFormulario(DataSaucedemo datos) { return Tasks.instrumented(Login.class, datos); }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.getStruser()).into(Interfaces.USER),
                Enter.theValue(datos.getStrpassw()).into(Interfaces.PASSWORD),
                Click.on(Interfaces.ACCESS)
        );
    }
}
