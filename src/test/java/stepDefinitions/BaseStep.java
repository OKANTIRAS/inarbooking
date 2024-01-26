package stepDefinitions;

import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Pages;

public class BaseStep {
    protected final Pages PAGES = new Pages();
    protected final WebDriver DRIVER = Driver.getDriver();
}
