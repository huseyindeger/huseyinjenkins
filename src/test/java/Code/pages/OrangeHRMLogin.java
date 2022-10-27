package Code.pages;

import Code.Utils.BrowserUtils;
import Code.Utils.Driver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLogin extends BrowserUtils {
    public OrangeHRMLogin(){ PageFactory.initElements(Driver.getDriver(),this); }

    private static final Logger logger = Logger.getLogger(OrangeHRMLogin.class);

    @FindBy(id = "txtUsername")
    private WebElement Usernaneme;
    @FindBy(id = "txtPassword")
    private WebElement Password;
    @FindBy(id = "btnLogin")
    private WebElement LoginButton;

    public void setUsernaneme(String usernaneme) {
        if (usernaneme==null){
            logger.error("username is empty. Please check the value you provided");
            logger.info("Please check if you provided username correctly");
        }
        Usernaneme.sendKeys(usernaneme);

    }

    public void setPassword(String password) {
        Password.sendKeys(password);
    }

    public void setLoginButton() {
       LoginButton.click();
    }

    public void SetUsernamePaswordExcel(String username,String password){
        Usernaneme.sendKeys(username);
        Password.sendKeys(password);
        LoginButton.click();
    }
}
