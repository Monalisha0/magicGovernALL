package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageTabLocator {
		
	public By scheduleConsultationButton = By.xpath("//*[@id=\"post-146\"]/div/div/section[1]/div/div/div/div[3]/div/div/a");
	
	public By serviceButton = By.xpath("//*[@id=\"post-146\"]/div/div/section[1]/div/div/div/div[4]/div/div/a");
	
	public By township = By.xpath("//*[@id=\"post-146\"]/div/div/section[7]/div[2]/div/div/section[1]/div/div[1]/div/div[1]/div/a");
	
	public By tradencomm = By.xpath("//*[@id=\"post-146\"]/div/div/section[7]/div[2]/div/div/section[1]/div/div[2]/div/div[1]/div/a");

	public By healthcare = By.xpath("//*[@id=\"post-146\"]/div/div/section[7]/div[2]/div/div/section[1]/div/div[3]/div/div[1]/div/a");
	
	public By finance = By.xpath("//*[@id=\"post-146\"]/div/div/section[7]/div[2]/div/div/section[2]/div/div[1]/div/div[1]/div/a");
	
	public By energy = By.xpath("//*[@id=\"post-146\"]/div/div/section[7]/div[2]/div/div/section[2]/div/div[2]/div/div[1]/div/a");
	
	public By agriculture = By.xpath("//*[@id=\"post-146\"]/div/div/section[7]/div[2]/div/div/section[2]/div/div[3]/div/div[1]/div/a");
	
	public By viewAllSoln = By.xpath("//*[@id=\"post-146\"]/div/div/section[7]/div[2]/div/div/div[3]/div/div/a");
	
	public By industry = By.xpath("//*[@id=\"post-146\"]/div/div/section[8]/div/div/div/div[3]/div/div/figure/a");
	
	public By transportation = By.xpath("//*[@id=\"post-146\"]/div/div/section[8]/div/div/div/div[4]/div/div/figure/a");
	
	public By healthcareNew = By.xpath("//*[@id=\"post-146\"]/div/div/section[8]/div/div/div/div[5]/div/div/figure/a");
	
	public By bank = By.xpath("//*[@id=\"post-146\"]/div/div/section[8]/div/div/div/div[6]/div/div/figure/a");
	
	public By consultation = By.xpath("//*[@id=\"post-146\"]/div/div/section[8]/div/div/div/div[7]/div/div/figure/a");
	
	public By nonprofit = By.xpath("//*[@id=\"post-146\"]/div/div/section[8]/div/div/div/div[8]/div/div/figure/a");
	
	public By viewIndustry = By.xpath("//*[@id=\"post-146\"]/div/div/section[8]/div/div/div/div[9]/div/div/a");
	
	public By leftarrowButton = By.xpath("//*[@id=\"post-146\"]/div/div/section[12]/div/div/div/div/div/div/div/div[2]");
	
	public By rightarrowButton = By.xpath("//*[@id=\"post-146\"]/div/div/section[12]/div/div/div/div/div/div/div/div[3]");
	
	public By dataCenterViewMore = By.xpath("//*[@id=\"elementor-tab-title-4631\"]/a");
	
	public By collaborationViewMore = By.xpath("//*[@id=\"elementor-tab-title-1121\"]/a");
	
	public By cloudViewMore = By.xpath("//*[@id=\"elementor-tab-title-1761\"]/a");
	
	public By successStoriesCard1 = By.xpath("//*[@id=\"post-146\"]/div/div/section[14]/div/div/div/div/div/div/article[1]/a");
	
	public By successStoriesCard2 = By.xpath("//*[@id=\"post-146\"]/div/div/section[14]/div/div/div/div/div/div/article[2]/a");
	
	public By successStoriesCard3 = By.xpath("//*[@id=\"post-146\"]/div/div/section[14]/div/div/div/div/div/div/article[3]/a");
	
	public By commentLeftArrow = By.xpath("//*[@id=\"post-146\"]/div/div/section[15]/div/div/div/div[1]/div/div/div/div[2]");
	
	public By commentRightArrow = By.xpath("//*[@id=\"post-146\"]/div/div/section[15]/div/div/div/div[1]/div/div/div/div[3]");
	
	
	
	public By firstNameScheduleForm = By.xpath("//*[@id=\"form-field-form_free_consultation_first_name\"]");
	
	public By lastNameScheduleForm = By.xpath("//*[@id=\"form-field-form_free_consultation_last_name\"]");

	public By companyScheduleForm = By.xpath("//*[@id=\"form-field-form_free_consultation_company_name\"]");

	public By companyEmailScheduleForm = By.xpath("//*[@id=\"form-field-form_free_email\"]");

	public By PhoneScheduleForm = By.xpath("//*[@id=\"form-field-form_free_consultation_phone\"]");
	
	public By selectHelpScheduleForm = By.xpath("//*[@id=\"form-field-form_free_topic\"]");
	
	public By selectHelpOptionScheduleForm = By.xpath("//*[@id=\"form-field-form_free_topic\"]/option[2]");
	
	public By messageScheduleForm = By.xpath("//*[@id=\"form-field-message\"]");
	
	public By submitBtnScheduleForm = By.xpath("//*[@id=\"post-146\"]/div/div/section[16]/div/div/div/div/div/div/div/section[2]/div/div/div/section/div/div[2]/div/div[4]/div/form/div/div[9]/button");
	

	public By emailUpdatefield = By.xpath("//*[@id=\"form-field-email\"]");
	
	public By updateemailCheckBox = By.xpath("//*[@id=\"form-field-field_e78b014\"]");
	
	public By updateEmailSubmitButton = By.xpath("//*[@id=\"main-footer\"]/div/section[1]/div/div[1]/div/div[9]/div/form/div/div[3]/button");
	
	
	
	public HomePageTabLocator(WebDriver driver) {
	}
	
}