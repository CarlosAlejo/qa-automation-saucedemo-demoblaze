package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutOverviewPage extends PageObject {
    public static final Target FINISH_BUTTON = Target.the("botón finalizar")
            .located(By.id("finish"));
}
