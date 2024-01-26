package utils;

import org.openqa.selenium.JavascriptExecutor;

public class JSUtils {

    private static JavascriptExecutor javascriptExecutor = (JavascriptExecutor) Driver.getDriver();

    /**
     * Executes the provided JavaScript code.
     *
     * @param javascriptCode the JavaScript code to execute
     */
    public static void javascriptExecutor(String javascriptCode){
        javascriptExecutor.executeScript(javascriptCode);
    }

    /**
     * Clicks on an element using its ID.
     *
     * @param elementId the ID of the element to click
     */
    public static void clickOnElementByItsId(String elementId){
        javascriptExecutor.executeScript("document.querySelector('#"+elementId+"').click()");
    }


}
