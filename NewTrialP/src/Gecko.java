import javafx.scene.input.DataFormat;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Gecko {
    public static void main(String[] args) throws InterruptedException {
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications");
        ChromeOptions op=new ChromeOptions();

        op.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver","src\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(op);

        driver.get("https://www.romanoriginals.co.uk");
        driver.manage().window().maximize();
        //Thread.sleep(4000);
//        driver.switchTo().window("")
//        Alert alert = driver.switchTo().alert();
//        driver.switchTo().frame("iframe_1554464509947_502");
        driver.switchTo().window("iframe_1554464509947_502");
        driver.switchTo().alert().dismiss();
        WebElement newin = driver.findElement(By.xpath("//a[@href=\"/en/wluk/category/new-in-265972\"]"));

       Actions actions=new Actions(driver);
//       actions.moveToElement(newin).build().perform();
//       Thread.sleep(5000);
//       driver.findElement(By.xpath("//span[contains(text(),\"New Dresses\")]")).click();

    }
}
