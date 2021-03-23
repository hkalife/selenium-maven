package logincampus;

import java.util.List;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Teste usando selenium.
 */
public class LoginTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        LoginTest.driver = new ChromeDriver();
    }

    @AfterAll
    public static void tearDown() {
        LoginTest.driver.quit();
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void web() {
        LoginTest.driver.get("http://campusdigital.poa.ifrs.edu.br:8080/public/login/index.xhtml?windowId=c93");
        LoginTest.driver.manage().window().setSize(new Dimension(1050, 721));
        LoginTest.driver.findElement(By.id("authentication:username")).sendKeys("hdhdhdhd");
        LoginTest.driver.findElement(By.id("authentication:password")).sendKeys("ksksksksks");
        LoginTest.driver.findElement(By.cssSelector(".ui-button-text")).click();
        List<WebElement> elements = driver.findElements(By.id("authentication:username"));
        assert elements.size() > 0;
    }
}
