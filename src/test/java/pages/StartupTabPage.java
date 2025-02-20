package pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utils.StartupTabLocator;
import helper.Interactions;

public class StartupTabPage{
	
	WebDriverWait wait;

    private Interactions clickingHelper;
    
    private StartupTabLocator startupTabLocator;
    
    public StartupTabPage(WebDriver driver) {
    	
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.clickingHelper = new Interactions(driver);
        this.startupTabLocator = new StartupTabLocator(driver);
    }
    
    public void clickStartupTab() {
    	
    	clickingHelper.click(this.startupTabLocator.BlogTab);
    	clickingHelper.click(this.startupTabLocator.readMore);

    }    	
    
    public void verifyLink(WebDriver driver,String url) {
    	
    	// Store the original tab handle
        String originalTab = driver.getWindowHandle();

        // Wait for new tab to open and switch to it
        Set<String> allTabs = driver.getWindowHandles();
        for (String tab : allTabs) {
            if (!tab.equals(originalTab)) {
                driver.switchTo().window(tab);
                break;
            }
        }

    	String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, url, "The URL did not match!"); 
        driver.switchTo().window(originalTab);

    } 
   
    public void clickazure() {
    	
    	clickingHelper.click(this.startupTabLocator.microsoftAzure);

    }   
    
    public void clickbird() {
    	
    	clickingHelper.click(this.startupTabLocator.bird);

    } 
    
    public void clickcybersecurity() {
    	
    	clickingHelper.click(this.startupTabLocator.cybersecurity);

    } 
    
    public void clickdevelopment() {
    	
    	clickingHelper.click(this.startupTabLocator.development);

    } 
    
    public void clickit() {
    	
    	clickingHelper.click(this.startupTabLocator.it);

    } 
    
    public void clickcomment() {
    	
    	clickingHelper.click(this.startupTabLocator.comment);

    } 
    
    public void tc_72() throws InterruptedException {
    	
    	clickingHelper.click(this.startupTabLocator.showcomment);
    	clickingHelper.enterText(this.startupTabLocator.replycomment, "comment");
    	clickingHelper.enterText(this.startupTabLocator.name, "name");
    	clickingHelper.enterText(this.startupTabLocator.email, "name@email.com");
    	clickingHelper.enterText(this.startupTabLocator.website, "wwww.xyz.com");
    	clickingHelper.click(this.startupTabLocator.checkbox);
    	clickingHelper.click(this.startupTabLocator.postcomment);

    } 
    
    public void tc_73() throws InterruptedException {
    	
    	clickingHelper.click(this.startupTabLocator.showcomment);
    	clickingHelper.click(this.startupTabLocator.reply);
    	clickingHelper.enterText(this.startupTabLocator.replycomment, "comment");
    	clickingHelper.enterText(this.startupTabLocator.name, "name");
    	clickingHelper.enterText(this.startupTabLocator.email, "name@email.com");
    	clickingHelper.enterText(this.startupTabLocator.website, "wwww.xyz.com");
    	clickingHelper.click(this.startupTabLocator.checkbox);
    	clickingHelper.click(this.startupTabLocator.postcomment);
    	
    } 
    
    public void tc_74() throws InterruptedException {
    	
    	clickingHelper.enterText(this.startupTabLocator.firstNameScheduleForm,"John");
    	clickingHelper.enterText(this.startupTabLocator.lastNameScheduleForm,"Doe");
    	clickingHelper.enterText(this.startupTabLocator.companyScheduleForm,"ABC Corp");
    	clickingHelper.enterText(this.startupTabLocator.companyEmailScheduleForm,"john.doe@example.com");
    	clickingHelper.enterText(this.startupTabLocator.PhoneScheduleForm,"+1234567890");
    	clickingHelper.click(this.startupTabLocator.selectHelpScheduleForm);
    	clickingHelper.click(this.startupTabLocator.selectHelpOptionScheduleForm);
    	clickingHelper.enterText(this.startupTabLocator.messageScheduleForm,"john.doe@example.com");
    	clickingHelper.click(this.startupTabLocator.submitBtnScheduleForm);
    	
    }
    
    public void tc_75() throws InterruptedException {
    	
    	clickingHelper.enterText(this.startupTabLocator.firstNameScheduleForm,"38937");
    	clickingHelper.enterText(this.startupTabLocator.lastNameScheduleForm,"38937");
    	clickingHelper.enterText(this.startupTabLocator.companyScheduleForm,"38937 Corp");
    	clickingHelper.enterText(this.startupTabLocator.companyEmailScheduleForm,"john@example.com");
    	clickingHelper.enterText(this.startupTabLocator.PhoneScheduleForm,"+skj");
    	clickingHelper.click(this.startupTabLocator.selectHelpScheduleForm);
    	clickingHelper.click(this.startupTabLocator.selectHelpOptionScheduleForm);
    	clickingHelper.enterText(this.startupTabLocator.messageScheduleForm,"john.doe@example.com");
    	clickingHelper.click(this.startupTabLocator.submitBtnScheduleForm);
    	 WebElement visibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(this.startupTabLocator.errortext));

         // Assert visibility
         Assert.assertTrue(visibleElement.isDisplayed(), "The element is not visible after the button click.");

    	
    }
    
    public void tc_76() throws InterruptedException {
    	clickingHelper.enterText(this.startupTabLocator.updateemail,"john.doe@example.com");
    	clickingHelper.click(this.startupTabLocator.updatecheckbox);
    	clickingHelper.click(this.startupTabLocator.send);
    	
    }
    
    public void tc_77() throws InterruptedException {

    	clickingHelper.click(this.startupTabLocator.footerconsultation);
    	tc_74();
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void clickmanageservices() {
    	
    	clickingHelper.click(this.startupTabLocator.manageservices);

    } 
    
    public void clickitservice() {
    	
    	clickingHelper.click(this.startupTabLocator.itservice);

    } 
    
    public void clickmobiledev() {
    	
    	clickingHelper.click(this.startupTabLocator.mobiledev);

    } 
    
    public void clickcloud() {
    	
    	clickingHelper.click(this.startupTabLocator.cloudservice);

    } 
    
    public void clickcyber() {
    	
    	clickingHelper.click(this.startupTabLocator.cyber);

    } 
    
    public void clicknetwork() {
    	
    	clickingHelper.click(this.startupTabLocator.network);

    } 
    
    public void clickweb() {
    	
    	clickingHelper.click(this.startupTabLocator.web);

    } 
    
   public void clickerp() {
    	
    	clickingHelper.click(this.startupTabLocator.erp);

    } 
   
   public void clickabout() {
   	
   	clickingHelper.click(this.startupTabLocator.about);

   } 
   
   public void clickblog() {
	   	
	   	clickingHelper.click(this.startupTabLocator.blog);

	   } 
   public void clickwhyus() {
	   	
	   	clickingHelper.click(this.startupTabLocator.whyus);

	   } 
   
   public void clickcase() {
	   	
	   	clickingHelper.click(this.startupTabLocator.casestudies);

	   } 
    
   public void clickteam() {
	   	
	   	clickingHelper.click(this.startupTabLocator.team);

	   } 
   
   public void clickevents() {
	   	
	   	clickingHelper.click(this.startupTabLocator.events);

	   } 
   
   public void clickcareer() {
	   	
	   	clickingHelper.click(this.startupTabLocator.careers);

	   } 
   
   public void clickfaq() {
	   	
	   	clickingHelper.click(this.startupTabLocator.faq);

	   } 
   
   public void clickpartner() {
	   	
	   	clickingHelper.click(this.startupTabLocator.partner);

	   } 
   
   public void clickreview() {
	   	
	   	clickingHelper.click(this.startupTabLocator.review);

	   } 
   
   public void clickclutch() {
	   	
	   	clickingHelper.click(this.startupTabLocator.clutch);

	   } 
   
   public void clicklocation() {
	   	
	   	clickingHelper.click(this.startupTabLocator.location);

	   } 
   
   public void clicktel() {
	   	
	   	clickingHelper.click(this.startupTabLocator.tel);

	   } 
   
   public void clickmailto() {
	   	
	   	clickingHelper.click(this.startupTabLocator.mailto);

	   } 
    
   public void clicklinkedin() {
	   	
	   	clickingHelper.click(this.startupTabLocator.linkedin);

	   } 
   
   public void clickgithub() {
	   	
	   	clickingHelper.click(this.startupTabLocator.github);

	   } 
   
   public void clicktwitter() {
	   	
	   	clickingHelper.click(this.startupTabLocator.twitter);

	   } 
   
   public void clickfacebook() {
	   	
	   	clickingHelper.click(this.startupTabLocator.facebook);

	   } 
   
   public void clickyoutube() {
	   	
	   	clickingHelper.click(this.startupTabLocator.youtube);

	   } 
   
   public void clicktnc() {
	   	
	   	clickingHelper.click(this.startupTabLocator.tnc);

	   } 
   
   
   public void clickprivacypolicy() {
	   	
	   	clickingHelper.click(this.startupTabLocator.privacyPolicy);

	   } 
   
   public void clickcustreview() {
	   	
	   	clickingHelper.click(this.startupTabLocator.custreview);

	   } 
   
   public void clickuserblog() {
	   	
	   	clickingHelper.click(this.startupTabLocator.userblog);

	   } 
  
   
}
