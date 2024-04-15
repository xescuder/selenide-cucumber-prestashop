package com.upc.prestashop.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

/**
 * Shopping cart page
 */
public class ShoppingCartPage extends TemplatePage {
    private static final String PRODUCT_ITEM_NAME = "ul.cart-items li.cart-item .product-line-info a";
    private static final String PRODUCT_ITEM_QTY = ".qty input";

    public void openPage() {
        open("https://demo.prestapros.com/en/cart");
    }

    // Obtain all cart items
    public int getProductQty(String productName) {
        SelenideElement element = $$(PRODUCT_ITEM_NAME).findBy(exactText(productName));
        SelenideElement row = element.ancestor("li");
        String qtyText = row.$(PRODUCT_ITEM_QTY).getValue();
        return Integer.parseInt(qtyText);
    }
}
