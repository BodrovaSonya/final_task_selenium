package selenium.task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.task.steps.BaseSteps;
import selenium.task.steps.MainSteps;

public class MainPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class, 'home-arrow__tabs')]")
    WebElement menu;

    public MainPage(){
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
    public void selectMenuItem (String menuItem){
        menu.findElement(By.xpath(".//*[contains(text(), '" + menuItem + "')]")).click();
    }
}
