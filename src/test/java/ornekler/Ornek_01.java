package ornekler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ornek_01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        System.out.println("Sayfanin basligi : " + driver.getTitle());

        String istenenKelime = "Amazon";

        if (driver.getTitle().contains(istenenKelime)){
            System.out.println("Baslik Amazon kelimesi iceriyor TEST BASARILI");
        }else System.out.println("TEST BASARISIZ");

        System.out.println("Sayfanin Url'si : " + driver.getCurrentUrl());

        String arananKelime = "amazon";
        if (driver.getCurrentUrl().contains(arananKelime)){
            System.out.println("Url amazon iceriyor TEST BASARILI");
        }else System.out.println("TEST BASARISIZ");

        System.out.println("Sayfanin Handle degeri : " + driver.getWindowHandle());

        //System.out.println(driver.getPageSource());
        String aradigimKelime = "Geteway";

        if (driver.getPageSource().contains(aradigimKelime)){
            System.out.println("Kaynak Kodlarından Gateway var TEST BASARILI");
        }else System.out.println("TEST BASARISIZ");

        driver.close();




    }
}
