package aroggo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeCall {
    private WebDriver driver;
    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.arogga.com/");
        WebElement makecall = driver.findElement(By.xpath("//*[@id=\"header__bottom\"]/div/div[2]/a[1]"));
       makecall.click();

        System.out.println(driver.getTitle());

    }
    //public static void main(String args[]){
    //  HomePage test = new HomePage();
    //test.setup();
    //}
    public static void main(String args[]){
        MakeCall makeCallsshow= new MakeCall();
        makeCallsshow.setup();
    }
}
