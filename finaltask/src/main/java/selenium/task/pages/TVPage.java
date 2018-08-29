package selenium.task.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.task.steps.BaseSteps;

import java.util.List;

public class TVPage extends ProductPage {
    @FindBy(xpath = "(//div[contains(@class,'n-snippet-card2__title')]/a)")
    List<WebElement> foundTVs;

    public static String firstTV;

    public TVPage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void checkCountElements(String expected) {
        String actualCount = String.valueOf(foundTVs.size());
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualCount, expected),actualCount.contains(expected));
        System.out.println("Ожидалось: " + expected);
        System.out.println("Получено: " + actualCount);
    }

    public void rememberFirstElement() {
        firstTV = foundTVs.get(0).getText();
        System.out.println("Первый запомненный элемент: " + firstTV);
    }

    public void searchFirstTV(){
        searchFirstElement(firstTV);
    }

    public void checkElement() {
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", TVHeader.getText(), firstTV),TVHeader.getText().contains(firstTV));
    }
}
