package Code.pages;

import Code.Utils.BrowserUtils;
import Code.Utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.apache.log4j.Logger;

public class OrangeHRMHome  extends BrowserUtils {
    public OrangeHRMHome(){ PageFactory.initElements(Driver.getDriver(),this); }

    private static final Logger logger = Logger.getLogger(OrangeHRMHome.class);

    @FindBy(xpath = "//h1[.='Dashboard']")
    private WebElement dashboard;
    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement PIM;
    @FindBy(id = "menu_pim_addEmployee")
    private WebElement addEmployee;
    @FindBy(id = "firstName")
    private WebElement firstName;
    @FindBy(id = "lastName")
    private WebElement lastName;
    @FindBy(id = "btnSave")
    private WebElement saveButton;
    @FindBy(xpath = "//h1[.='Personal Details']")
    private WebElement personalDetailsHeader;
    @FindBy(id = "chkLogin")
    private WebElement CreateLoginButton;
    @FindBy(id = "user_name")
    private WebElement UserName;
    @FindBy(id = "user_password")
    private WebElement Password;
    @FindBy(id = "re_password")
    private WebElement ConfirmPassword;
    @FindBy(id = "status")
    private WebElement Status;



    public void setDashboard() {
        Assert.assertEquals("Dashboard",dashboard.getText());
    }
    public void setDashboard(String str) {
        Assert.assertEquals(str,dashboard.getText());
    }

    public void setPIM() {
        clickWithWait(PIM);

    }

    public void setAddEmployee() {
        clickWithWait(addEmployee);
    }

    public void setFirstName(String firstname) {


        firstName.sendKeys(firstname);
        logger.info(firstname+" is successfully entered");


    }

    public void setLastName(String lastname) {
        lastName.sendKeys(lastname);
        logger.info(lastname+" is successfully entered");
    }

    public void setSaveButton() {
        clickWithWait(saveButton);
        logger.info("save button successfully clicked");
    }

    public void setPersonalDetailsHeader(String expectedHeader) {
        Assert.assertEquals(expectedHeader,personalDetailsHeader.getText());
        logger.info(expectedHeader+" is expected header and successfully verified");
    }

    public void setCreateLoginButton() {
        clickWithWait(CreateLoginButton);
        logger.info("Create login button was successfully clicked");
    }

    public void setUserName(String userName) {
        UserName.sendKeys(userName);
    }

    public void setPassword(String password) {
        Password.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword.sendKeys(confirmPassword);
    }

    public void setStatus(String status) {
        selectFromDropDown(Status,status);
    }




}
