package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BuyScreen extends PageObject {

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/plusIV")
    private WebElement btnIncrease;

    @AndroidFindBy(id="com.saucelabs.mydemoapp.android:id/cartBt")
    private WebElement btnAddToCart;

    @AndroidFindBy(id="com.saucelabs.mydemoapp.android:id/cartIV")
    private WebElement btnCartEntry;

    public void clickIncrease(String units){
        waitFor(ExpectedConditions.visibilityOf(btnIncrease));
        int totalClick = Integer.parseInt(units);
        for (int i=1; i<totalClick;i++){
            btnIncrease.click();
        }
    }

    public void clickBtnAddToCart(){
        waitFor(ExpectedConditions.visibilityOf(btnAddToCart));
        btnAddToCart.click();
    }

    public void clickCartEntry() {
        waitFor(ExpectedConditions.visibilityOf(btnCartEntry));
        btnCartEntry.click();
    }
}
