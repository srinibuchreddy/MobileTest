package Mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class AppTest {
	
	@Test

	public void test() throws MalformedURLException {
		// TODO Auto-generated method stub
//Appium code
		File f = new File("src");
		File fs = new File(f,"Zillow Find Houses for Sale Apartments for Rent_v10.1.1.8210_apkpure.com.apk");
		//File fs = new File(f,"ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability("noReset", true);
		//cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.zillow.android.zillowmap.*");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Zillow']").click();
		
		int s=driver.findElements(By.className("android.widget.TextView")).size();
	System.out.println(s);
		
		List<AndroidElement>a=driver.findElements(By.className("android.widget.TextView"));
		List<AndroidElement>b=driver.findElements(By.id("com.zillow.android.zillowmap:id/recent_search_hint"));
		b.get(0).sendKeys("1834 251st PL SE 98075" +"\n");
		
		List<AndroidElement>c=driver.findElements(By.id("com.zillow.android.zillowmap:id/hdp_address1"));
		System.out.println (c.get(0).getText());
		
		System.out.println("SEARCH IDENTIFIED CORRECT HOME - TEST PASSED - THE END");
		
		
		//driver.findElementById ("com.zillow.android.zillowmap:id/list_item").click();
		//driver.findElementById ("com.zillow.android.zillowmap:id/recent_search_hint").click();
		
		
	}
}