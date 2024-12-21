package com.nttdata.stepsdefinitions;

import com.nttdata.steps.BuySteps;
import com.nttdata.steps.ProductsSteps;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class BuyStepsDefs {

    @Steps
    ProductsSteps productsSteps;
    BuySteps buySteps;

    @When("agrego {string} del siguiente producto {string}")
    public void agrego_unidades_del_siguiente_producto(String units ,String nameProduct) {
        productsSteps.addProduct(nameProduct);
        buySteps.addUnits(units);
        buySteps.clickShoppingCarts();

    }
}
