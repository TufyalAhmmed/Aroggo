package aroggo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SexualWellness {
    private WebDriver driver;
    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.arogga.com/");
        WebElement sexualwellness = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[1]/div/ul/li[4]"));
        sexualwellness.click();

        System.out.println(driver.getTitle());

    }
    //public static void main(String args[]){
    //  HomePage test = new HomePage();
    //test.setup();
    //}
    public static void main(String args[]){
        SexualWellness sexualWellnessshow= new SexualWellness();
        sexualWellnessshow.setup();
    }
}
