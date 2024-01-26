package pages.hotels;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Hotel_DetailPage extends BasePage {
    private static final Logger LOGGER = LoggerFactory.getLogger(Hotel_DetailPage.class);
    @FindBy(css = "div.most-popular-facilities > div > span")
    private List<WebElement> mostPopularFacilitiesList;

    @FindBy(css = "div.booking-hotel-properties > div > span:nth-child(2)")
    private List<WebElement> hotelPropertiesList;

    public boolean validateTheFacilitiesOrProperties(String facilityOrProperty){
        List<WebElement> mergedList = new ArrayList<>(mostPopularFacilitiesList);
        mergedList.addAll(hotelPropertiesList);
        boolean isFound = mergedList.stream().anyMatch(e -> e.getText().equalsIgnoreCase(facilityOrProperty));
        LOGGER.info("The facility or property " + facilityOrProperty + " is found : " + isFound);
        return isFound;
    }
}
