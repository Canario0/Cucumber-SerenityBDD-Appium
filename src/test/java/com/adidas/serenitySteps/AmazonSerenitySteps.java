package com.adidas.serenitySteps;

import com.adidas.pageObjects.HomeScreen;
import com.adidas.pageObjects.ProductClassesScreen;
import com.adidas.pageObjects.ResultsScreen;
import net.thucydides.core.annotations.Step;

public class AmazonSerenitySteps {
    private HomeScreen amazonHome;
    private ProductClassesScreen classesScreen;
    private ResultsScreen resultsScreen;

    @Step("Given that I'm in amazon's app")
    public void im_amazons_app(){
//        amazonHome.open();
        amazonHome.checkApp();
    }

    @Step("When I click on the menu buttom")
    public void click_menu_button(){
        amazonHome.menuButton();
    }

    @Step("And click on Buscar por Departamento")
    public void click_on_search_by_department() {
        amazonHome.searchByDepartments();
    }

    @Step("And select \"<department>\"")
    public void i_select_department(String option) {
        classesScreen = amazonHome.selectDepartment(option);
    }

    @Step("Then I should see \"<section>\"")
    public void i_should_see(String option) {
        classesScreen.checkProductClasses(option);
    }

    @Step("When I type \"<product>\" and enter")
    public void i_type_and_enter(String product) {
       resultsScreen =  amazonHome.typeAndSearch(product);
    }

    @Step("Then I check that there is a product with \"<brand>\"")
    public void check_that_i_enter_with(String brand) {
        resultsScreen.checkBrand(brand);
    }
}
