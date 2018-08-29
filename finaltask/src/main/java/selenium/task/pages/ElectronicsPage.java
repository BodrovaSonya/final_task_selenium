package selenium.task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.task.steps.BaseSteps;

public class ElectronicsPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class, 'layout-grid__col layout-grid__col_width_2')]")
    WebElement startElement;

    public ElectronicsPage () {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectElement (String element) {
        startElement.findElement(By.xpath(".//a[1][contains(text(), '" + element + "')]")).click();

    }

}
