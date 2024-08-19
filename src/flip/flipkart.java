package flip;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class flipkart {

    public static void main(String[] args) throws InterruptedException, IOException {
    	 ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        try {
            driver.get("https://www.flipkart.com/");
            driver.manage().window().maximize();
           driver.findElement(By.xpath("//span[text()='Appliances']")).click();  
           driver.findElement(By.xpath("//div[text()='IFB 6 kg Fully Automatic Front Load Washing Machine with In-built Heater White']")).click();
            Thread.sleep(5000);
            
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);

            String dest = "C:\\Users\\P10\\Desktop\\Navami\\screenshotselenium2.png";
            File destination = new File(dest);
            
            Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            
        } finally {
            
            driver.quit();
        }
    }
}














































//package flip;
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class flipkart {
//
//    public static void main(String[] args) throws InterruptedException, IOException {
//    	
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        
//        try {
//            driver.get("https://www.flipkart.com/");
//            driver.manage().window().maximize();
//            driver.findElement(By.xpath("//span[text()='Furniture']")).click();
//            driver.findElement(By.xpath("//a[@href='/offers-list/bed-room-furniture?screen=dynamic&pk=themeViews%3DBBD20-Bedroom-Fur%3ADesktopview~widgetType%3DdealCard~contentType%3Dneo&wid=1.dealCard.OMU_1&otracker=clp_omu_Bed%2BRoom%2BFurniture%2B_idsale-store_1&otracker1=clp_omu_PINNED_neo%2Fmerchandising_Bed%2BRoom%2BFurniture%2B_NA_wc_view-all_1']")).click();
//            driver.findElement(By.xpath("//div[text()='Office Study table']")).click();
//            
//            WebElement clickableElement = wait.until(
//                ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='wjcEIp']"))
//            );
//            
//            clickableElement.click();
//            Thread.sleep(5000);
//            
//            TakesScreenshot ts = (TakesScreenshot) driver;
//            File source = ts.getScreenshotAs(OutputType.FILE);
//
//            String dest = "C:\\Users\\P10\\Desktop\\Navami\\screenshotselenium.png";
//            File destination = new File(dest);
//            
//            // Use Java NIO to copy the file
//            Files.copy(source.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
//            
//        } finally {
//            
//            driver.quit();
//        }
//    }
//}
