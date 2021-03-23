package selenium;

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
public class WebTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        WebTest.driver = new ChromeDriver();
    }

    @AfterAll
    public static void tearDown() {
        WebTest.driver.quit();
    }

    @Test
    @SuppressWarnings("checkstyle:magicnumber")
    public void web() {
        WebTest.driver.get("https://ifrs.edu.br/");
        WebTest.driver.manage().window().setSize(new Dimension(1294, 741));
        WebTest.driver.findElement(By.linkText("Editais")).click();
        List<WebElement> elements = WebTest.driver.findElements(By.cssSelector(".editais__title"));
        assert elements.size() > 0;
    }
}
