package step_definitions;

import helpers.Environment;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;

public class ExampleStepDefs {
    private WebDriver driver;
    private String baseUrl = Environment.createEnvironment();

    public ExampleStepDefs()
    {
        driver = Hooks.driver;
    }

    @Given("^We are logged into the expedia page$")
    public void we_are_logged_into_the_expedia_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get(baseUrl + "www.expedia.co.uk/");

    }

    @When("^I choose NCL as my departure airport$")
    public void i_choose_NCL_as_my_departure_airport() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("package-origin-hp-package")).sendKeys("Newcastle, England, UK (NCL-Newcastle Intl.)");
    }

    @When("^I choose MAA as my arrival airport$")
    public void i_choose_MAA_as_my_arrival_airport() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("package-destination-hp-package")).sendKeys("Chennai, India");

    }

    @When("^I choose the departure date of \"([^\"]*)\"$")
    public void i_choose_the_departure_date_of(String depDate) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        driver.findElement(By.id("package-departing-hp-package")).sendKeys(depDate);
    }

    @When("^I choose the returning date of \"([^\"]*)\"$")
    public void i_choose_the_returning_date_of(String returnDate) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("package-returning-hp-package")).clear();
        driver.findElement(By.id("package-returning-hp-package")).sendKeys(returnDate);
        driver.findElement(By.id("package-rooms-hp-package")).click();

    }

    @Then("^I click the \"([^\"]*)\" button$")
    public void i_click_the_button(String buttonName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("search-button-hp-package")).click();
//        findByTextValue(buttonName).click();
    }
}
