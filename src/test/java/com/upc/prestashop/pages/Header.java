package com.upc.prestashop.pages;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class Header {
    public static String SEARCH_FIELD_NAME = "s";

    /**
     * Search product by term
     * @param term Term to search
     */
    public void searchProduct(String term) {
        $(byName(SEARCH_FIELD_NAME)).clear();
        $(byName(SEARCH_FIELD_NAME)).setValue(term).pressEnter();
    }
}
