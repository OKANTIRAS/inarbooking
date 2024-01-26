package pages.hotels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class Hotels_FilterAndList_Page extends BasePage {

    @FindBy(css = "div.lsCheckboxItem > span")
    private List<WebElement> checkBoxChoicesList;

    @FindBy(css = "div.search-btn-flight > button")
    private WebElement searchButton;

    @FindBy(css = "button.siCheckButton")
    private List<WebElement> seeAvailabilityButtonList;

    public void clickOnCheckBoxChoices(String choice) {
        BrowserUtils.scrollDownWithPageDownButton(1);
        checkBoxChoicesList.stream().filter(e -> e.getText().equalsIgnoreCase(choice)).findFirst().get().
                findElement(By.xpath("../input")).click();
    }

    public void clickOnSearchButton(){
        BrowserUtils.scrollDownWithPageDownButton(1);
        searchButton.click();
    }

    public void clickOnSeeAvailabilityButtonByIndex(int index){
        if(index < 3){
            BrowserUtils.scrollUpWithPageUpButton(2);
        }else if (index < 5){
            BrowserUtils.scrollUpWithPageUpButton(1);
        }else if (index > 7){
            BrowserUtils.scrollDownWithPageDownButton(1);
        }
        seeAvailabilityButtonList.get(index - 1).click();
    }
}
