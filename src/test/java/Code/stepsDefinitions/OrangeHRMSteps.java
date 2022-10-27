package Code.stepsDefinitions;

import Code.Utils.BrowserUtils;
import Code.Utils.ConfigurationsReader;
import Code.Utils.Driver;
import Code.pages.OrangeHRMAdmin;
import Code.pages.OrangeHRMHome;
import Code.pages.OrangeHRMLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class OrangeHRMSteps extends BrowserUtils {
    OrangeHRMLogin orangeHRMLogin=new OrangeHRMLogin();
    OrangeHRMHome orangeHRMHome=new OrangeHRMHome();

    OrangeHRMAdmin orangeHRMAdmin=new OrangeHRMAdmin();
    private static final Logger logger = Logger.getLogger(OrangeHRMSteps.class);
    @Given("The user wants to go to OrangeHRM Website")
    public void the_user_wants_to_go_to_orange_hrm_website() {
        System.out.println("Browser is launced and testing started");
        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest"));
        waitForPageToLoad(4);

    }
    @When("The user wants to enter Username and Password")
    public void the_user_wants_to_enter_username_and_password() {
        orangeHRMLogin.setUsernaneme(ConfigurationsReader.getProperties("OrangeHRMUsername"));
        orangeHRMLogin.setPassword(ConfigurationsReader.getProperties("OrangeHRMPassword"));
        logger.info("username and password provided successfully");



    }
    @Then("The user wants to click on Login button")
    public void the_user_wants_to_click_on_login_button() {
        orangeHRMLogin.setLoginButton();

    }
    @Then("The user wants to verify that browser landed on Dashboard")
    public void the_user_wants_to_verify_that_browser_landed_on_dashboard() {
        orangeHRMHome.setDashboard();
        System.out.println("Verification is success and test is ending for this step");
    }

    @Then("The user wants to verify that browser landed on {string}")
    public void the_user_wants_to_verify_that_browser_landed_on(String string) {
        orangeHRMHome.setDashboard(string);
    }
    //---------
    @Then("The user wants to click on PIM module")
    public void the_user_wants_to_click_on_pim_module() {
        orangeHRMHome.setPIM();
    }
    @Then("The user wants to go to Add Employee Page")
    public void the_user_wants_to_go_to_add_employee_page() {
        orangeHRMHome.setAddEmployee();
    }
    @Then("The user wants to add first name as {string}")
    public void the_user_wants_to_add_first_name_as(String string) {
        orangeHRMHome.setFirstName(string);
    }
    @Then("The user wants to add last name as {string}")
    public void the_user_wants_to_add_last_name_as(String string) {
        orangeHRMHome.setLastName(string);
    }
    @Then("The user wants to save personal information")
    public void the_user_wants_to_save_personal_information() {
        orangeHRMHome.setSaveButton();
    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String string) {
        staticWait(2);
        orangeHRMHome.setPersonalDetailsHeader(string);
    }
    //-----
    @Then("The user wants to add employee's first and last name as following")
    public void the_user_wants_to_add_employee_s_first_and_last_name_as_following(Map<String,String> dataTable) {
        orangeHRMHome.setFirstName(dataTable.get("FirstName")); //FirstName is coming from OrangeHRM.feature
        orangeHRMHome.setLastName(dataTable.get("LastName"));  //LastName is coming from OrangeHRM.feature
    }
    @Then("The user wants to add Login Details as following")
    public void the_user_wants_to_add_login_details_as_following(Map<String,String>  dataTable) {
        orangeHRMHome.setCreateLoginButton();
        orangeHRMHome.setUserName(dataTable.get("UserName"));
        orangeHRMHome.setPassword(dataTable.get("Password"));
        orangeHRMHome.setConfirmPassword(dataTable.get("Password"));
        orangeHRMHome.setStatus(dataTable.get("Status"));
        logger.info("username,password and status of account provided successfully");

    }
    @Then("The user wants to add employee's first and last name as following list")
    public void the_user_wants_to_add_employee_s_first_and_last_name_as_following_list(List<List<String>> dataTable) {
        orangeHRMHome.setFirstName(dataTable.get(0).get(0));
        orangeHRMHome.setLastName(dataTable.get(0).get(1));
    }
    @Then("The user wants to add Login in a  List way")
    public void the_user_wants_to_add_login_in_a_list_way(List<List<String>> dataTable) {
        orangeHRMHome.setCreateLoginButton();
        orangeHRMHome.setUserName(dataTable.get(0).get(0));
        orangeHRMHome.setPassword(dataTable.get(0).get(1));
        orangeHRMHome.setConfirmPassword(dataTable.get(0).get(1));
        orangeHRMHome.setStatus(dataTable.get(0).get(2));
    }

    @Then("user wants to add login information {string} {string} {string}")
    public void user_wants_to_add_login_information(String username, String password, String status) {
        orangeHRMHome.setCreateLoginButton();
        logger.info("add login button is clicked successfully");
        orangeHRMHome.setUserName(username);
        logger.info(username+" is provided as username");
        orangeHRMHome.setPassword(password);
        logger.info(password+" is provided as password");
        orangeHRMHome.setConfirmPassword(password);
        orangeHRMHome.setStatus(status);

    }
    @Then("The user wants to add employee's first and last name as {string} {string}")
    public void the_user_wants_to_add_employee_s_first_and_last_name_as(String firstname, String lastname) {
        orangeHRMHome.setFirstName(firstname);
        logger.info(firstname+" is provided as username");
        orangeHRMHome.setLastName(lastname);
        logger.info(firstname+" is provided successfully");
        logger.info(lastname+" is provided as lastname");

    }
    @Then("The user wants to click Admin Module")
    public void the_user_wants_to_click_admin_module() {
        orangeHRMAdmin.setAdminButton();

    }
    @Then("The user wants to click on Nationalities Section")
    public void the_user_wants_to_click_on_nationalities_section() {
        orangeHRMAdmin.setNationalitiesSection();

    }
    @Then("The user wants to click on add button")
    public void the_user_wants_to_click_on_add_button() {
        orangeHRMAdmin.setAddButton();

    }
    @Then("The user wants to add new nationalities as {string}")
    public void the_user_wants_to_add_new_nationalities_as(String nationality) {
        orangeHRMAdmin.setNameofNationalitiesBox(nationality);
        orangeHRMAdmin.setSaveButton();
        orangeHRMAdmin.setNationalitiesList(nationality);
    }

    @Given("The user wants to go login OrangeHRM using excel file")
    public void the_user_wants_to_go_login_orange_hrm_using_excel_file() throws IOException {
        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest"));
            String filepath="/Users/jacqueline/IdeaProjects/Cucumber/src/test/resources/test cases.xlsx";
        FileInputStream fileInputStream=new FileInputStream(filepath);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet= workbook.getSheet("Sheet2");
        String username=sheet.getRow(1).getCell(0).toString();
        String password=sheet.getRow(1).getCell(1).toString();
        int row=sheet.getLastRowNum();
        int columns=sheet.getRow(0).getLastCellNum();
        System.out.println("total rows= "+row+" toal columns "+columns);


        orangeHRMLogin.SetUsernamePaswordExcel(username,password);

    }



}
