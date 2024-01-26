package pages.headerSection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class TabBar extends BasePage {

    @FindBy(css = ".headerList > div")
    private List<WebElement> tabList;

    public void clickOnStaysTab() {
        tabList.get(0).click();
    }

    public void clickOnFlightsTab() {
        tabList.get(1).click();
    }

    public void clickOnCarRentalsTab() {
        tabList.get(2).click();
    }

}
