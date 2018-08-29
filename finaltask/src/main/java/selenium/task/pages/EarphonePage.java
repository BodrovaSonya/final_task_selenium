package selenium.task.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.task.steps.BaseSteps;

import java.util.List;

public class EarphonePage extends ProductPage{
    @FindBy(xpath = "(//div[contains(@class,'n-snippet-cell2__title')]/a)")
    List<WebElement> filterFoundEarphones;

    @FindBy(xpath = "//*[contains(@class, 'n-snippet-cell2__title')]//a[1]")
    WebElement foundEarphones;

    public static String firstEarphone;

    public EarphonePage(){
        PageFactory.initElements(BaseSteps.getDriver(),this);
    }

    public void checkCountElements(String expected) {
        String actualCount = String.valueOf(filterFoundEarphones.size());
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", actualCount, expected),actualCount.contains(expected));
        System.out.println("Ожидалось: " + expected);
        System.out.println("Получено: " + actualCount);
    }

    public void rememberFirstElement() {
        firstEarphone = filterFoundEarphones.get(0).getText();
        System.out.println("Первый запомненный элемент: " + firstEarphone);
    }

    public void searchFirstEarPhone(){
        searchFirstElement(firstEarphone);
    }

    public void checkElement() {
        Assert.assertTrue(String.format("Получено значение [%s]. Ожидалось [%s]", foundEarphones.getText(), firstEarphone),foundEarphones.getText().contains(firstEarphone));
    }
}
