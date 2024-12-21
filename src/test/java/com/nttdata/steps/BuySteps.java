package com.nttdata.steps;

import com.nttdata.screens.BuyScreen;
import org.openqa.selenium.By;

public class BuySteps {

    BuyScreen buyScreen;

    public void addUnits(String units){
        buyScreen.clickIncrease(units);
    }

    public void clickShoppingCarts(){
        buyScreen.clickBtnAddToCart();
    }

    public void cartEntry() {
        buyScreen.clickCartEntry();
    }
}
