package selenium.task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.task.steps.BaseSteps;

public class MarketPage extends BasePage {
    @FindBy (xpath = "//ul[contains(@class,'topmenu__list')]")
    WebElement marketMenu;

    public MarketPage () {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMarketMenuItem (String menuItem) {
        marketMenu.findElement(By.xpath("./li/a[contains(text(),'" + menuItem + "')]")).click();
    }
}
