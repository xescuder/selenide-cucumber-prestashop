package com.upc.prestashop.pages;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    public void addProductToCart() {
        $("div.add > button").click();
    }
}
