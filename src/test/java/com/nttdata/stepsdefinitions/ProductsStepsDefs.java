package com.nttdata.stepsdefinitions;

import com.nttdata.screens.ProductsScreen;
import com.nttdata.steps.BuySteps;
import com.nttdata.steps.ProductsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsStepsDefs {

    @Steps
    ProductsSteps productsSteps;
    ProductsScreen productsScreen;
    private WebDriver driver;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoy_en_la_aplicación_de_sauce_labs() {

    }
    @And("valido que carguen correctamente los productos en la galeria")
    public void valido_que_carguen_correctamente_los_productos_en_la_galeria() {
        productsSteps.validatePage();

    }






}
