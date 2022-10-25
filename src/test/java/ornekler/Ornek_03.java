package ornekler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ornek_03 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        /*
        1.Yeni bir class olusturalim (Homework)
        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        yazdirin.
        4.https://www.walmart.com/ sayfasina gidin.
        5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        6. Tekrar “facebook” sayfasina donun
        7. Sayfayi yenileyin
        8. Sayfayi tam sayfa (maximize) yapin
        9.Browser’i kapatin
         */

        driver.get("https://www.facebook.com");
        System.out.println("Sayfanin basligi : " + driver.getTitle());
        String baslik = "facebook";
        if (driver.getTitle().contains("facebook")){
            System.out.println("Baslik dogru");
        }else System.out.println("Baslik yanlis");

        System.out.println("Sayfanin Url'si : " + driver.getCurrentUrl());
        String url = "facebook";
        if (driver.getCurrentUrl().contains(url)){
            System.out.println("Url dogru");
        }else System.out.println("Url yanlış. Dogru Url");



        driver.get("https://www.walmart.com/");
        System.out.println("Sayfanin basligi : " + driver.getTitle());

        Thread.sleep(3000);
        driver.navigate().back();

        Thread.sleep(5000);
        driver.navigate().refresh();

        driver.manage().window().maximize();
        driver.close();





    }
}
