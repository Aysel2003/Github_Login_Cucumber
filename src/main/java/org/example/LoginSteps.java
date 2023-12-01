package org.example;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import static org.testng.AssertJUnit.assertTrue;


public class LoginSteps {
    public WebDriver driver ;

    @Given("user is on Github login page")
    public void user_is_on_Github_login_page() {
        System.out.println("User is on the Github login page");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Aysel\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://github.com/login");
    }

    @When("user enters Github username and password")
    public void user_enters_username_and_password() {
        System.out.println("User enters username and password");
        WebElement usernameInput = driver.findElement(By.id("login_field"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys("michael_corlone@mail.ru");
        passwordInput.sendKeys("BlackWhite");
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("User clicks on login button");
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]"));
        loginButton.click();
    }

    @Then("user is navigated to homepage")
    public void user_is_navigated_to_homepage() {
        System.out.println("User is navigated to the homepage");
        assertTrue(driver.getCurrentUrl().startsWith("https://github.com/"));
        driver.quit();
    }
}