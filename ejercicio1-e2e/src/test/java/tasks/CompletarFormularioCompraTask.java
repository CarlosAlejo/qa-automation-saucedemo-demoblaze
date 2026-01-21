package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.CartPage;
import ui.CheckoutPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletarFormularioCompraTask implements Task {

    private String firstName;
    private String lastName;
    private String postalCode;

    public CompletarFormularioCompraTask(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static CompletarFormularioCompraTask conDatos(String firstName, String lastName, String postalCode) {
        return instrumented(CompletarFormularioCompraTask.class, firstName, lastName, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Hacer clic en checkout
        actor.attemptsTo(
                Click.on(CartPage.CHECKOUT_BUTTON)
        );

        // Completar formulario de información
        actor.attemptsTo(
                Enter.theValue(firstName).into(CheckoutPage.FIRST_NAME),
                Enter.theValue(lastName).into(CheckoutPage.LAST_NAME),
                Enter.theValue(postalCode).into(CheckoutPage.POSTAL_CODE),
                Click.on(CheckoutPage.CONTINUE_BUTTON)
        );
    }
}