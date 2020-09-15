package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

//import org.openqa.selenium.*;
//import org.openqa.selenium.support.events.AbstractWebDriverEventListener;



public class EventListener extends AbstractWebDriverEventListener {
    private By lastFindBy;
    private WebElement lastElement;
    private String originalValue;



    // Prints the URL before Navigating to specific URL "get("http://www.google.com");"
    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {
        System.out.println("Before Navigating To : " + url + ", my url was: "
                + driver.getCurrentUrl());
    }

    // Prints the current URL after Navigating to specific URL "get("http://www.google.com");"
    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("After Navigating To: " + url + ", my url is: "
                + driver.getCurrentUrl());
    }

    // Called before finding Element(s)
    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        lastFindBy = by;
        System.out.println("Trying to find element: '" + lastFindBy + "'.");
        //System.out.println("Trying to find: " + by.toString()); // This is optional and an alternate way
    }

    // Called after finding Element(s)
    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        lastFindBy = by;
        System.out.println("Found element: '" + lastFindBy + "'.");
        //System.out.println("Found: " + by.toString() + "'."); // This is optional and an alternate way
    }


  //CLICK | CLICK()

    // Called before clicking an Element
    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("Trying to click: '" + element + "'");
        // Highlight Elements before clicking
        for (int i = 0; i < 1; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript(
                    "arguments[0].setAttribute('style', arguments[1]);",
                    element, "color: black; border: 3px solid black;");
        }
    }

    // Called after clicking an Element
    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        System.out.println("Clicked Element with: '" + element + "'");
    }


     //* CHANGING VALUES | CLEAR() & SENDKEYS()

    // Before Changing values
    public void beforeChangeValueOf(WebElement element, WebDriver driver) {
        lastElement = element;
        originalValue = element.getText();

        // What if the element is not visible anymore?
        if (originalValue.isEmpty()) {
            originalValue = element.getAttribute("value");
        }
    }

    // After Changing values
    public void afterChangeValueOf(WebElement element, WebDriver driver) {
        lastElement = element;
        String changedValue = "";
        try {
            changedValue = element.getText();
        } catch (StaleElementReferenceException e) {
            System.out
                    .println("Could not log change of element, because of a stale"
                            + " element reference exception.");
            return;
        }
        // What if the element is not visible anymore?
        if (changedValue.isEmpty()) {
            changedValue = element.getAttribute("value");
        }

        System.out.println("Changing value in element: " + lastElement
                + " from '" + originalValue + "' to '" + changedValue + "'");
    }
}