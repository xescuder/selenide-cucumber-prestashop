package com.upc.prestashop.pages;

import static com.codeborne.selenide.Selenide.$;

/**
 * Product page
 */
public class ProductPage {
    public void addProductToCart() {
        $("div.add > button").click();
    }
}
