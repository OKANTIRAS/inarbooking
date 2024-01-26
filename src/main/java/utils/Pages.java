package utils;

import lombok.Data;
import pages.HomePage;
import pages.headerSection.HotelTab;
import pages.headerSection.TabBar;
import pages.hotels.Hotel_DetailPage;
import pages.hotels.Hotels_FilterAndList_Page;

@Data
public class Pages {

    private HomePage homePage;

    private HotelTab hotelTab;
    private Hotel_DetailPage hotel_detailPage;
    private Hotels_FilterAndList_Page hotels_filterAndList_page;

    private TabBar tabBar;

    public Pages() {
        homePage = new HomePage();

        hotelTab = new HotelTab();
        hotel_detailPage = new Hotel_DetailPage();
        hotels_filterAndList_page = new Hotels_FilterAndList_Page();

        tabBar = new TabBar();
    }


}
