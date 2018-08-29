package selenium.task.steps;

import ru.yandex.qatools.allure.annotations.Step;
import selenium.task.pages.EarphonePage;

public class EarphoneSteps {
    @Step("запомнено первое значение в списке")
    public void rememberFirst() {
        new EarphonePage().rememberFirstElement();
    }

    @Step ("проверено количество элементов на странице, {0}")
    public void checkCountElements(String expected) {
        new EarphonePage().checkCountElements(expected);
    }

    @Step("поиск товара")
    public void searchElement () {
        new EarphonePage().searchFirstEarPhone();
    }

    @Step ("проверка запомненного и действительного значения элемента")
    public void checkElement() {
        new EarphonePage().checkElement();
    }
}
