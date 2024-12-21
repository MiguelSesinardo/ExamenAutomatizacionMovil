package com.nttdata.stepsdefinitions;

import com.nttdata.steps.BuySteps;
import com.nttdata.steps.CartSteps;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class CartStepsDefs {

    @Steps
    BuySteps buySteps;
    CartSteps cartSteps;


    @Then("valido el carrito de compra actualice correctamente {string} y {string}")
    public void validoElCarritoDeCompraActualiceCorrectamenteY(String unids, String nameProduct) {
        buySteps.cartEntry();
        cartSteps.validateUnidsItem(unids);
        cartSteps.validateNameProduct(nameProduct);
    }
}
