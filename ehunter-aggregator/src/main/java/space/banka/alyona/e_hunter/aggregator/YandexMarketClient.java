package space.banka.alyona.e_hunter.aggregator;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YandexMarketClient {

    // Obtained from https://chromedriver.storage.googleapis.com/LATEST_RELEASE
    private static final String CHROME_DRIVER_VERSION = "81.0.4044.69";

    public static void main(String[] args) {
        // Download and set up Chrome web driver
        WebDriverManager.chromedriver().version(CHROME_DRIVER_VERSION).setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://market.yandex.ru/");
        driver.close();
    }
}
