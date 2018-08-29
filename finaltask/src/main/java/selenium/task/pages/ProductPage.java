package selenium.task.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.task.steps.BaseSteps;

public class ProductPage extends BasePage {
    @FindBy(xpath = "//*[contains(@class, 'layout__col i-bem exp-filters-new-design layout__col_search-filters_visible')]")
    WebElement filterPanel;

    @FindBy(xpath = "//*[contains(@class, 'header2__main-content')]")
    WebElement mainPanel;

    @FindBy(xpath = "//*[contains(@class,'n-title__text')]")
    WebElement TVHeader;


    String firstPage = "";

    public ProductPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillFilter(String value) {
        WebElement element = filterPanel.findElement(By.xpath(".//input[contains(@name, 'glf-pricefrom-var')]"));
        fillField(element, value);
    }

    public void fillProducerCheckBox(String producer) {
        filterPanel.findElement(By.xpath(".//*[contains(@class,'checkbox__label')][contains(text(),'" + producer + "')]")).click();
    }

    public void apply() {
        firstPage = BaseSteps.getDriver().findElement(By.tagName("body")).getAttribute("data-reqid-chain");
        filterPanel.findElement(By.xpath(".//button[contains(@class,'button_action_n-filter-apply')]")).click();
        waitPage();
    }


    public void searchFirstElement(String element) {
        firstPage = BaseSteps.getDriver().findElement(By.tagName("body")).getAttribute("data-reqid-chain");
        WebElement searchField = mainPanel.findElement(By.xpath(".//*[contains(@name,'text')]"));
        fillField(searchField, element);
        mainPanel.findElement(By.xpath(".//button[contains(@type,'submit')]")).click();
        waitPage();
    }

    public void waitPage(){
        WebDriverWait wait = new WebDriverWait(BaseSteps.getDriver(), 30);
        wait.until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                WebElement element = driver.findElement(By.tagName("body"));
                if(firstPage.equals(element.getAttribute("data-reqid-chain")))
                    return false;
                else
                    return true;
            }
        });
    }

}