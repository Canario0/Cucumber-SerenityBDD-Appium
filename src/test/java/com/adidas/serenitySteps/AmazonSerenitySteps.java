package com.adidas.serenitySteps;

import com.adidas.pageObjects.HomeScreen;
import com.adidas.pageObjects.ProductClassesScreen;
import net.thucydides.core.annotations.Step;

public class AmazonSerenitySteps {
    private HomeScreen amazonHome;
    private ProductClassesScreen classesScreen;

    @Step("Given that I'm in amazon's app")
    public void im_amazons_app(){
//        amazonHome.open();
        amazonHome.checkApp();
    }

    @Step("When I click on the menu buttom")
    public void click_menu_button(){
        amazonHome.menuButtom();
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
}
