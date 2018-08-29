package selenium.task.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.task.steps.BaseSteps;

public class BasePage {

    public void fillField(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public void waitElement (WebElement element) {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 30, 1000);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}