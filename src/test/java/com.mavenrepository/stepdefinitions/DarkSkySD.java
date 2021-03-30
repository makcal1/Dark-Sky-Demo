package com.mavenrepository.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DarkSkyPage;
import util.HelperMethods;

public class DarkSkySD {

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        String expectedTitle = "Dark Sky - 1 City Hall, New York, NY";
        Assert.assertEquals(expectedTitle, DarkSkyPage.verifyTitle());
    }

    @When("I enter my location")
    public void iEnterMyLocation() {
        DarkSkyPage.enterLocation("Dresden,Germany");
    }

    @And("I click the search button")
    public void iClickTheSearchButton() {
        DarkSkyPage.clickSearchBtn();
    }


    @Then("I see the lowest and highest temperature of my location")
    public void iSeeTheLowestAndHighestTemperatureOfMyLocation() {
        Assert.assertTrue(DarkSkyPage.verifyLowestTemp());
        Assert.assertTrue(DarkSkyPage.verifyHighestTemp());
    }
}