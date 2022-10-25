package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMeyhodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*

        Yeni bir Class olusturalim.C06_ManageWindow
        Amazon soyfasina gidelim. https://www.amazon.com/
        Sayfanin konumunu ve boyutlarini yazdirin
        Sayfayi simge durumuna getirin
        simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Sayfayi fullscreen yapin
        Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        Sayfayi kapatin

         */
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencerenin konumu : " + driver.manage().window().getPosition());
        System.out.println("Pencerenin olculeri : " + driver.manage().window().getSize());

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        Thread.sleep(5000);
        driver.manage().window().maximize();

        System.out.println("Yeni pencerenin konumu : " + driver.manage().window().getPosition());
        System.out.println("Yeni pencerenin olculeri : " + driver.manage().window().getSize());

        Thread.sleep(5000);

        //Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();
        System.out.println("fuulscreen pencerenin konumu : " + driver.manage().window().getPosition());
        System.out.println("fullscreen pencerenin olculeri : " + driver.manage().window().getSize());

        Thread.sleep(3000);

        //Sayfayi kapatin
        driver.close();


    }
}
