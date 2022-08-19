package aroggo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CatgoriesShow {
    private WebDriver driver;
    public void setup(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.arogga.com/");
        WebElement catagoriesShow = driver.findElement(By.className("sidebar_container"));
        catagoriesShow.click();

        System.out.println(driver.getTitle());

    }
    //public static void main(String args[]){
      //  HomePage test = new HomePage();
        //test.setup();
    //}
    public static void main(String args[]){
       CatgoriesShow show = new CatgoriesShow();
       show.setup();
    }
}
