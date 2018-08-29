package selenium.task.steps;

import ru.yandex.qatools.allure.annotations.Step;
import selenium.task.pages.MainPage;

public class MainSteps {
    @Step("выбран пункт меню {0}")
    public void selectMenuItem (String menuItem) {
        new MainPage().selectMenuItem(menuItem);
    }
}
