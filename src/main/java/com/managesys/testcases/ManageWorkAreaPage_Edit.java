package com.managesys.testcases;

import com.managesys.base.BaseSetup;
import com.managesys.base.ValidataHelper;
import com.managesys.pages.ManageUserPage;
import com.managesys.pages.ManageWorkAreaPage;
import com.managesys.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ManageWorkAreaPage_Edit extends BaseSetup {
    private WebDriver driver;
    public SignInPage signInPage;
    private ValidataHelper validataHelper;
    private ManageUserPage manageUserPage;
    private ManageWorkAreaPage manageWorkAreaPage;
    private com.managesys.pages.ManageWorkAreaPage_Edit manageWorkAreaPage_edit;



    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @Test(priority = 0)
    public void signIn() throws Exception {
        signInPage = new SignInPage(driver);
        manageUserPage = signInPage.signIn("admin@gmail.com", "Abc@1234");
    }

    @Test(priority = 1)
    public void openManageAreaPage() {
        validataHelper = new ValidataHelper(driver);
        manageWorkAreaPage=manageUserPage.openManageArea();
    }

    @Test(priority = 3)
    public void editWorkArea(){
        validataHelper = new ValidataHelper(driver);
        manageWorkAreaPage_edit=manageWorkAreaPage.editWorkArea();
        manageWorkAreaPage_edit.areaPage();
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
