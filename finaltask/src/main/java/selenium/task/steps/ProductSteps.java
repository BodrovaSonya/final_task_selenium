package selenium.task.steps;

import ru.yandex.qatools.allure.annotations.Step;
import selenium.task.pages.ProductPage;

public class ProductSteps {
    @Step ("заполнен фильтр цены значением {0}")
    public void fillFilter(String value){
        new ProductPage().fillFilter(value);
    }

    @Step ("выбран чек-бокс для производителя товара {0}")
    public void fillProducerCheckBox (String producer) {
        new ProductPage().fillProducerCheckBox(producer);
    }

    @Step ("нажата кнопка применения фильтров")
    public void apply() {
        new ProductPage().apply();
    }


    @Step ("ожидание загрузки страницы с элементом")
    public void waitHeader () {
        new ProductPage().waitPage();
    }

}
