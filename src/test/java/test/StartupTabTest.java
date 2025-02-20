package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import helper.BaseTest;
import pages.StartupTabPage;

public class StartupTabTest extends BaseTest {
	    	
	@Test(priority=1)
	public void TC_65_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		
		System.out.println("TC_65_Executed");
	}
	//,dependsOnMethods= {"TC_65_Startup_Tab"}
	@Test(priority=2)
	public void TC_66_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickazure();
		st.verifyLink(driver, "https://azure.microsoft.com/en-us/");

		
		System.out.println("TC_66_Executed");
	}
	
	//,dependsOnMethods= {"TC_66_Startup_Tab"}
	@Test(priority=3)
	public void TC_67_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickbird();
		st.verifyLink(driver, "https://x.com/intent/post?text=%E2%80%9CEven+if+we+do+not+talk+about+5G+%28specifically%29%2C+the+security+talent+in+general+in+the+country+is+very+sparse+at+the+moment.+We+need+to+get+more+%28security%29+professionals+in+the+system%E2%80%9D&url=https%3A%2F%2Fwww.magicgovern.ai%2Fhow-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers%2F");

		
		System.out.println("TC_67_Executed");
	}
	
	//,dependsOnMethods= {"TC_67_Startup_Tab"}
	@Test(priority=4)
	public void TC_68_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickcybersecurity();
		st.verifyLink(driver, "https://www.magicgovern.ai/tag/cybersecurity/");

		
		System.out.println("TC_68_Executed");
	}
	
	//,dependsOnMethods= {"TC_68_Startup_Tab"}
	@Test(priority=5)
	public void TC_69_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickdevelopment();
		st.verifyLink(driver, "https://www.magicgovern.ai/tag/development/");

		
		System.out.println("TC_69_Executed");
	}
	
	//,dependsOnMethods= {"TC_69_Startup_Tab"}
	@Test(priority=6)
	public void TC_70_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickit();
		st.verifyLink(driver, "https://www.magicgovern.ai/tag/it/");

		
		System.out.println("TC_70_Executed");
	}
	
	//,dependsOnMethods= {"TC_70_Startup_Tab"}
	@Test(priority=7)
	public void TC_71_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickcomment();
		
		System.out.println("TC_71_Executed");
	}
	
	//,dependsOnMethods= {"TC_71_Startup_Tab"}
	@Test(priority=8)
	public void TC_72_Startup_Tab() throws InterruptedException {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.tc_72();
		
		System.out.println("TC_72_Executed");
	}
	
	//,dependsOnMethods= {"TC_72_Startup_Tab"}
	@Test(priority=9)
	public void TC_73_Startup_Tab() throws InterruptedException {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.tc_73();
		
		System.out.println("TC_73_Executed");
	}
	
	//,dependsOnMethods= {"TC_73_Startup_Tab"}
	@Test(priority=10)
	public void TC_74_Startup_Tab() throws InterruptedException {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.tc_74();
		
		System.out.println("TC_74_Executed");
	}
	
	//,dependsOnMethods= {"TC_74_Startup_Tab"}
	@Test(priority=11)
	public void TC_75_Startup_Tab() throws InterruptedException {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.tc_75();
		
		System.out.println("TC_75_Executed");
	}
	
	//,dependsOnMethods= {"TC_75_Startup_Tab"}
	@Test(priority=12)
	public void TC_76_Startup_Tab() throws InterruptedException {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.tc_76();
		
		System.out.println("TC_76_Executed");
	}
	
	//,dependsOnMethods= {"TC_76_Startup_Tab"}
	@Test(priority=13)
	public void TC_77_Startup_Tab() throws InterruptedException {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.tc_77();
		
		System.out.println("TC_77_Executed");
	}
	//check
	//,dependsOnMethods= {"TC_77_Startup_Tab"}
	@Test(priority=14)
	public void TC_77_a_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickazure();
		st.verifyLink(driver, "https://azure.microsoft.com/en-us/");

		
		System.out.println("TC_77_a_Executed");
	}
	
	//,dependsOnMethods= {"TC_77_a_Startup_Tab"}
	@Test(priority=15)
	public void TC_78_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickmanageservices();
		st.verifyLink(driver, "https://www.magicgovern.ai/solutions/managed-services/");

		
		System.out.println("TC_78_Executed");
	}
	
	//,dependsOnMethods= {"TC_78_Startup_Tab"}
	@Test(priority=16)
	public void TC_79_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickitservice();
		st.verifyLink(driver, "https://www.magicgovern.ai/solutions/it-consulting-advisory/");

		
		System.out.println("TC_79_Executed");
	}
	
	
	//,dependsOnMethods= {"TC_79_Startup_Tab"}
	@Test(priority=17)
	public void TC_80_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickmobiledev();
		st.verifyLink(driver, "https://www.magicgovern.ai/solutions/mobile-development/");

		
		System.out.println("TC_80_Executed");
	}
	
	//,dependsOnMethods= {"TC_80_Startup_Tab"}
	@Test(priority=18)
	public void TC_81_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickcloud();
		st.verifyLink(driver, "https://www.magicgovern.ai/solutions/cloud-services/");

		
		System.out.println("TC_81_Executed");
	}
	
	//,dependsOnMethods= {"TC_81_Startup_Tab"}
	@Test(priority=19)
	public void TC_82_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickcyber();
		st.verifyLink(driver, "https://www.magicgovern.ai/solutions/cyber-security/");

		
		System.out.println("TC_82_Executed");
	}

	//,dependsOnMethods= {"TC_82_Startup_Tab"}
	@Test(priority=20)
	public void TC_83_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clicknetwork();
		st.verifyLink(driver, "https://www.magicgovern.ai/solutions/network-connectivity/");

		
		System.out.println("TC_83_Executed");
	}
	
	//,dependsOnMethods= {"TC_83_Startup_Tab"}
	@Test(priority=21)
	public void TC_84_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickweb();
		st.verifyLink(driver, "https://www.magicgovern.ai/solutions/web-development/");

		
		System.out.println("TC_84_Executed");
	}
	
	//,dependsOnMethods= {"TC_84_Startup_Tab"}
	@Test(priority=22)
	public void TC_85_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickerp();
		st.verifyLink(driver, "https://www.magicgovern.ai/solutions/erp-solutions/");

		
		System.out.println("TC_85_Executed");
	}
	
	//,dependsOnMethods= {"TC_85_Startup_Tab"}
	@Test(priority=23)
	public void TC_86_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickabout();
		st.verifyLink(driver, "https://www.magicgovern.ai/about/");

		
		System.out.println("TC_86_Executed");
	}
	
	//,dependsOnMethods= {"TC_86_Startup_Tab"}
	@Test(priority=24)
	public void TC_87_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickblog();
		st.verifyLink(driver, "https://www.magicgovern.ai/blog/");

		
		System.out.println("TC_87_Executed");
	}
	
	//,dependsOnMethods= {"TC_87_Startup_Tab"}
	@Test(priority=25)
	public void TC_88_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickwhyus();
		st.verifyLink(driver, "https://www.magicgovern.ai/why-us/");

		
		System.out.println("TC_88_Executed");
	}
	
	//,dependsOnMethods= {"TC_88_Startup_Tab"}
	@Test(priority=26)
	public void TC_89_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickcase();
		st.verifyLink(driver, "https://www.magicgovern.ai/case-studies/");

		
		System.out.println("TC_89_Executed");
	}
	
	//,dependsOnMethods= {"TC_89_Startup_Tab"}
	@Test(priority=27)
	public void TC_90_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickteam();
		st.verifyLink(driver, "https://www.magicgovern.ai/team/");

		
		System.out.println("TC_90_Executed");
	}
	
	//,dependsOnMethods= {"TC_90_Startup_Tab"}
	@Test(priority=28)
	public void TC_91_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickevents();
		st.verifyLink(driver, "https://www.magicgovern.ai/events/");

		
		System.out.println("TC_91_Executed");
	}
	
	//,dependsOnMethods= {"TC_91_Startup_Tab"}
	@Test(priority=29)
	public void TC_92_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickcareer();
		st.verifyLink(driver, "https://www.magicgovern.ai/careers/");

		
		System.out.println("TC_92_Executed");
	}
	
	//,dependsOnMethods= {"TC_92_Startup_Tab"}
	@Test(priority=30)
	public void TC_93_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickfaq();
		st.verifyLink(driver, "https://www.magicgovern.ai/faq/");

		
		System.out.println("TC_93_Executed");
	}
	
	//,dependsOnMethods= {"TC_93_Startup_Tab"}
	@Test(priority=31)
	public void TC_94_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickpartner();
		st.verifyLink(driver, "https://www.magicgovern.ai/partnerships/");

		
		System.out.println("TC_94_Executed");
	}
	
	//,dependsOnMethods= {"TC_94_Startup_Tab"}
	@Test(priority=32)
	public void TC_95_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickreview();
		st.verifyLink(driver, "https://www.magicgovern.ai/reviews-awards/");

		
		System.out.println("TC_95_Executed");
	}
	
	//,dependsOnMethods= {"TC_95_Startup_Tab"}
	@Test(priority=33)
	public void TC_96_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickclutch();
		st.verifyLink(driver, "https://clutch.co/profile/red-key-solutions#summary");

		
		System.out.println("TC_96_Executed");
	}
	
	//,dependsOnMethods= {"TC_96_Startup_Tab"}
	@Test(priority=34)
	public void TC_97_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clicklocation();
//		st.verifyLink(driver, "https://www.google.com/maps/place/WeWork+Office+Space+%26+Coworking/@40.7532064,-74.0243453,14z/data=!4m6!3m5!1s0x89c2593c748dd72f:0x71cfc30dce729157!8m2!3d40.753358!4d-73.9897566!16s%2Fg%2F11gh63n3wc?entry=ttu&g_ep=EgoyMDI0MTIxMS4wIKXMDSoASAFQAw%3D%3D");

		
		System.out.println("TC_97_Executed");
	}
	
	//,dependsOnMethods= {"TC_97_Startup_Tab"}
	@Test(priority=35)
	public void TC_98_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clicktel();

		
		System.out.println("TC_98_Executed");
	}
	
	//,dependsOnMethods= {"TC_98_Startup_Tab"}
	@Test(priority=36)
	public void TC_99_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickmailto();

		
		System.out.println("TC_99_Executed");
	}
	
	//,dependsOnMethods= {"TC_99_Startup_Tab"}
	@Test(priority=37)
	public void TC_100_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clicklinkedin();
		st.verifyLink(driver, "https://www.linkedin.com/");

		
		System.out.println("TC_100_Executed");
	}
	
	//,dependsOnMethods= {"TC_100_Startup_Tab"}
	@Test(priority=38)
	public void TC_101_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickgithub();
		st.verifyLink(driver, "https://github.com/");

		
		System.out.println("TC_101_Executed");
	}
	
	//,dependsOnMethods= {"TC_101_Startup_Tab"}
	@Test(priority=39)
	public void TC_102_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clicktwitter();
//		st.verifyLink(driver, "https://x.com/i/flow/login?redirect_after_login=%2Fvamtam");
		
		System.out.println("TC_102_Executed");
	}
	
	//,dependsOnMethods= {"TC_102_Startup_Tab"}
	@Test(priority=40)
	public void TC_103_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickfacebook();
		st.verifyLink(driver, "https://www.facebook.com/");

		
		System.out.println("TC_103_Executed");
	}
	
	//,dependsOnMethods= {"TC_103_Startup_Tab"}
	@Test(priority=41)
	public void TC_103_a_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickyoutube();
		st.verifyLink(driver, "https://www.youtube.com/");

		
		System.out.println("TC_103_a_Executed");
	}
	
	//,dependsOnMethods= {"TC_103_a_Startup_Tab"}
	@Test(priority=42)
	public void TC_104_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clicktnc();
		st.verifyLink(driver, "https://www.magicgovern.ai/terms-conditions/");

		
		System.out.println("TC_104_Executed");
	}
	
	//,dependsOnMethods= {"TC_104_Startup_Tab"}
	@Test(priority=43)
	public void TC_105_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickprivacypolicy();
		st.verifyLink(driver, "https://www.magicgovern.ai/privacy-policy/");

		
		System.out.println("TC_105_Executed");
	}
	
	//,dependsOnMethods= {"TC_105_Startup_Tab"}
	@Test(priority=44)
	public void TC_108_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickcustreview();
		st.verifyLink(driver, "https://clutch.co/profile/red-key-solutions#summary");

		
		System.out.println("TC_108_Executed");
	}
	
	//,dependsOnMethods= {"TC_108_Startup_Tab"}
	@Test(priority=45)
	public void TC_109_Startup_Tab() {
		
		StartupTabPage st = new StartupTabPage(driver);
		StartupTab();
		st.verifyLink(driver, "https://www.magicgovern.ai/how-startups-are-cutting-cloud-costs-renegotiating-deals-with-service-providers/");
		st.clickuserblog();
//		st.verifyLink(driver, "https://vamtam.com/");

		
		System.out.println("TC_109_Executed");
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	public void StartupTab() {
		
		StartupTabPage sT = new StartupTabPage(driver);
		sT.clickStartupTab();

	}
	
}
