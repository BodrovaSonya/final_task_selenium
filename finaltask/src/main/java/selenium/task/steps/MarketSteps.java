package selenium.task.steps;

import ru.yandex.qatools.allure.annotations.Step;
import selenium.task.pages.MarketPage;

public class MarketSteps {
    @Step("выбран пункт меню Яндекс.Маркета {0}")
    public void selectMarketMenuItem (String marketMenuItem){
        new MarketPage().selectMarketMenuItem(marketMenuItem);
    }
}
