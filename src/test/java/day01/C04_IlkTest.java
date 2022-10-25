package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*
        1- Amazon sayfasına gidiniz
        2- Başlığın "Amazon" içerdiğini test ediniz
        3- Url'nin amazon içerdiğini test ediniz
        4- Sayfayı kapatınız
         */
        driver.get("https://amazon.com");
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";

        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title test PASSED");
        }

        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";

        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAILED");

        driver.close();

    }
}
