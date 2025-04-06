package com.upc.prestashop.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepDefinitions {
    @Given("Xavier has an empty basket")
    public void xavier_has_an_empty_basket() {
        System.out.println("Xavier has an empty basket");
    }
    @When("he adds the item {string} to shopping cart")
    public void he_adds_the_item_to_shopping_cart(String string) {
        System.out.println("he adds the item " + string + " to shopping cart");
    }
    @Then("he should see the {string} in the cart with quantity {int}")
    public void he_should_see_the_in_the_cart_with_quantity(String string, Integer int1) {
        System.out.println("he should see the " + string + " in the cart with quantity " + int1);
    }
}
