import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage {

    String myAccountXPath = "//*[@id=\"li_myaccount\"]/a";
    String loginXPath = "//*[@id=\"li_myaccount\"]/ul/li/a";
    String emailUsername = "username";
    String passwordName = "password";
    String loginButtonXPath = "//*[@id=\"loginfrm\"]/div[1]/div[5]/button";
    String loginTitle = "My Account";

    BrowserDriver browser = BrowserDriver.getBrowser();

    public String testLogin() {

        browser.goTo("https://www.phptravels.net/");
        List<WebElement> accountButtons = browser.myFindElements(myAccountXPath);
        accountButtons.get(1).click();

        List<WebElement> loginButton = browser.myFindElements(loginXPath);
        loginButton.get(2).click();

        WebElement email = browser.findName(emailUsername);
        WebElement password = browser.findName(passwordName);
        WebElement login = browser.findXPath(loginButtonXPath);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        email.sendKeys("user@phptravels.com");
        password.sendKeys("demouser");
        login.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return browser.driver.getTitle();

    }
}
