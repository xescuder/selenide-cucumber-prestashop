package com.upc.prestashop.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$$;

public class ProductListPage extends TemplatePage {
    public void searchProduct(String productName) {
        header.searchProduct(productName);
    }

    public void selectProduct(String productName) {
        $$(byCssSelector("ul.cart-items li.cart-item")).findBy(text(productName)).click();
    }
}
