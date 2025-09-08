package MobileTest.CalculatorTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AutomateCalc {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        // Gather Desired capabilities
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "SM-305F");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "uiautomator2");
        capabilities.setCapability("platformVersion", "11.0");
        
        capabilities.setCapability("appPackage", "com.sec.android.app.calculator");
        capabilities.setCapability("appActivity", "com.sec.android.app.calculator.Calculator");

        URL url = URI.create("http://192.168.1.6:4723/").toURL();
        
        AndroidDriver driver = new AndroidDriver(url, capabilities);
        Thread.sleep(5000);
        System.out.println("Application Started");
        
        // Click on number 8
        WebElement num8 = driver.findElement(By.id("com.sec.android.app.calculator:id/digit_8"));
        num8.click(); // Perform click action on number 8
        
        // Click on plus sign
        WebElement plus = driver.findElement(By.id("com.sec.android.app.calculator:id/op_add"));
        plus.click(); // Perform click action on plus sign
        
        // Click on number 2
        WebElement num2 = driver.findElement(By.id("com.sec.android.app.calculator:id/digit_2"));
        num2.click(); // Perform click action on number 2
        
        // Click on equal sign
        WebElement equal = driver.findElement(By.id("com.sec.android.app.calculator:id/btn_equal"));
        equal.click(); // Perform click action on equal sign
        
        // Click on result sign
        WebElement result = driver.findElement(By.id("com.sec.android.app.calculator:id/result"));
        String resultString = result.getText();
        
        // Check if the result is correct
        if (resultString.equals("10")) { // Assuming the expected result is 10
            System.out.println("Successful");
        } else {
            System.out.println("Fail");
        }
        
        driver.quit(); // Close session
    }
}
