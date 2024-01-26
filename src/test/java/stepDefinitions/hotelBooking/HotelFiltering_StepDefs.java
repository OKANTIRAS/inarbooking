package stepDefinitions.hotelBooking;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import org.assertj.core.api.Assertions;
import stepDefinitions.BaseStep;
import utils.LoggerFactory;

import static org.assertj.core.api.BDDAssertions.then;

public class HotelFiltering_StepDefs extends BaseStep {

    private static final Logger LOGGER = LoggerFactory.getLogger(HotelFiltering_StepDefs.class);

    @And("I click on the {string} Check Box on the left side")
    public void iClickOnTheCheckBoxOnTheLeftSide(String choice) {
        PAGES.getHotels_filterAndList_page().clickOnCheckBoxChoices(choice);
    }

    @And("I click on the #{int} Hotel's See availability Button")
    public void iClickOnTheHotelSSeeAvailabilityButton(int hotelNumber) {
        PAGES.getHotels_filterAndList_page().clickOnSeeAvailabilityButtonByIndex(hotelNumber);
    }

    @Then("I validate the Hotel has the {string}")
    public void iValidateTheHotelHasThe(String choice) {
        then(PAGES.getHotel_detailPage().validateTheFacilitiesOrProperties(choice))
                .as("Detail Page does not include the required facility").isTrue();
    }


    @And("I click on the Search button on the left side")
    public void iClickOnTheSearchButtonOnTheLeftSide() {
        PAGES.getHotels_filterAndList_page().clickOnSearchButton();
    }

}
