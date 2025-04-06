package com.upc.prestashop.stepdefinitions;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class CartStepDefinitions {

    @Given("Xavier has an empty basket")
    public void xavier_has_an_empty_basket() {
        open("https://demo.prestapros.com/en/");
        // Accept cookies
        $("#iqitcookielaw-accept").click();
    }

    @When("he adds the item {string} to shopping cart")
    public void he_adds_the_item_to_shopping_cart(String itemName) {
        // Search
        $(byName("s")).clear();
        $(byName("s")).setValue(itemName).pressEnter();
        // Select product
        $$(byCssSelector("article .product-description a")).findBy(text(itemName)).click();
        // Add to cart
        $(".product-information").scrollIntoView(true);
        $("button.add-to-cart").shouldBe(visible);
        $("button.add-to-cart").click();
        Selenide.sleep(2000);
    }

    @Then("he should see the {string} in the cart with quantity {int}")
    public void he_should_see_the_in_the_cart_with_quantity(String itemName, Integer qty) {
        open("https://demo.prestapros.com/en/cart");
        SelenideElement element = $$("ul.cart-items li.cart-item .product-line-info a").
                findBy(exactText(itemName));
        SelenideElement row = element.ancestor("li");
        row.$(".qty input").shouldHave(value(String.valueOf(qty+1)));
        /*String qtyText = row.$(".qty input").getValue();
        assertThat(Integer.parseInt(qtyText)).isEqualTo(2);*/
    }
}
