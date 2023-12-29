package academy.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class fileUpload {
    public static void main(String [] args) throws InterruptedException, IOException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://altoconvertpdftojpg.com/");
        driver.findElement(By.xpath("//button[@id='browse']")).click();
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\Users\\pescalon\\Documents\\fileupload.exe");




    }
}
