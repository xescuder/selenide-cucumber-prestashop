package com.upc.prestashop.pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Home page
 */
public class HomePage {
    public void openPage() {
        open("https://demo.prestapros.com/en/");
        // Accept cookies
        $("#iqitcookielaw-accept").click();
    }
}
