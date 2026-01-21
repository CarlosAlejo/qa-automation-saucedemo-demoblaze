package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target CHECKOUT_BUTTON = Target.the("botón checkout")
            .located(By.id("checkout"));

    public static final Target CART_ITEMS = Target.the("items en el carrito")
            .located(By.className("cart_item"));

    public static final Target CONTINUE_SHOPPING = Target.the("botón continuar comprando")
            .located(By.id("continue-shopping"));
}