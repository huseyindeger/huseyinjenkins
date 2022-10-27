package Code.pages;

import Code.Utils.BrowserUtils;
import Code.Utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99GateWayOrderSuccess extends BrowserUtils {
    public guru99GateWayOrderSuccess(){ PageFactory.initElements(Driver.getDriver(),this); }



    @FindBy(xpath = "//h2[.='Payment successfull!']")
    private WebElement verificationText;

    public void setVerificationText(String expectedMessage) {
        Assert.assertEquals(verificationText.getText(),expectedMessage);
    }



}
