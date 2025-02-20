package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.ResourceTabLocator;
import helper.Interactions;

public class ResourceTabPage{
	
    private Interactions clickingHelper;
    
    private ResourceTabLocator resourceTabLocator;
    
    public ResourceTabPage(WebDriver driver) {
    	
        this.clickingHelper = new Interactions(driver);
        this.resourceTabLocator = new ResourceTabLocator(driver);
    }
    
    public void clickResourceTab() {
    	
    	clickingHelper.click(this.resourceTabLocator.resourceTab);
    }    	
    
    public void clickScheduleConsultation() {
    	
    	clickingHelper.click(this.resourceTabLocator.scheduleConsultation);
    }    
    
    public void clickScheduleConsultationButton() {
    	
    	clickingHelper.click(this.resourceTabLocator.scheduleConsultationButton);
    }  
    
    public void verifyLink(WebDriver driver,String url) {
    	
    	String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, url, "The URL did not match!"); 
    }  
    
    public void verifyScheduleConsultationButtonPresense(WebDriver driver) {
    	String mainWindowHandle = driver.getWindowHandle();
    	Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    	
    	try {
            WebElement element = driver.findElement(this.resourceTabLocator.scheduleConsultationButton); 
            Assert.assertTrue(element.isDisplayed(), "Element is not visible on the page!");
            System.out.println("Element is present and visible.");
        } catch (Exception e) {
            System.out.println("Element is not present.");
        } finally {
        	// no action
        }
    }
    
    public void clickgetDirectionFlorida() {
    	
    	clickingHelper.click(this.resourceTabLocator.getDirectionFlorida);
    } 
    
    public void clickgetDirectionGeorgia() {
    	
    	clickingHelper.click(this.resourceTabLocator.getDirectionGeorgia);
    } 
    
    public void clickgetDirectionKansas() {
    	
    	clickingHelper.click(this.resourceTabLocator.getDirectionKansas);
    } 
    
    public void clickEvents() {
    	
    	clickingHelper.click(this.resourceTabLocator.events);
    }    
  
    public void verifyregisterTodayButtonPresense(WebDriver driver) {
    	String mainWindowHandle = driver.getWindowHandle();
    	Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    	
    	try {
            WebElement element = driver.findElement(this.resourceTabLocator.registerTodayButton); 
            Assert.assertTrue(element.isDisplayed(), "Element is not visible on the page!");
            System.out.println("Element is present and visible.");
        } catch (Exception e) {
            System.out.println("Element is not present.");
        } finally {
        	// no action
        }
    }
    
    public void clickRegisterToday() {
    	
    	clickingHelper.click(this.resourceTabLocator.registerTodayButton);
    }  
    public void clickSecondaryRegisterToday() {
    	
    	clickingHelper.click(this.resourceTabLocator.secondaryRegisterTodayButton);
    } 
    
    
    public void verifyEventRegistrationFormPresense(WebDriver driver) {
    	String mainWindowHandle = driver.getWindowHandle();
    	Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    	
    	try {
            WebElement element = driver.findElement(this.resourceTabLocator.firstNameEventRegistrationFrom); 
            Assert.assertTrue(element.isDisplayed(), "Element is not visible on the page!");
            System.out.println("Element is present and visible.");
        } catch (Exception e) {
            System.out.println("Element is not present.");
        } finally {
        	// no action
        }
    }
    
    public void enterRegisterTodayFormFields() throws InterruptedException {
    	clickingHelper.enterText(this.resourceTabLocator.firstNameEventRegistrationFrom,"John");
    	clickingHelper.enterText(this.resourceTabLocator.lastNameEventRegistrationForm,"Doe");
    	clickingHelper.enterText(this.resourceTabLocator.phoneNoEventRegistrationForm,"+1234567890");
    	clickingHelper.enterText(this.resourceTabLocator.emailEventRegistrationForm,"john.doe@example.com");
    	clickingHelper.enterText(this.resourceTabLocator.companyEventRegistationForm,"ABC Corp");
    	clickingHelper.click(this.resourceTabLocator.eventSelectEventRegistrationFrom);
    	clickingHelper.click(this.resourceTabLocator.eventSelectedEventRegistationForm);
    	clickingHelper.click(this.resourceTabLocator.checkboxEventRegistrationForm);
    	clickingHelper.click(this.resourceTabLocator.registerButton);

    }
    
    public void enterScheduleFormFields() throws InterruptedException {
    	clickingHelper.enterText(this.resourceTabLocator.firstNameScheduleForm,"John");
    	clickingHelper.enterText(this.resourceTabLocator.lastNameScheduleForm,"Doe");
    	clickingHelper.enterText(this.resourceTabLocator.companyScheduleForm,"ABC Corp");
    	clickingHelper.enterText(this.resourceTabLocator.companyEmailScheduleForm,"john.doe@example.com");
    	clickingHelper.enterText(this.resourceTabLocator.PhoneScheduleForm,"+1234567890");
    	clickingHelper.click(this.resourceTabLocator.selectHelpScheduleForm);
    	clickingHelper.click(this.resourceTabLocator.selectHelpOptionScheduleForm);
    	clickingHelper.enterText(this.resourceTabLocator.messageScheduleForm,"john.doe@example.com");
    	clickingHelper.click(this.resourceTabLocator.submitBtnScheduleForm);


    }
    
}
