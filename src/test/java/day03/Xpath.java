package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {
    /*
    https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    2- Add Element butonuna basin
    Delete butonu’nun gorunur oldugunu test edin
    Delete tusuna basin
    “Add/Remove Elements” yazisinin gorunur oldugunu test edin

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        WebElement addElement = driver.findElement(By.xpath("//*[text()='Add Element']"));
        addElement.click();

        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButonu = driver.findElement(By.xpath("//*[text()='Delete']"));
        //boolean gorunurMu = deleteButonu.isDisplayed();
        //System.out.println("Delete butonu gorunur mu ? : " + gorunurMu);
        if (deleteButonu.isDisplayed()){
            System.out.println("Test Basarili");
        }else System.out.println("Test Basarisiz");

        Thread.sleep(3000);

        // Delete tusuna basin
        driver.findElement(By.xpath("//*[text()='Delete']")).click();

        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveYazısı = driver.findElement(By.xpath("//h3"));
        //WebElement addRemoveYazısı = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));

        if (addRemoveYazısı.isDisplayed()){
            System.out.println("Add/Remove yazisi gorunuyor TEST BASARILI");
        }else System.out.println("TEST BASARISIZ");

        //boolean yazıGoruluyorMu = addRemoveYazısı.isDisplayed();
        //System.out.println("Add/Remove Elements yazisi goruluyor mu ? : " + yazıGoruluyorMu);






    }
}
