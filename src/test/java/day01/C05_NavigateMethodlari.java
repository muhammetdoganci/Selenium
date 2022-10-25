package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //driver.navigate().to() methodu sayfaya ileri geri yapacaksak kullanilir
        //driver.get() methodu gibi istedigimiz url ye götürür

        driver.navigate().to("https://techproeducation.com");

        //tekrar amazon sayfasina dönelim
        Thread.sleep(3000);
        driver.navigate().back();

        //tekrar tecPro sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        //techproed sayfasını yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        //son olarak sayfayı kapatınız
        driver.quit();



    }
}
