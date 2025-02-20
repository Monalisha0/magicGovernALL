package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import helper.BaseTest;
import pages.HomePageTabPage;

public class HomePageTabTest extends BaseTest {
	    	
	@Test(priority=1)
	public void TC_01_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);

		hpt.clickScheduleConsultationbtn();
		
		System.out.println("TC_01_Executed");
	}
	//,dependsOnMethods= {"TC_01_Homepage_Tab"}
	@Test(priority=2)
	public void TC_02_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);

		hpt.ClickServiceButton();	
		hpt.verifyLink(driver,"https://www.magicgovern.ai/solutions/");
		System.out.println("TC_02_Executed");
	}
	
	//,dependsOnMethods= {"TC_02_Resource_Tab"}
	@Test(priority = 3)
	public void TC_03_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickTownship();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/solutions/managed-services/");
		
		System.out.println("TC_03_Executed");
		
	}
	
	//,dependsOnMethods= {"TC_02_Resource_Tab"}
	@Test(priority = 4)
	public void TC_04_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickTradencomm();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/solutions/it-consulting-advisory/");
		
		System.out.println("TC_04_Executed");
		
	}
	
	//,dependsOnMethods= {"TC_02_Resource_Tab"}
	@Test(priority = 5)
	public void TC_05_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickHealthcare();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/solutions/cyber-security/");
		
		System.out.println("TC_05_Executed");
		
	}
	
	
	//,dependsOnMethods= {"TC_02_Resource_Tab"}
	@Test(priority = 6)
	public void TC_06_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickFinance();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/solutions/web-development/");
		
		System.out.println("TC_06_Executed");
		
	}
	
	
	@Test(priority = 7)
	public void TC_07_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickEnergy();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/solutions/mobile-development/");
		
		System.out.println("TC_07_Executed");
		
	}
	
	
	@Test(priority = 8)
	public void TC_08_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickAgriculture();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/solutions/cloud-services/");
		
		System.out.println("TC_08_Executed");
		
	}
	
	@Test(priority = 9)
	public void TC_09_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickViewAllSoln();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/solutions/");
		
		System.out.println("TC_09_Executed");
		
	}
	
	
	@Test(priority = 10)
	public void TC_10_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickIndustry();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/industries/industry-manufacturing/");
		
		System.out.println("TC_10_Executed");
		
	}
	
	
	@Test(priority = 11)
	public void TC_11_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickTransportation();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/industries/transportation-logistics/");
		
		System.out.println("TC_11_Executed");
		
	}
	
	@Test(priority = 12)
	public void TC_12_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickHealthcareNew();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/industries/healthcare/");
		
		System.out.println("TC_12_Executed");
		
	}
	
	@Test(priority = 13)
	public void TC_13_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickBank();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/industries/banks-insurance/");
		
		System.out.println("TC_13_Executed");
		
	}
	
	@Test(priority = 14)
	public void TC_14_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickConsultation();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/industries/consulting-providers/");
		
		System.out.println("TC_14_Executed");
		
	}
	
	@Test(priority = 15)
	public void TC_15_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickNonprofit();
		

		
		System.out.println("TC_15_Executed");
		
	}
	
	@Test(priority = 16)
	public void TC_16_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickViewIndustry();
		
		hpt.verifyLink(driver,"https://www.magicgovern.ai/industries/");
		
		System.out.println("TC_16_Executed");
		
	}
	
	@Test(priority = 17)
	public void TC_17_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickRightarrowButton();
		hpt.ClickLeftarrowButton();
				
		System.out.println("TC_17_Executed");
		
	}
	
	@Test(priority = 18)
	public void TC_18_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickRightarrowButton();
		hpt.ClickLeftarrowButton();
				
		System.out.println("TC_18_Executed");
		
	}
	
	@Test(priority = 19)
	public void TC_19_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickDataCenterViewMore();
				
		System.out.println("TC_19_Executed");
		
	}
	
	@Test(priority = 20)
	public void TC_20_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickCollaorationViewMore();
				
		System.out.println("TC_20_Executed");
		
	}
	
	@Test(priority = 21)
	public void TC_21_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickCollaorationViewMore();
				
		System.out.println("TC_21_Executed");
		
	}
	
	@Test(priority = 22)
	public void TC_22_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickCloudViewMore();
				
		System.out.println("TC_22_Executed");
		
	}
	
	@Test(priority =23)
	public void TC_23_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickSuccessStorriesCard1();
						
		hpt.verifyLink(driver,"https://www.magicgovern.ai/major-insurance-provider-saves-750k-per-month-with-big-data-migration/");
		
		System.out.println("TC_23_Executed");


	}
	
	@Test(priority = 24)
	public void TC_24_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickSuccessStorriesCard2();
						
		hpt.verifyLink(driver,"https://www.magicgovern.ai/maximizing-efficiency-with-proper-technology-implementation-coffee-success-story/");
		
		System.out.println("TC_24_Executed");


	}
	
	@Test(priority = 25)
	public void TC_25_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickSuccessStorriesCard3();
						
		hpt.verifyLink(driver,"https://www.magicgovern.ai/strategic-move-to-an-ai-supported-application-for-public-safety-travel-app-in-london/");
		
		System.out.println("TC_25_Executed");


	}
	
	@Test(priority = 26)
	public void TC_26_Homepage_Tab() {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.ClickCommentLeftArrow();
		hpt.ClickCommentRightArrow();
						
		System.out.println("TC_26_Executed");


	}
	
	@Test(priority = 27)
	public void TC_27_Homepage_Tab() throws InterruptedException {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.enterScheduleFormFields();
						
		System.out.println("TC_27_Executed");


	}
	
	@Test(priority = 28)
	public void TC_28_Homepage_Tab() throws InterruptedException {
		
		HomePageTabPage hpt = new HomePageTabPage(driver);
		
		hpt.enterupdateformFields();
						
		System.out.println("TC_28_Executed");


	} 
	
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	
}
