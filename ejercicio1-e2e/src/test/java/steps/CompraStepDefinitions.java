package steps;


import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class CompraStepDefinitions {

    WebDriver driver;
    Actor usuario;

    @Before
    public void setUp() {
        // Configurar Firefox Driver automáticamente
        io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();

        // Configurar opciones de Firefox
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        // Crear instancia del driver
        driver = new FirefoxDriver(options);

        // Inicializar el actor
        usuario = Actor.named("Usuario");
        usuario.can(BrowseTheWeb.with(driver));
    }

    @Given("el usuario inicia sesion")
    public void elUsuarioIniciaSesion() {
        usuario.attemptsTo(
                Open.url("https://www.saucedemo.com/"),
                Enter.theValue("standard_user").into(org.openqa.selenium.By.id("user-name")),
                Enter.theValue("secret_sauce").into(org.openqa.selenium.By.id("password")),
                Click.on(org.openqa.selenium.By.id("login-button"))
        );
    }

    @When("agrega dos productos al carrito")
    public void agregaDosProductosAlCarrito() {
        // Agregar primer producto
        usuario.attemptsTo(
                Click.on(org.openqa.selenium.By.id("add-to-cart-sauce-labs-backpack"))
        );

        // Agregar segundo producto
        usuario.attemptsTo(
                Click.on(org.openqa.selenium.By.id("add-to-cart-sauce-labs-bike-light"))
        );

        // Verificar que hay 2 productos en el carrito
        try {
            usuario.should(
                    seeThat(Text.of(org.openqa.selenium.By.className("shopping_cart_badge")),
                            equalTo("2"))
            );
        } catch (Exception e) {
            System.out.println("No se pudo verificar el contador del carrito, continuando...");
        }
    }

    @And("visualiza el carrito")
    public void visualizaElCarrito() {
        usuario.attemptsTo(
                Click.on(org.openqa.selenium.By.className("shopping_cart_link"))
        );
    }

    @And("completa el formulario de compra")
    public void completaElFormularioDeCompra() {
        // Click en Checkout
        usuario.attemptsTo(
                Click.on(org.openqa.selenium.By.id("checkout"))
        );

        // Completar formulario
        usuario.attemptsTo(
                Enter.theValue("Carlos").into(org.openqa.selenium.By.id("first-name")),
                Enter.theValue("Pérez").into(org.openqa.selenium.By.id("last-name")),
                Enter.theValue("12345").into(org.openqa.selenium.By.id("postal-code")),
                Click.on(org.openqa.selenium.By.id("continue"))
        );
    }

    @When("finaliza la compra")
    public void finalizaLaCompra() {
        usuario.attemptsTo(
                Click.on(org.openqa.selenium.By.id("finish"))
        );
    }

    @Then("visualiza el mensaje {string}")
    public void visualizaElMensaje(String mensajeEsperado) {
        usuario.should(
                seeThat(Text.of(org.openqa.selenium.By.className("complete-header")),
                        equalTo(mensajeEsperado))
        );
    }

    // Método para cerrar el navegador después de cada prueba
    @io.cucumber.java.After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}