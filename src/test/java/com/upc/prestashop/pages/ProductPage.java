package com.upc.prestashop.pages;

import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * Product page
 */
public class ProductPage {
    private static final String ADD_TO_CART_BUTTON = "button.add-to-cart";

    public void addProductToCart() {
        $(".product-information").scrollIntoView(true);
        $(ADD_TO_CART_BUTTON).shouldBe(visible);
        $(ADD_TO_CART_BUTTON).click();
        Selenide.sleep(2000);
    }
}
