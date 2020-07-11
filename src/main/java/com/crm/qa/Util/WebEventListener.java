package com.crm.qa.Util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.BaseClass.TestBase;

public class WebEventListener extends TestBase implements WebDriverEventListener{
	
	public void beforeNavigateTo(String url, WebDriver driver) 
	{
		System.out.println("Before navigating to: '" + url + "'");
	}

	public void afterNavigateTo(String url, WebDriver driver) 
	{
		System.out.println("Navigated to:'" + url + "'");
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver)
	{
		System.out.println("Value of the:" + element.toString() + " before any changes made");
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver)
	{
		System.out.println("Element Value Changed to: " + element.toString());
	}

	public void beforeClickOn(WebElement element, WebDriver driver)
	{
		System.out.println("Trying to Click On: " + element.toString());
	}

	public void afterClickOn(WebElement element, WebDriver driver) 
	{
		System.out.println("Clicked On: " + element.toString());
	}

	public void beforeNavigateBack(WebDriver driver) 
	{
		System.out.println("Navigating Back to Previous Page");
	}

	public void afterNavigateBack(WebDriver driver) 
	{
		System.out.println("Navigated Back to Previous Page");
	}

	public void beforeNavigateForward(WebDriver driver) 
	{
		System.out.println("Navigating Forward to Next Page");
	}

	public void afterNavigateForward(WebDriver driver) 
	{
		System.out.println("Navigated Forward to Next Page");
	}

	public void onException(Throwable error, WebDriver driver) 
	{
		System.out.println("Exception Occured: " +error);
		try 
		{
			//Captures Screenshot When Exception Found and Stores in Screenshots Folder.
			//No Need to take Screenshot again and again.
			Testutil.takeScreenshotAtEndOfTest();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) 
	{
		System.out.println("Trying to Find Element By : " + by.toString());
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) 
	{
		System.out.println("Found Element By : " + by.toString());
	}

	//Non Overridden Methods of WebListener Class 
	public void beforeScript(String script, WebDriver driver) 
	{
		
	}

	public void afterScript(String script, WebDriver driver)
	{
		
	}

	public void beforeAlertAccept(WebDriver driver) 
	{

	}

	public void afterAlertAccept(WebDriver driver) 
	{

	}

	public void afterAlertDismiss(WebDriver driver)
	{

	}

	public void beforeAlertDismiss(WebDriver driver) 
	{

	}

	public void beforeNavigateRefresh(WebDriver driver)
	{

	}

	public void afterNavigateRefresh(WebDriver driver) 
	{

	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) 
	{

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) 
	{

	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1)
	{

	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2)
	{

	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1)
	{

	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) 
	{
		
	}

	public void beforeGetText(WebElement arg0, WebDriver arg1)
	{

	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1)
	{

	}
	
	
	
}