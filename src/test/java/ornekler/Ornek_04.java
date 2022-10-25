package ornekler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ornek_04 {
    public static void main(String[] args) throws InterruptedException {

        /*
        ClasslassWork : L oginoginTest
        1. Bir class oluşturun: LoginTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username :
        testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin
        testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://trendyol.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id=\"account-navigation-container\"]/div/div[2]/a/p")).sendKeys(Keys.ENTER);

        //driver.findElement(By.xpath("//*[@id=\"navigation-wrapper\"]/nav/ul/li[2]/a")).sendKeys(Keys.ENTER);
        //Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@id=\"browsing-gw-homepage\"]/div/div/div/article[1]/div/div/div[2]/a[6]")).sendKeys(Keys.ENTER);

        //driver.findElement(By.className("search-box")).sendKeys("gömlek"+ Keys.ENTER);
        //driver.findElement(By.xpath("//*[@id=\"sticky\"]/div/div[2]/div[2]/a[3]")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//*[@id=\"sticky\"]/div/div[3]/div[3]/a[1]")).sendKeys(Keys.ENTER);
        //driver.findElement(By.xpath("//*[@id=\"sticky\"]/div/div[14]/div[1]/a/div[2]")).sendKeys(Keys.ENTER);


        //Thread.sleep(3000);
        //driver.close();

    }
}
