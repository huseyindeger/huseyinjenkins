package Code.pages;

import Code.Utils.BrowserUtils;
import Code.Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class guru99GatewayHome extends BrowserUtils {
    public guru99GatewayHome(){ PageFactory.initElements(Driver.getDriver(),this); }
    //we us private access modifiar because this is where we apply encapsulation

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;

    @FindBy(xpath = "//select[@name='quantity']")
    private WebElement quantityDropdown;

    public void getBuyNow() {
        buyNow.click();
    }

    public void getQuantityDropdown(String str) {
        Select select=new Select(quantityDropdown);
        select.selectByValue(str);
        //this is another way of selecting from dropdown.we use method in our browserutil class
        //   BrowserUtils.selectFromDropDown(quantityDropdown,str);

    }

}
