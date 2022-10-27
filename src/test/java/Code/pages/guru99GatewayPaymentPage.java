package Code.pages;

import Code.Utils.BrowserUtils;
import Code.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99GatewayPaymentPage extends BrowserUtils {
    public guru99GatewayPaymentPage(){ PageFactory.initElements(Driver.getDriver(),this); }

    @FindBy(id = "card_nmuber")
    private WebElement CardNumber;
    @FindBy(id = "month")
    private WebElement Month;
    @FindBy(id = "year")
    private WebElement Year;
    @FindBy(id = "cvv_code")
    private WebElement CvvCode;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement PayButton;


    public void setCardNumber(String cardnumber) {
        staticWait(1);
        CardNumber.sendKeys(cardnumber);
    }

    public void setMonth(String month) {
        staticWait(1);
        selectFromDropDown(Month,month);
    }

    public void setYear(String year) {
        staticWait(1);
        selectFromDropDown(Year,year);
    }

    public void setCvvCode(String cvvCode) {
        CvvCode.sendKeys(cvvCode);
    }

    public void setPayButton() {
        PayButton.click();
    }

}
