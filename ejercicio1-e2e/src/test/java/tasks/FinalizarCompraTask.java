package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.CheckoutPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinalizarCompraTask implements Task {

    public static FinalizarCompraTask finalizar() {
        return instrumented(FinalizarCompraTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Hacer clic en finalizar
        actor.attemptsTo(
                Click.on(CheckoutPage.FINISH_BUTTON)
        );
    }
}