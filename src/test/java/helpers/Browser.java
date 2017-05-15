package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    private static String getOperatingSystem = System.getProperty("os.name");
    private static Boolean osMac = getOperatingSystem.startsWith("Mac");
    private static Boolean osLinux = getOperatingSystem.startsWith("Linux");

    public static WebDriver createDriver() {
        String targetBrowser = System.getProperties().getProperty("browser");
        switch (targetBrowser) {
            case "firefox": return firefox();
            case "chrome" : return chrome();
            default: return firefox();
        }
    }

    private static FirefoxDriver firefox() {
        if (osMac) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver_mac");
            System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"false");
        }
        else if (osLinux) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver_linux");
        }
        return new FirefoxDriver();
    }

    private static ChromeDriver chrome() {
        if (osMac) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver_mac");
        }
        else if (osLinux) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver_linux64");
        }
        return new ChromeDriver();
    }

}
