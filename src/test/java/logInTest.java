import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class logInTest {

    @Test
    public void Logintest() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.ca");
        Thread.sleep(5000);
        System.out.println(driver.getTitle());
        driver.quit();

    }

}
