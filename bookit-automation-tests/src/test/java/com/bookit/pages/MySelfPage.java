package com.bookit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bookit.utilities.Driver;

public class MySelfPage extends TopNavigationBar{
	
	public MySelfPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/app-me-page[1]/div[1]/div[1]/div[1]/div[1]/app-user-card[1]/div[1]/div[1]/div[3]/div[2]/p[1]")
	public WebElement teamName;

}
