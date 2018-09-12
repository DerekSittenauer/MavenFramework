import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class BrowserDriver {
    //create new chrome driver
    WebDriver driver;
    ChromeOptions options = new ChromeOptions();

    private static BrowserDriver browser;

    private BrowserDriver() {
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }

    public void quit() {

        browser = null;
    }

    public void close() {

        driver.close();
    }


    public static BrowserDriver getBrowser() {
        if(browser == null) {
            browser = new BrowserDriver();
        }

        return browser;
    }

    //method to get URL
    public void goTo(String url) {
        driver.get(url);
    }

    //method to find element by xpath
    public WebElement findXPath(String homeXPath) {
        return driver.findElement(By.xpath(homeXPath));
    }

    //method to find element by CSS
    public WebElement findCSS(String homeCSS) { return driver.findElement(By.cssSelector(homeCSS)); }

    //method to find element by ID
    public WebElement findID(String homeID) { return driver.findElement(By.id(homeID)); }

    public WebElement findName(String homeName) { return driver.findElement(By.name(homeName)); }

    public List<WebElement> myFindElements(String homeXPaths) { return driver.findElements(By.xpath(homeXPaths)); }
}
