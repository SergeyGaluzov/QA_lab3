package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SelectedBooksNumberInRowTestCase {

    private WebDriver driver;
    private static String siteUrl = "https://www.demoqa.com/books";

    @BeforeEach
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void CheckTheNumberOfSelectedBooksInRow(){

        driver.get(siteUrl);
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.selectToView5BooksOnPage();
        assertEquals(5, home.books.size());
    }
}
