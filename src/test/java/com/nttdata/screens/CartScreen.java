package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartScreen extends PageObject {

    @AndroidFindBy (id = "com.saucelabs.mydemoapp.android:id/itemsTV")
    private WebElement numberItems;

    @AndroidFindBy (id = "com.saucelabs.mydemoapp.android:id/titleTV")
    private WebElement nameProduct;

    public String validateNumberItem(){
        waitFor(ExpectedConditions.visibilityOf(numberItems));
        try {
            return numberItems.getText();
        }
        catch (NoSuchElementException e) {
            System.out.println("ERROR: no se encontro el elemento Xptah: com.saucelabs.mydemoapp.android:id/itemsTV");
            return "ERROR: no se encontro el elemento Xptah: com.saucelabs.mydemoapp.android:id/itemsTV";
        }

    }

    public String validateNameProduct(){
        waitFor(ExpectedConditions.visibilityOf(nameProduct));
        try {
            return nameProduct.getText();
        }
        catch (NoSuchElementException e) {
            System.out.println("ERROR: no se encontro el elemento Xptah: com.saucelabs.mydemoapp.android:id/titleTV");
            return "ERROR: no se encontro el elemento Xptah: com.saucelabs.mydemoapp.android:id/titleTV";
        }
    }

}
