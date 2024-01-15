#Autor: Daniel Amaya Montes

  Feature: Automatizacion saucedemo
    Como usuario de la pagina saucedemo
    quiero realizar el login
    filtrar los productos por precio "(high to low)"
    seleccionar el producto “Sauce Labs Fleece Jacket”
    y añadirlo al carrito

  @General
    Scenario:Agregar un producto al carrito
    Given El usuario accede al sitio web saucedemo.com
    When Se realiza el login
      | struser       | strpassw     |
      | standard_user | secret_sauce |
    And Se filtra, selecciona y agrega el producto al carrito
    Then Se verifica la realizacion del proceso