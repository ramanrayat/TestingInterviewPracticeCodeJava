package otherConceptJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;



public class makemytrip_selenium {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ramanrayat/Desktop/programing practice/test1/src/main/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
        driver.findElement(By.xpath("//span[text()='From']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bangkok");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.findElement(By.xpath("//span[text()='Bangkok']")).click();
        driver.findElement(By.xpath("//a[contains(@class,'widgetSearchBtn')]")).click();
        Thread.sleep(10000);
//        Thread.sleep(10000);
//        Boolean flag = driver.findElement(By.xpath("//span[text()='Flights from ']")).isDisplayed();
//        Assert.assertTrue(flag);
//        System.out.println(flag);
//        driver.quit();

    }
}
