package com.managesys.pages;

import com.managesys.base.ValidataHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ManageUserPage {
    private ValidataHelper validataHelper;

    private WebDriver driver;
    private By manageArea = By.xpath("//div[2]/div[1]/ul[1]/li[2]/a[1]");
    private By manageRoom = By.xpath("//div[2]/div[1]/ul[1]/li[3]/a[1]");
    private By manageNewGoods = By.xpath("//div[2]/div[1]/ul[1]/li[4]/a[1]");
    private By importGoods = By.xpath("//div[2]/div[1]/ul[1]/li[5]/a[1]");
    private By listOrders = By.xpath("//div[2]/div[1]/ul[1]/li[6]/a[1]");
    private By defaultPassword = By.xpath("//div[2]/div[1]/ul[1]/li[7]/a[1]");


    public ManageUserPage(WebDriver driver) {
        this.driver = driver;
        validataHelper = new ValidataHelper(driver);
    }

    private String url = "/user#";

    public void verifyUrl(){
        Assert.assertTrue(validataHelper.verifyUrl(url), "Not Manage User Page!");
    }

    public ManageWorkAreaPage openManageArea() {
        driver.findElement(manageArea).click();
        validataHelper.waitForPageLoaded();
        return new ManageWorkAreaPage(driver);
    }

    public com.managesys.pages.ManageRoomPage openManageRoomPage() {
        driver.findElement(manageRoom).click();
        validataHelper.waitForPageLoaded();
        return new ManageRoomPage(driver);
    }

    public DeFaultPasswordPage openDeFaultPasswordPage () {
        driver.findElement(defaultPassword).click();
        validataHelper.waitForPageLoaded();
        return new DeFaultPasswordPage (driver);
    }



}
