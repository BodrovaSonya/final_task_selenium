package selenium.task.steps;

import ru.yandex.qatools.allure.annotations.Step;
import selenium.task.pages.TVPage;

public class TVSteps {
    @Step("запомнено первое значение в списке")
    public void rememberFirst() {
        new TVPage().rememberFirstElement();
    }

    @Step ("проверено количество элементов на странице, {0}")
    public void checkCountElements(String expected) {
        new TVPage().checkCountElements(expected);
    }

    @Step("поиск товара")
    public void searchElement () {
        new TVPage().searchFirstTV();
    }

    @Step ("проверка запомненного и действительного значения элемента")
    public void checkElement() {
        new TVPage().checkElement();
    }
}
