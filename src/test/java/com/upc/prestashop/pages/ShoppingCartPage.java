package com.upc.prestashop.pages;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

public class ShoppingCartPage extends TemplatePage {
    public void open() {
        header.openCart();
    }

    // Obtain all cart items
    public int getProductQty(String productName) {
        String qtyText = $$("ul.cart-items li.cart-item").findBy(exactText(productName)).find(".js-cart-line-product-quantity").getText();
        return Integer.parseInt(qtyText);
    }
}
