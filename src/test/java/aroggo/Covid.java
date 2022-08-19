package aroggo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Covid {
    private WebDriver driver;
    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.arogga.com/");
        WebElement covid = driver.findElement(By.className("jss89"));
        covid.click();

        System.out.println(driver.getTitle());

    }
    //public static void main(String args[]){
    //  HomePage test = new HomePage();
    //test.setup();
    //}
    public static void main(String args[]){
        Covid covidshow = new Covid();
        covidshow.setup();
    }
}
