package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.model.domain.screenshots.Screenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static net.serenitybdd.core.Serenity.takeScreenshot;


public class ProductsScreen extends PageObject{


    @AndroidFindBy(xpath = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement lblProducto;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement productItem1;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement productItem2;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bike Light\"]")
    private WebElement productItem3;


    public String isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(lblProducto));
        try {
            return lblProducto.getText();
        }
        catch (NoSuchElementException e) {
            System.out.println("ERROR: no se encontro el elemento Xptah: com.saucelabs.mydemoapp.android:id/productTV");
            return "ERROR: no se encontro el elemento Xptah: com.saucelabs.mydemoapp.android:id/productTV";
        }
    }

    public void clickProduct(String nameProduct) {

        switch (nameProduct) {
            case "Sauce Labs Backpack":
                try {
                    productItem1.click();
                }
                catch (NoSuchElementException e) {
                    System.out.println("ERROR: no se encontro el elemento Xptah: //android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]");
                }

                break;
            case "Sauce Labs Bolt - T-Shirt":
                try {
                    productItem2.click();
                }
                catch (NoSuchElementException e) {
                    System.out.println("ERROR: no se encontro el elemento Xptah: //android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bolt T-Shirt\"]");
                }
                break;
            case "Sauce Labs Bike Light":
                try {
                    productItem3.click();
                }
                catch (NoSuchElementException e) {
                    System.out.println("ERROR: no se encontro el elemento Xptah: //android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\" and @text=\"Sauce Labs Bike Light\"]");
                }
                break;
            default: System.out.println("ERROR: NO SE ENCUENTRA PRODUCTO");

        }
    }




}
