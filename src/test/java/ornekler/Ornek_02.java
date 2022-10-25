package ornekler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ornek_02 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.youtube.com/");

        driver.navigate().to("https://www.amazon.com/");

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(3000);
        driver.navigate().forward();

        Thread.sleep(6000);
        driver.navigate().refresh();

        //Thread.sleep(3000);
        //driver.quit();




    }
}
