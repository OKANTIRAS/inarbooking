package pages.headerSection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class HotelTab extends BasePage {

    @FindBy(className = "me3")
    private List<WebElement> searchBarInputFields;

    @FindBy(css = ".headerSearchInput")
    private WebElement searchBarInputField;

    @FindBy(css = ".headerSearch > div > button")
    private WebElement searchButton;

    public void enterCityIntoSearchBar(String city) {
        searchBarInputFields.get(0).sendKeys(city);
    }

    public void clickOnDatePicker(){
        searchBarInputFields.get(1).click();
    }

    public void clickOnBookingInfoSelector(){
        searchBarInputFields.get(2).click();
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }

    public String getSearchHotelsButtonText(){
        return searchButton.getText();
    }

    public String getSearchBarInputFieldPlaceholder(){
        return searchBarInputField.getAttribute("placeholder");
    }


}
