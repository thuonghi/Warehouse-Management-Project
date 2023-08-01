package com.managesys.pages;

import com.managesys.base.ValidataHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ManageWorkAreaPage_Edit {
    private WebDriver driver;
    private ValidataHelper validataHelper;

    public ManageWorkAreaPage_Edit(WebDriver driver) {
        this.driver = driver;
        validataHelper = new ValidataHelper(driver);
    }
    private By titlePage = By.xpath("//div[@class='container-fluid']//p[@class='text']");
    private String url ="/work-space-management";
    private String pageHeader = "Quản lý khu làm việc";
    private By editBtn = By.xpath("//tbody/tr[2]/td[6]/a[1]");
    private By titleEditAreaPage = By.xpath("//div[@class='container-fluid']//p[@class='text-child-page']");
    private String editAreaHeader = "Sửả Khu Làm Việc";
    private By iconTooltip = By.xpath("//div[2]/div[3]/p[1]/img[1]");
    private By codeInput = By.xpath("//div[@class='col-3']//input[@name='work_areas_code']");
    private By nameInput = By.xpath("//div[@class='col-3']//input[@name='name']");
    private By saveBtn = By.xpath("//div[2]/div[2]/button[1]");
    private By popupHeader = By.xpath("//h4[@class='modal-title']");
    private String popupTitle = "Xác nhận";
    private By cancelBtn = By.xpath("//div//button[@data-bs-dismiss='modal']");
    private By editAreaBtn = By.xpath("//div//button[@form='mod_workarea']");



    public void areaPage(){
        validataHelper.waitForPageLoaded();
//        Assert.assertTrue(validataHelper.verifyUrl(url), "Not Manage Area Page");
//      Assert.assertTrue(validataHelper.verifyTitle(titlePage,pageHeader));
//        validataHelper.clickElement(editBtn);
//        validataHelper.waitForPageLoaded();
//      Assert.assertTrue(validataHelper.verifyTitle(titleEditAreaPage, editAreaHeader), "Not edit area page");
        validataHelper.hoverElement(iconTooltip);

        //setText into Area Code
        validataHelper.hoverElement(codeInput);
        validataHelper.clickElement(codeInput);
        validataHelper.clearElement(codeInput);
        validataHelper.setText(codeInput, "KV1020");

        //setText into Area Name
        validataHelper.clickElement(nameInput);
        validataHelper.clearElement(nameInput);
        validataHelper.setText(nameInput, "KVLV2408");

        //click Save
        validataHelper.clickElement(saveBtn);

        //Popup Handle
//      Assert.assertTrue(validataHelper.verifyTitle(popupHeader, popupTitle), "Not display pop up confirm");
        validataHelper.clickElement(editAreaBtn);
        Assert.assertTrue(validataHelper.verifyUrl(url), "Have not move to manage work area page");

    }
}
