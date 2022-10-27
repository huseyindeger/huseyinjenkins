package Code.pages;

import Code.Utils.BrowserUtils;
import Code.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class Practice_PAGES extends BrowserUtils {

    public Practice_PAGES(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "txtUsername")
    private WebElement Username;
    @FindBy(id = "txtPassword")
    private WebElement Password;
    @FindBy(id = "btnLogin")
    private WebElement LoginButton;
    @FindBy(id = "menu_pim_viewPimModule")
    private WebElement PIMModule;
    @FindBy(id = "menu_pim_addEmployee")
    private WebElement AddEmployee;
    @FindBy(id = "firstName")
    private WebElement FirstName;
    @FindBy(id = "lastName")
    private WebElement LastName;
    @FindBy(id = "btnSave")
    private WebElement SaveButton;

    public void setUsername(String username) {
        Username.sendKeys(username);
    }

    public void setPassword(String password) {
        Password.sendKeys(password);
    }

    public void setLoginButton() {
        clickWithWait(LoginButton);
    }

    public void setPIMModule() {
        clickWithWait(PIMModule);
    }

    public void setAddEmployee() {
        clickWithWait(AddEmployee);
    }

    public void setFirstName(String firstName) {
        FirstName.sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        LastName.sendKeys(lastName);
    }

    public void setSaveButton() {
        SaveButton.click();
    }
}
