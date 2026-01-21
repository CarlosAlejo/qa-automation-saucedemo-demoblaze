package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.ProductsPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProductosAlCarritoTask implements Task {

    private int cantidadProductos;

    public AgregarProductosAlCarritoTask(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public static AgregarProductosAlCarritoTask agregar(int cantidad) {
        return instrumented(AgregarProductosAlCarritoTask.class, cantidad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Agregar primer producto (Sauce Labs Backpack)
        actor.attemptsTo(
                Click.on(ProductsPage.SAUCE_LABS_BACKPACK)
        );

        // Agregar segundo producto (Sauce Labs Bike Light)
        if (cantidadProductos > 1) {
            actor.attemptsTo(
                    Click.on(ProductsPage.SAUCE_LABS_BIKE_LIGHT)
            );
        }

        // Agregar tercer producto si es necesario
        if (cantidadProductos > 2) {
            actor.attemptsTo(
                    Click.on(ProductsPage.SAUCE_LABS_BOLT_TSHIRT)
            );
        }
    }
}