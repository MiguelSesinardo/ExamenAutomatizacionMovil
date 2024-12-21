package com.nttdata.steps;

import com.nttdata.screens.ProductsScreen;
import net.thucydides.model.domain.screenshots.Screenshot;
import org.junit.Assert;

public class ProductsSteps {

    ProductsScreen productsScreen;

    public void validatePage(){

        Assert.assertEquals("Products",productsScreen.isProductDisplayed());

    }

    public void addProduct(String nameProduct){
        productsScreen.clickProduct(nameProduct);
    }



}
