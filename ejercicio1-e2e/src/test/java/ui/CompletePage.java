package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletePage {
    public static final Target THANK_YOU_MESSAGE = Target.the("mensaje de agradecimiento")
            .located(By.className("complete-header"));

    public static final Target COMPLETE_TEXT = Target.the("texto de completado")
            .located(By.className("complete-text"));

    public static final Target BACK_HOME_BUTTON = Target.the("botón volver a inicio")
            .located(By.id("back-to-products"));
}