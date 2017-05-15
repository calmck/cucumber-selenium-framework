package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_definitions.Hooks;

public class ExamplePageObject {

    public static WebElement findByTextValue(String text) {
        return Hooks.driver.findElement(By.xpath("//*[contains(text(), '" + text + "')]"));
    }
}