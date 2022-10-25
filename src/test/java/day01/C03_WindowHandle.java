package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle()); //CDwindow-D062C2AE9EEA69E65ABC070FD22D2C12
        //farkli pencereler arasinda gezinebilmek icin getWindewHandle() methodunu kullaniriz.

    }
}
