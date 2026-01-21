package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.ProductsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerCarritoTask implements Task {

    public static VerCarritoTask ver() {
        return instrumented(VerCarritoTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Hacer clic en el icono del carrito
        actor.attemptsTo(
                Click.on(ProductsPage.CART_ICON)
        );
    }
}