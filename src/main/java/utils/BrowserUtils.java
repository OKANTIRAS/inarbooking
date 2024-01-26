package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class BrowserUtils {



    /**
     * Captures a screenshot of the current browser window and saves it with a unique name.
     *
     * @param name the name of the screenshot
     * @return the file path of the captured screenshot
     */
    public static String getScreenshot(String name) {
        // Adding date and time to the screenshot name to make it unique
        name = new Date().toString().replace(" ", "_").replace(":", "-") + "_" + name;
        String path = System.getProperty("user.dir") + "\\test-output\\screenshots\\" + name + ".png";
        TakesScreenshot screenshot = (TakesScreenshot) Driver.getDriver();
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(path);
        try {
            FileUtils.copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }

    /**
     * Moves the mouse pointer to the specified web element.
     *
     * @param element the web element to move the mouse pointer to
     */
    public static void moveToElement(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).build().perform();
    }

    /**
     * Navigates to a browser window with the specified title.
     *
     * @param targetTitle the title of the target window
     */
    public static void navigateToWindow(String targetTitle) {
        String currentWindow = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(currentWindow);
    }

    /**
     * Switches to a grandchild window.
     */
    public static void switchToGrandChildWindow() {
        Set<String> windows = Driver.getDriver().getWindowHandles();
        Iterator<String> iterations = windows.iterator();
        String parentWindow = iterations.next();
        String childWindow = iterations.next();
        String grandChildindow = iterations.next();
        Driver.getDriver().switchTo().window(grandChildindow);
    }

    /**
     * Switches to a popup window.
     */
    public static void switchToPopUpWindow() {
        Set<String> windows = Driver.getDriver().getWindowHandles();
        Iterator<String> iterations = windows.iterator();
        String parentWindow = iterations.next();
        String childWindow = iterations.next();
        Driver.getDriver().switchTo().window(childWindow);
    }

    /**
     * Pauses the execution for the specified number of seconds.
     *
     * @param secs the number of seconds to wait
     */
    public static void wait(double secs) {
        try {
            Thread.sleep(1000 * (long) secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void wait(int secs) {
        try {
            Thread.sleep(1000 * (long) secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void scrollDownWithPageDownButton(int times) {
        Actions actions = new Actions(Driver.getDriver());
        for (int i = 0; i < times; i++) {
            actions.keyDown(Keys.PAGE_DOWN).build().perform();
            BrowserUtils.wait(1);
        }
    }

    public static void scrollUpWithPageUpButton(int times) {
        Actions actions = new Actions(Driver.getDriver());
        for (int i = 0; i < times; i++) {
            actions.keyDown(Keys.PAGE_UP).build().perform();
            BrowserUtils.wait(1);
        }
    }


}
