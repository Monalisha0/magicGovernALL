package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResourceTabLocator {
		
	public By resourceTab = By.xpath("/html/body/div[@class='elementor elementor-171 elementor-location-header']/section[1]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']//a[@href='#']");
	
	public By scheduleConsultation = By.xpath("/html/body/div[@class='elementor elementor-171 elementor-location-header']/section[1]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']/li[6]/ul[@role='group']//a[@href='https://www.magicgovern.ai/contact/']");
	
	public By scheduleConsultationButton = By.xpath("/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-83']/section[3]/div/div/div/div[1]//a[@href='#form']");
	
	public By getDirectionFlorida = By.xpath("/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-83']/section[6]/div/div[1]/div/div[5]//a[@href='https://goo.gl/maps/KDAyy1xUd72Zsj7r7']");
	
	public By getDirectionGeorgia = By.xpath("/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-83']/section[6]/div/div[2]/div/div[5]//a[@href='https://goo.gl/maps/XgeapZgo9t7DXahs5']");
	
	public By getDirectionKansas = By.xpath("/html//div[@id='main']/article/div/section[2]//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-83']/section[6]/div/div[3]/div/div[5]//a[@href='https://goo.gl/maps/wT4gBQQrUuyNSpE27']");
	
	public By events= By.xpath("/html/body/div[@class='elementor elementor-171 elementor-location-header']/section[1]/div/div[2]/div/div/div/nav[1]/ul[@class='elementor-nav-menu']/li[6]/ul[@role='group']//a[@href='https://www.magicgovern.ai/events/']");
	
	public By registerTodayButton = By.xpath("/html//div[@id='main']/article/div/section[2]/div/div//div[@class='elementor-element elementor-element-23ed50d elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-1312']/section[4]/div/div[1]/div/section[2]/div/div/div/div//a[@href='https://www.magicgovern.ai/events/microsoft-teams-the-productivity-swiss-army-knife/']");
	
	public By secondaryRegisterTodayButton = By.xpath("/html//div[@id='main']/article/div/section[2]/div/div//div[@class='elementor-element elementor-element-e9add8b elementor-widget elementor-widget-theme-post-content']//div[@class='elementor elementor-7586']/section/div/div[1]/div/section/div/div/div/div[5]//a[@href='#elementor-action%3Aaction%3Dpopup%3Aopen%26settings%3DeyJpZCI6Ijc3MTgiLCJ0b2dnbGUiOmZhbHNlLCJhbGlnbl93aXRoX3BhcmVudCI6IiJ9']");
	
	public By firstNameEventRegistrationFrom = By.xpath("/html//input[@id='form-field-first_tname_event_form']");
	
	public By lastNameEventRegistrationForm = By.xpath("//*[@id=\"form-field-field_cdb0dd4\"]");
	
	public By phoneNoEventRegistrationForm = By.xpath("/html//input[@id='form-field-phone_event_form']");
	
	public By emailEventRegistrationForm = By.xpath("/html//input[@id='form-field-email_event_form']");
	
	public By companyEventRegistationForm = By.xpath("/html//input[@id='form-field-company_name_event_form']");
	
	public By eventSelectEventRegistrationFrom = By.xpath("//*[@id=\"form-field-field_dc643bc\"]");
	
	public By eventSelectedEventRegistationForm = By.xpath("//*[@id=\"form-field-field_dc643bc\"]/option[2]");
	
	public By checkboxEventRegistrationForm = By.xpath("//*[@id=\"form-field-field_709339e\"]");
	
	public By registerButton = By.xpath("//*[@id=\"elementor-popup-modal-7718\"]/div/div[2]/div/section/div/div/div/div[4]/div/form/div/div[9]/button");
	
	public By firstNameScheduleForm = By.xpath("//*[@id=\"form-field-form_free_consultation_first_name\"]");
	
	public By lastNameScheduleForm = By.xpath("//*[@id=\"form-field-form_free_consultation_last_name\"]");

	public By companyScheduleForm = By.xpath("//*[@id=\"form-field-form_free_consultation_company_name\"]");

	public By companyEmailScheduleForm = By.xpath("//*[@id=\"form-field-form_free_email\"]");

	public By PhoneScheduleForm = By.xpath("//*[@id=\"form-field-form_free_consultation_phone\"]");
	
	public By selectHelpScheduleForm = By.xpath("//*[@id=\"form-field-form_free_topic\"]");
	
	public By selectHelpOptionScheduleForm = By.xpath("//*[@id=\"form-field-form_free_topic\"]/option[2]");
	
	public By messageScheduleForm = By.xpath("//*[@id=\"form-field-message\"]");
	
	public By submitBtnScheduleForm = By.xpath("//*[@id=\"post-83\"]/div/section[3]/div/div/div/div/div/div/div/section[2]/div/div/div/section/div/div[2]/div/div[4]/div/form/div/div[9]/button");

	public ResourceTabLocator(WebDriver driver) {
	}
	
}