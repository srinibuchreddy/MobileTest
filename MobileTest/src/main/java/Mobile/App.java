package Mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class App {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
//Appium code
		File f = new File("src");
		File fs = new File(f,"Zillow Find Houses for Sale Apartments for Rent_v10.1.1.8210_apkpure.com.apk");
		//File fs = new File(f,"ApiDemos-debug.apk");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		cap.setCapability("noReset", true);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Zillow']").click();
		
		int s=driver.findElements(By.className("android.widget.TextView")).size();
		System.out.println(s);
		
		List<AndroidElement>a=driver.findElements(By.className("android.widget.TextView"));
		List<AndroidElement>b=driver.findElements(By.id("com.zillow.android.zillowmap:id/recent_search_hint"));
		b.get(0).sendKeys("1834 251st PL SE 98075" +"\n");
		//driver.findElementById ("com.zillow.android.zillowmap:id/list_item").click();
		//driver.findElementById ("com.zillow.android.zillowmap:id/recent_search_hint").click();
		
		
	}
}



//driver.findElementByClassName("android.widget.TextView").sendKeys("1834 251st PL SE 98075");


		//driver.findElementByClassName("android.widget.TextView").sendKeys("98075");
		
		//driver.findElementByXPath("android.widget.TextView[@Text='Address, city, ZIP, neighborhood']").sendKeys("1834 251st PL SE 98075");
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Address, city, ZIP, neighborhood']").click();
		
		//driver.findElementByXPath("//android.widget.TextView[@text='List']").click();
		
		//driver.findElementById ("com.zillow.android.zillowmap:id/list_item").click();
		
		//driver.findElementById("com.zillow.android.zillowmap:id/recent_search_hint").click();
		
		//driver.findElementById("com.zillow.android.zillowmap:id/list_item").click();
		
		
		
		//driver.findElementByXPath("")
		
		//com.zillow.android.zillowmap:id/recent_search_hint
