package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    /*
    Amazon sayfasina gidiniz
    Arama kutusunu locate ediniz
    Arama kutusunun tagName inin input oldugunu test ediniz
    Arama kutusunun name atributunu n degerinin field-keywords oldugunu test ediniz
    sayfayi kapatiniz
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://amazon.com");

        //Arama kutusunu locate ediniz
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //Arama kutusunun tagName inin input oldugunu test ediniz
        String exceptedTagName = "input";
        String actualTagName = aramaKutusu.getTagName();
        if (actualTagName.equals(exceptedTagName)){
            System.out.println("TagName TESTİ PASSED : " + actualTagName);
        }else System.out.println("TagName TESTİ FAİLED : " + actualTagName);

        //Arama kutusunun name atributunu n degerinin field-keywords oldugunu test ediniz

        String exceptedAtributuName = "field-keywords";
        String actualAtributuName = aramaKutusu.getAttribute("name");
        if (actualAtributuName.equals(exceptedAtributuName)){
            System.out.println("Atribute TESTİ PASSED");
        }else System.out.println("Atribute TESTİ FAILED");

        // Arama kutusunun konumunu yazdirin

        System.out.println("Arama kutusunun konumu : " + aramaKutusu.getLocation());



    }
}
