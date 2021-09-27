package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test01_ABTesting {
    @Test
    public void test1_ABTesting() throws Exception {
        WebDriverManager.chromedriver().arch32().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://the-internet.herokuapp.com/");
        System.out.println("Page Title --> " + webDriver.getTitle());
        webDriver.findElement(By.linkText("A/B Testing")).click();
        System.out.println("\nPage Title -->" + webDriver.getTitle());
        System.out.println("Page Header --> " + webDriver.findElement(By.xpath("//h3")).getText());
        System.out.println("Page Content: \n" + webDriver.findElement(By.xpath("//p")).getText());
        webDriver.quit();
    }

}
