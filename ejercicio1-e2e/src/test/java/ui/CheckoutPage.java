package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    // Información personal
    public static final Target FIRST_NAME = Target.the("campo nombre")
            .located(By.id("first-name"));

    public static final Target LAST_NAME = Target.the("campo apellido")
            .located(By.id("last-name"));

    public static final Target POSTAL_CODE = Target.the("campo código postal")
            .located(By.id("postal-code"));

    // Botones
    public static final Target CONTINUE_BUTTON = Target.the("botón continuar")
            .located(By.id("continue"));

    public static final Target CANCEL_BUTTON = Target.the("botón cancelar")
            .located(By.id("cancel"));

    // Resumen del pedido
    public static final Target FINISH_BUTTON = Target.the("botón finalizar")
            .located(By.id("finish"));
}