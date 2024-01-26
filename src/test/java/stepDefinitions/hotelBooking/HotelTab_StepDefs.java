package stepDefinitions.hotelBooking;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import stepDefinitions.BaseStep;
import utils.LoggerFactory;
import static org.assertj.core.api.BDDAssertions.then;

public class HotelTab_StepDefs extends BaseStep {

    public static final Logger LOGGER = LoggerFactory.getLogger(HotelTab_StepDefs.class);
    //implement log factory

    @When("I click on the Hotel Tab")
    public void i_click_on_the_hotel_tab() {
        PAGES.getTabBar().clickOnStaysTab();
        LOGGER.info("I clicked on the Hotel Tab");
    }

    @Then("I validate the Hotel Tab Includes Search Bar for Hotel")
    public void i_validate_the_hotel_tab_includes_search_bar_for_hotel() {
        then(PAGES.getHotelTab().getSearchHotelsButtonText()).as("The Button text does not equal to the Search Hotels")
                .isEqualTo("Search Hotels");
        then(PAGES.getHotelTab().getSearchBarInputFieldPlaceholder()).as("The Input Field does not equal to the Wheare are you going?")
                .isEqualTo("Where are you going?");
        LOGGER.info("I validated the Hotel Tab Includes Search Bar for Hotel");
    }

    @And("I click on the Search Hotels Button")
    public void iClickOnTheSearchHotelsButton() {
        PAGES.getHotelTab().clickOnSearchButton();
        LOGGER.info("I clicked on the Search Hotels Button");
    }
}
