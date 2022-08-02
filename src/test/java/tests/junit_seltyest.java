package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class junit_seltyest {

    private static WebDriver driver;

    @BeforeClass
    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();

    }


    @Test
    public void searchTitle() {
        String actualTitle;

        driver.get("http://google.com");
        actualTitle = driver.getTitle();
        Assert.assertNotNull(actualTitle);
        System.out.println("Searching Titile: " + actualTitle);
    }

    @Test
    public void searchXPath() {
        String actualTitle;
        driver.get("https://lenta.ru");
        actualTitle = driver.getTitle();
        Assert.assertNotNull(actualTitle);

        System.out.println("Searching Titile" + actualTitle);
    }

    @AfterClass
    public static void closeDrowser() {
        driver.close();
    }
}
