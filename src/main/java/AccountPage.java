import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountPage {

    String myAccountXPath = "//*[@id=\"li_myaccount\"]/a";
    String signUpXPath = "//*[@id=\"li_myaccount\"]/ul/li/a";
    String firstNameName = "firstname";
    String lastNameName = "lastname";
    String mobileNumberName = "phone";
    String emailName = "email";
    String passwordName = "password";
    String confirmName = "confirmpassword";
    String submitXPath = "//*[@id=\"headersignupform\"]/div[9]/button";
    String accountTitle = "My Account";

    BrowserDriver browser = BrowserDriver.getBrowser();

    public String createAccount() {

        browser.goTo("https://www.phptravels.net/");
        List<WebElement> accountButtons = browser.myFindElements(myAccountXPath);
        accountButtons.get(1).click();

        List<WebElement> signUpButton = browser.myFindElements(signUpXPath);
        signUpButton.get(3).click();

        WebElement firstName = browser.findName(firstNameName);
        WebElement lastName = browser.findName(lastNameName);
        WebElement mobileNumber = browser.findName(mobileNumberName);
        WebElement email = browser.findName(emailName);
        WebElement password = browser.findName(passwordName);
        WebElement confirm = browser.findName(confirmName);
        WebElement submit = browser.findXPath(submitXPath);

        firstName.sendKeys("Test");
        lastName.sendKeys("Account");
        mobileNumber.sendKeys("4444444444");
        email.sendKeys("testAccount@gmail.com");
        password.sendKeys("password");
        confirm.sendKeys("password");
        submit.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return browser.driver.getTitle();
    }
}
