package com.cydeo.page;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="searchInput")
    public WebElement searchBox;
    @FindBy(xpath = "//button[@class=\"pure-button pure-button-primary-progressive\"]")
    public WebElement searchButton;

    @FindBy(id="firstHeading")
    public WebElement mainHeader;
}
