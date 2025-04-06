package com.upc.prestashop.runners;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Runner class
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.upc.prestashop.stepdefinitions"},
        plugin = {"pretty",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports/Cucumber.html",
                "json:target/cucumber-reports/Cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)
public class CucumberTest {
        @BeforeClass
        public static void setupAllureReports() {
                SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                        .screenshots(true)
                        .savePageSource(true)
                );
        }
}