package com.managesys.testcases;

import com.managesys.base.BaseSetup;
import com.managesys.base.ValidataHelper;
import com.managesys.pages.*;
import com.managesys.pages.ManageWorkAreaPage_Edit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ManageRoomPage_Add extends BaseSetup {
    private WebDriver driver;
    public SignInPage signInPage;
    private ValidataHelper validataHelper;
    private ManageUserPage manageUserPage;
    private ManageRoomPage manageRoomPage;
    private com.managesys.pages.ManageRoomPage_Add manageRoomPage_add;



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
    public void openManageRoom() {
        validataHelper = new ValidataHelper(driver);
        manageRoomPage=manageUserPage.openManageRoomPage();
    }

    @Test(priority = 3)
    public void addNewRoom(){
        validataHelper = new ValidataHelper(driver);
        manageRoomPage_add = manageRoomPage.addNewRoom();
        manageRoomPage_add.addNewRoom();
    }

    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
}
