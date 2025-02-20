package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import helper.BaseTest;
import pages.ResourceTabPage;

public class ResourceTabTest extends BaseTest {
	    	
	@Test(priority=1)
	public void TC_01_Resource_Tab() {
		
		ResourceTab();
		
		System.out.println("TC_01_Executed");
	}
	
	@Test(priority=2)
	public void TC_02_Resource_Tab() {
		
		ResourceTab();
		
		System.out.println("TC_02_Executed");
	}
	
	
	@Test(priority = 3)
	public void TC_03_Resource_Tab() {
		
		ResourceTabPage rt = new ResourceTabPage(driver);
		
		ResourceTab();
		rt.clickScheduleConsultation();
		rt.verifyLink(driver,"https://www.magicgovern.ai/contact/");
		
		System.out.println("TC_03_Executed");
		
	}
	
	@Test(priority = 4)
	public void TC_04_Resource_Tab() {
		
		ResourceTabPage rt = new ResourceTabPage(driver);
		
		ResourceTab();
		rt.clickScheduleConsultation();
		rt.verifyScheduleConsultationButtonPresense(driver);

		System.out.println("TC_04_Executed");
		
	}
	
	@Test(priority = 5)
	public void TC_05_Resource_Tab() {
		
		ResourceTabPage rt = new ResourceTabPage(driver);
		
		ResourceTab();
		rt.clickScheduleConsultation();
		rt.clickScheduleConsultationButton();
			
		System.out.println("TC_05_Executed");
		
	}
	
	@Test(priority = 6)
	public void TC_06_Resource_Tab() {
		
		ResourceTabPage rt = new ResourceTabPage(driver);
		
		ResourceTab();
		rt.clickScheduleConsultation();
		rt.clickgetDirectionFlorida();
		//rt.verifyLink(driver,"https://www.google.com/maps/place/28200+Old+41+Rd+%23208,+Bonita+Springs,+FL+34135,+USA/@26.3286151,-81.7838639,17z/data=!3m1!4b1!4m6!3m5!1s0x88db1980fda97993:0x19955ffaffb85928!8m2!3d26.3286151!4d-81.781289!16s%2Fg%2F11mbm_j9l_?entry=ttu&g_ep=EgoyMDI0MTIwOS4wIKXMDSoASAFQAw%3D%3D");
			
		System.out.println("TC_06_Executed");
		
	}
	
	@Test(priority = 7)
	public void TC_07_Resource_Tab() {
		
		ResourceTabPage rt = new ResourceTabPage(driver);
		
		ResourceTab();
		rt.clickScheduleConsultation();
		rt.clickgetDirectionGeorgia();
//		rt.verifyLink(driver,"https://www.google.com/maps/place/3565+Piedmont+Rd+NE+Building+2,+Suite+200,+Atlanta,+GA+30305,+USA/@33.8525078,-84.3817183,17z/data=!3m1!4b1!4m5!3m4!1s0x88f50fb1e1ba1fbb:0xe6492b96ce846a2a!8m2!3d33.8525078!4d-84.3795296?coh=164777&entry=tt&shorturl=1");

		System.out.println("TC_07_Executed");
		
	}
	
	@Test(priority = 8)
	public void TC_08_Resource_Tab() {
		
		ResourceTabPage rt = new ResourceTabPage(driver);
		
		ResourceTab();
		rt.clickScheduleConsultation();
		rt.clickgetDirectionKansas();
//		rt.verifyLink(driver,"https://www.google.com/maps/place/12421+W+151st+St+%23100,+Olathe,+KS+66000,+USA/@38.8548517,-94.8086021,17z/data=!3m1!4b1!4m5!3m4!1s0x87c0be7979dd177f:0xcf79a730343a16b!8m2!3d38.8548517!4d-94.8060272?entry=ttu&g_ep=EgoyMDI0MTIwOS4wIKXMDSoASAFQAw%3D%3D");

		System.out.println("TC_08_Executed");
		
	}
	
	@Test(priority = 9)
	public void TC_09_Resource_Tab() {
		
		ResourceTabPage rt = new ResourceTabPage(driver);
		
		ResourceTab();
		rt.clickEvents();
		rt.verifyLink(driver,"https://www.magicgovern.ai/events/");
		
		System.out.println("TC_09_Executed");
		
	}

		@Test(priority = 10)
		public void TC_10_Resource_Tab() {
			
			ResourceTabPage rt = new ResourceTabPage(driver);
			
			ResourceTab();
			rt.clickEvents();
			rt.verifyregisterTodayButtonPresense(driver);
			
			System.out.println("TC_10_Executed");
			
		}
		
		@Test(priority = 11)
		public void TC_11_Resource_Tab() {
			
			ResourceTabPage rt = new ResourceTabPage(driver);
			
			ResourceTab();
			rt.clickEvents();
			rt.clickRegisterToday();
			rt.verifyLink(driver,"https://www.magicgovern.ai/events/microsoft-teams-the-productivity-swiss-army-knife/");

			System.out.println("TC_11_Executed");
			
		}
		
		@Test(priority = 12)
		public void TC_12_Resource_Tab() {
			
			ResourceTabPage rt = new ResourceTabPage(driver);
			
			ResourceTab();
			rt.clickEvents();
			rt.clickRegisterToday();
			rt.verifyLink(driver,"https://www.magicgovern.ai/events/microsoft-teams-the-productivity-swiss-army-knife/");
			rt.clickSecondaryRegisterToday();

			System.out.println("TC_12_Executed");
			
		}
		
		@Test(priority = 13)
		public void TC_13_Resource_Tab() {
			
			ResourceTabPage rt = new ResourceTabPage(driver);
			
			ResourceTab();
			rt.clickEvents();
			rt.clickRegisterToday();
			rt.verifyLink(driver,"https://www.magicgovern.ai/events/microsoft-teams-the-productivity-swiss-army-knife/");
			rt.clickSecondaryRegisterToday();
			rt.verifyEventRegistrationFormPresense(driver);

			System.out.println("TC_13_Executed");
			
		}
		
		@Test(priority = 14)
		public void TC_14_Resource_Tab() throws InterruptedException {
			
			ResourceTabPage rt = new ResourceTabPage(driver);
			
			ResourceTab();
			rt.clickEvents();
			rt.clickRegisterToday();
			rt.verifyLink(driver,"https://www.magicgovern.ai/events/microsoft-teams-the-productivity-swiss-army-knife/");
			rt.clickSecondaryRegisterToday();
			rt.enterRegisterTodayFormFields();

			System.out.println("TC_14_Executed");
			
		}
		
		@Test(priority = 15)
		public void TC_15_Resource_Tab() {
			
			ResourceTabPage rt = new ResourceTabPage(driver);
			
			ResourceTab();
			rt.clickScheduleConsultation();
			rt.clickScheduleConsultationButton();
				
			System.out.println("TC_15_Executed");
			
		}
	
		@Test(priority = 16)
		public void TC_16_Resource_Tab() throws InterruptedException {
			
			ResourceTabPage rt = new ResourceTabPage(driver);
			
			ResourceTab();
			rt.clickScheduleConsultation();
			rt.clickScheduleConsultationButton();
			rt.enterScheduleFormFields();
				
			System.out.println("TC_16_Executed");
			
		}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	public void ResourceTab() {
		
		ResourceTabPage rT = new ResourceTabPage(driver);
		rT.clickResourceTab();

	}
	
}
