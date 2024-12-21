package com.nttdata.steps;

import com.nttdata.screens.CartScreen;
import net.serenitybdd.annotations.Steps;
import org.htmlunit.corejs.javascript.regexp.SubString;
import org.junit.Assert;

public class CartSteps {

    @Steps
    CartScreen cartScreen;

    public void validateUnidsItem(String unids) {
        Assert.assertEquals("Mensaje de error", unids,(cartScreen.validateNumberItem()).substring(0,1));

    }

    public void validateNameProduct(String nameProduct) {
        Assert.assertEquals("Mensaje de error", nameProduct,cartScreen.validateNameProduct());
    }
}
