package com.upc.prestashop.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Product list page
 */
public class ProductListPage extends TemplatePage {
    private static final String PRODUCT_ITEM_NAME = "article .product-description a";
    public void searchProduct(String productName) {
        header.searchProduct(productName);
    }

    public void selectProduct(String productName) {
        $$(byCssSelector(PRODUCT_ITEM_NAME)).findBy(text(productName)).click();
    }
}
