package com.adidas.gherkinDefinitions;

import com.adidas.serenitySteps.AmazonSerenitySteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AmazonFindBy {
    @Steps
    private AmazonSerenitySteps userSteps;

    @Given("^that I'm in amazon's app$")
    public void thatIMInAmazonSApp() {
        // Write code here that turns the phrase above into concrete actions
        userSteps.im_amazons_app();
    }

    @When("^I click on the menu buttom$")
    public void iClickOnTheMenuBottom() {
        // Write code here that turns the phrase above into concrete actions
        userSteps.click_menu_button();
    }

    @And("^click on Buscar por Departamento$")
    public void clickOn() {
        userSteps.click_on_search_by_department();
    }

    @And("^select \"([^\"]*)\"$")
    public void select(String option) {
        userSteps.i_select_department(option);
    }

    @Then("^I should see \"([^\"]*)\" and enable$")
    public void iShouldSee(String option) {
        userSteps.i_should_see(option);
    }

    @When("^I type \"([^\"]*)\" and enter$")
    public void iInput(String product){
        userSteps.i_type_and_enter(product);
    }

    @Then("^I check that there is a product with \"([^\"]*)\"$")
    public void iCheckThatThereIsAProductWith(String brand) {
        userSteps.check_that_i_enter_with(brand);
    }
}
