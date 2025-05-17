package otherConceptJava;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.apache.commons.io.FileUtils;

import java.io.File;
import java.time.Duration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class testSelenium {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver");




        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");



        //Screenshot
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("screenshot.png");
        //FileUtils.copyFile(screenshotFile, destinationFile);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleIs("raman"));
        WebElement searchBar = driver.findElement(By.xpath("//textarea[@title=\"Search\"]"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        Set<String> s1 = new HashSet<String>();
        s1 = driver.getWindowHandles();

        Iterator i1 = s1.iterator();
        while (i1.hasNext()){
//            String child = i1.next();
        }


//        Wait fluentWait = new FluentWait().pollingEvery(5).withTimeout(20).ignoring(ElementNotInteractableException.class);
//        fluentWait.until(
//                ExpectedConditions.titleIs("hee"));
//
//        searchBar.sendKeys("raman rayat");

//        Actions ac = new Actions(driver);
//        ac.click().build().perform();






    }


}


