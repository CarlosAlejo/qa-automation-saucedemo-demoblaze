Feature: Flujo de compra en SauceDemo

  Scenario: Compra exitosa con dos productos
    Given el usuario inicia sesion
    When agrega dos productos al carrito
    And visualiza el carrito
    And completa el formulario de compra
    When finaliza la compra
    Then visualiza el mensaje "Thank you for your order!"
