package aroggo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrivacyPolicy {
    private WebDriver driver;
    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.arogga.com/");
        WebElement privacypolicy= driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/div[2]/footer/div[1]/div/div/div[1]/div/p[2]"));
        privacypolicy.click();

        System.out.println(driver.getTitle());

    }
    //public static void main(String args[]){
    //  HomePage test = new HomePage();
    //test.setup();
    //}
    public static void main(String args[]){
        PrivacyPolicy privacyPolicyshow= new PrivacyPolicy();
        privacyPolicyshow.setup();
    }
}
