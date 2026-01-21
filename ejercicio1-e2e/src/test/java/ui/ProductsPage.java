package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {
    // Productos específicos (por ID)
    public static final Target SAUCE_LABS_BACKPACK = Target.the("Sauce Labs Backpack")
            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target SAUCE_LABS_BIKE_LIGHT = Target.the("Sauce Labs Bike Light")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));

    public static final Target SAUCE_LABS_BOLT_TSHIRT = Target.the("Sauce Labs Bolt T-Shirt")
            .located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));

    // Icono del carrito
    public static final Target CART_ICON = Target.the("icono del carrito")
            .located(By.className("shopping_cart_link"));

    // Contador del carrito
    public static final Target CART_BADGE = Target.the("contador del carrito")
            .located(By.className("shopping_cart_badge"));
}