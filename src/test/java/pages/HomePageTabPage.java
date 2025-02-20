package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utils.HomePageTabLocator;
import helper.Interactions;

public class HomePageTabPage{
	
    private Interactions clickingHelper;
    
    private HomePageTabLocator homePageTabLocator;
    
    public HomePageTabPage(WebDriver driver) {
    	
        this.clickingHelper = new Interactions(driver);
        this.homePageTabLocator = new HomePageTabLocator(driver);
    }


//    
//    public void verifyScheduleConsultationButtonPresense(WebDriver driver) {
//    	String mainWindowHandle = driver.getWindowHandle();
//    	Set<String> allWindowHandles = driver.getWindowHandles();
//        for (String handle : allWindowHandles) {
//            if (!handle.equals(mainWindowHandle)) {
//                driver.switchTo().window(handle);
//                break;
//            }
//        }
//    	
//    	try {
//            WebElement element = driver.findElement(this.homePageTabLocator.scheduleConsultationButton); 
//            Assert.assertTrue(element.isDisplayed(), "Element is not visible on the page!");
//            System.out.println("Element is present and visible.");
//        } catch (Exception e) {
//            System.out.println("Element is not present.");
//        } finally {
//        	// no action
//        }
//    }
//
//    
//    public void enterRegisterTodayFormFields() throws InterruptedException {
//    	clickingHelper.enterText(this.homePageTabLocator.firstNameEventRegistrationFrom,"John");
//    	clickingHelper.enterText(this.homePageTabLocator.lastNameEventRegistrationForm,"Doe");
//    	clickingHelper.enterText(this.homePageTabLocator.phoneNoEventRegistrationForm,"+1234567890");
//    	clickingHelper.enterText(this.homePageTabLocator.emailEventRegistrationForm,"john.doe@example.com");
//    	clickingHelper.enterText(this.homePageTabLocator.companyEventRegistationForm,"ABC Corp");
//    	clickingHelper.click(this.homePageTabLocator.eventSelectEventRegistrationFrom);
//    	clickingHelper.click(this.homePageTabLocator.eventSelectedEventRegistationForm);
//    	clickingHelper.click(this.homePageTabLocator.checkboxEventRegistrationForm);
//    	clickingHelper.click(this.homePageTabLocator.registerButton);
//
//    }

    
    
    
    
    
    
    public void clickScheduleConsultationbtn() {
    	clickingHelper.click(this.homePageTabLocator.scheduleConsultationButton);
    }
    
    public void ClickServiceButton() {
    	clickingHelper.click(this.homePageTabLocator.serviceButton);

    }
    
    public void verifyLink(WebDriver driver,String url) {
    	
    	String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, url, "The URL did not match!"); 
    }  
    
    public void ClickTownship() {
    	clickingHelper.click(this.homePageTabLocator.township);

    }
    public void ClickTradencomm() {
    	clickingHelper.click(this.homePageTabLocator.tradencomm);

    }
    
    public void ClickHealthcare() {
    	clickingHelper.click(this.homePageTabLocator.healthcare);

    }
    
    public void ClickFinance() {
    	clickingHelper.click(this.homePageTabLocator.finance);

    }
    
    public void ClickEnergy() {
    	clickingHelper.click(this.homePageTabLocator.energy);

    }
    
    public void ClickAgriculture() {
    	clickingHelper.click(this.homePageTabLocator.agriculture);

    }
    
    public void ClickViewAllSoln() {
    	clickingHelper.click(this.homePageTabLocator.viewAllSoln);

    }
    
    public void ClickIndustry() {
    	clickingHelper.click(this.homePageTabLocator.industry);

    }
    
    public void ClickTransportation() {
    	clickingHelper.click(this.homePageTabLocator.transportation);

    }
    
    public void ClickHealthcareNew() {
    	clickingHelper.click(this.homePageTabLocator.healthcareNew);

    }
    
    public void ClickBank() {
    	clickingHelper.click(this.homePageTabLocator.bank);

    }
    
    public void ClickConsultation() {
    	clickingHelper.click(this.homePageTabLocator.consultation);

    }
    
    public void ClickNonprofit() {
    	clickingHelper.click(this.homePageTabLocator.nonprofit);

    }
    
    public void ClickViewIndustry() {
    	clickingHelper.click(this.homePageTabLocator.viewIndustry);

    }
    
    public void ClickLeftarrowButton() {
    	clickingHelper.click(this.homePageTabLocator.leftarrowButton);

    }
    
    public void ClickRightarrowButton() {
    	clickingHelper.click(this.homePageTabLocator.rightarrowButton);

    }
    
    public void ClickDataCenterViewMore() {
    	clickingHelper.click(this.homePageTabLocator.dataCenterViewMore);

    }
    
    public void ClickCollaorationViewMore() {
    	clickingHelper.click(this.homePageTabLocator.collaborationViewMore);

    }
    
    public void ClickCloudViewMore() {
    	clickingHelper.click(this.homePageTabLocator.cloudViewMore);

    }
    
    
    public void ClickSuccessStorriesCard1() {
    	clickingHelper.click(this.homePageTabLocator.successStoriesCard1);

    }
    
    public void ClickSuccessStorriesCard2() {
    	clickingHelper.click(this.homePageTabLocator.successStoriesCard2);

    }
    
    public void ClickSuccessStorriesCard3() {
    	clickingHelper.click(this.homePageTabLocator.successStoriesCard3);

    }
    
    public void ClickCommentLeftArrow() {
    	clickingHelper.click(this.homePageTabLocator.commentLeftArrow);

    }
    
    public void ClickCommentRightArrow() {
    	clickingHelper.click(this.homePageTabLocator.commentRightArrow);

    }
    
    public void enterScheduleFormFields() throws InterruptedException {
    	clickingHelper.enterText(this.homePageTabLocator.firstNameScheduleForm,"John");
    	clickingHelper.enterText(this.homePageTabLocator.lastNameScheduleForm,"Doe");
    	clickingHelper.enterText(this.homePageTabLocator.companyScheduleForm,"ABC Corp");
    	clickingHelper.enterText(this.homePageTabLocator.companyEmailScheduleForm,"john.doe@example.com");
    	clickingHelper.enterText(this.homePageTabLocator.PhoneScheduleForm,"+1234567890");
    	clickingHelper.click(this.homePageTabLocator.selectHelpScheduleForm);
    	clickingHelper.click(this.homePageTabLocator.selectHelpOptionScheduleForm);
    	clickingHelper.enterText(this.homePageTabLocator.messageScheduleForm,"john.doe@example.com");
    	clickingHelper.click(this.homePageTabLocator.submitBtnScheduleForm);

    }
    
    public void enterupdateformFields() throws InterruptedException {
    	clickingHelper.enterText(this.homePageTabLocator.emailUpdatefield,"john.doe@example.com");
    	clickingHelper.click(this.homePageTabLocator.updateemailCheckBox);
    	clickingHelper.click(this.homePageTabLocator.updateEmailSubmitButton);

    }
    
    
    
    
    
    
    
    
}
