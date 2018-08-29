package selenium.task.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScenarioSteps {
    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    ElectronicsSteps electronicsSteps = new ElectronicsSteps();
    ProductSteps productSteps = new ProductSteps();
    TVSteps tvSteps = new TVSteps();
    EarphoneSteps earphoneSteps = new EarphoneSteps();


    @When(value = "^выбран элемент главного меню \"(.+)\"$")
    public void selectMainMenuItem (String menuItem){
        mainSteps.selectMenuItem(menuItem);
    }

    @When("^выбран элемент меню \"(.+)\"$")
    public void selectMarketMenuItem(String menuItem) {
        marketSteps.selectMarketMenuItem(menuItem);
    }

    @When("^выбрана категория товара \"(.+)\"$")
    public void selectCategory (String category){
        electronicsSteps.selectElement(category);
    }

    @When("^заполнен фильтр цены от \"(.+)\"$")
    public void fillFilter (String value) {
        productSteps.fillFilter(value);
    }

    @When("^заполнен фильтр производителей товара \"(.+)\"$")
    public void fillProducerFilter (String producer) {
        productSteps.fillProducerCheckBox(producer);
    }

    @When ("^нажата кнопка применения фильтров")
    public void applyFilter(){
        productSteps.apply();
    }

    @Then("^проверено число телевизоров на странице, которое должно быть равно \"(.+)\"$")
    public void checkTVsCount (String expected) {
        tvSteps.checkCountElements(expected);
    }

    @Then("^проверено число наушников на странице, которое должно быть равно \"(.+)\"$")
    public void checkEPcounts (String expected) {
        earphoneSteps.checkCountElements(expected);
    }

    @Then("^запомнено название первого телевизора в списке")
    public void rememberFirstTV() {
        tvSteps.rememberFirst();
    }

    @Then("^запомнено название первых наушников в списке")
    public void rememberFirstEP() {
        earphoneSteps.rememberFirst();
    }

    @When("^произведен поиск по первому телевизору")
    public void searchTV() {
        tvSteps.searchElement();
    }

    @When("^произведен поиск по первым наушникам")
    public void searchEarphone() {
        earphoneSteps.searchElement();
    }

    @Then("^проверено значение заголовка телевизора с запомненным значением")
    public void checkTV(){
        tvSteps.checkElement();
    }

    @Then("^проверено значение заголовка наушников с запомненным значением")
    public void checkElement(){
        earphoneSteps.checkElement();
    }
}
