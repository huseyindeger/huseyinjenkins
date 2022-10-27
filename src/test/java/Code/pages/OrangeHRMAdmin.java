package Code.pages;

import Code.Utils.BrowserUtils;
import Code.Utils.Driver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.WeakHashMap;

public class OrangeHRMAdmin extends BrowserUtils {
    public OrangeHRMAdmin(){ PageFactory.initElements(Driver.getDriver(),this); }

    private static final Logger logger = Logger.getLogger(OrangeHRMAdmin.class);

    @FindBy(id = "menu_admin_viewAdminModule")
    private WebElement AdminButton;
    @FindBy(id = "menu_admin_nationality")
    private WebElement NationalitiesSection;
    @FindBy(id = "btnAdd")
    private WebElement AddButton;
    @FindBy(id = "nationality_name")
    private WebElement NameofNationalitiesBox;
    @FindBy(id = "btnSave")
    private WebElement SaveButton;
    @FindBy(xpath = "//table//tr//td//a")
    private List<WebElement> nationalitiesList;

    public void setAdminButton() {
        clickWithWait(AdminButton);
    }

    public void setNationalitiesSection() {
        clickWithWait(NationalitiesSection);
    }

    public void setAddButton() {
        clickWithWait(AddButton);
    }

    public void setNameofNationalitiesBox(String nameofnationalitiesBox) {
        NameofNationalitiesBox.sendKeys(nameofnationalitiesBox);
    }

    public void setSaveButton() {
        clickWithWait(SaveButton);
    }

    public void setNationalitiesList(String nationality) {
        for(WebElement each:nationalitiesList){
            if (each.getText().equals(nationality)){
                Assert.assertEquals(each.getText(),nationality);
            }else if (!each.getText().equals(nationality)){
                logger.error("Nationality provided is not found in the records");
            } else if (nationality.isEmpty()) {
                logger.error("No Nationality is provided");

            }

        }
    }
}
