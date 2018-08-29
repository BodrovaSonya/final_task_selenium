package selenium.task.steps;

import ru.yandex.qatools.allure.annotations.Step;
import selenium.task.pages.ElectronicsPage;

public class ElectronicsSteps {
    @Step("выбрана категория товаров {0}")
    public void selectElement (String category) {
        new ElectronicsPage().selectElement(category);
    }
}
