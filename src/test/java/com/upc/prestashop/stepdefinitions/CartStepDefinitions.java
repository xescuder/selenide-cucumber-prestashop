package com.upc.prestashop.stepdefinitions;

import com.upc.prestashop.pages.HomePage;
import com.upc.prestashop.pages.ProductListPage;
import com.upc.prestashop.pages.ProductPage;
import com.upc.prestashop.pages.ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.*;

/**
 * Cart step definitions
 */
public class CartStepDefinitions {
    @Given("Xavier has an empty basket")
    public void i_have_an_empty_basket() {
        // navigate to prestashop
        new HomePage().openPage();
    }

    @When("he/she adds the item {string} to shopping cart")
    public void i_add_item_found_to_shopping_cart(String productName) {
        ProductListPage productListPage = new ProductListPage();
        productListPage.searchProduct(productName);
        productListPage.selectProduct(productName);

        ProductPage productPage = new ProductPage();
        productPage.addProductToCart();
    }

    @Then("he/she should see the {string} in the cart with quantity {int}")
    public void i_should_see_the_item_in_the_cart(String item, int quantity) {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.openPage();
        int productQty = shoppingCartPage.getProductQty(item);
        assertThat(productQty).isEqualTo(quantity);
    }
}

