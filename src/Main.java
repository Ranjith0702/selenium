import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
import java.util.List;

import static java.lang.Thread.*;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        // webdriver setup
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.netflix.com/");

        //method to send values to textboxes
        driver.findElement(By.id("id_email_hero_fuji")).sendKeys("ranji0702@gmail.com");
        sleep(2000);

        //method to click the anything
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[1]/div[2]/form/div/div/button/span[1]")).click();
        sleep(1000);

        //method to move cursor to specific point
        WebElement signin = driver.findElement(By.linkText("Sign In"));
        Actions daac = new Actions(driver);
        daac.moveToElement(signin).perform();
        sleep(1000);
        daac.click().perform();
        sleep(1000);
        driver.findElement(By.id("id_password")).sendKeys("Ranji@2505");
        sleep(1000);

        //method to verify checkbox or radio buttons are selected
        WebElement checkbox = driver.findElement(By.xpath("//*[@class=\"login-remember-me-label-text\"]"));
        //System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());

        //method to verify selected value is displayed
        System.out.println(checkbox.isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/button")).click();
        sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"formstart\"]/button/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div[2]/div/div[2]/button")).click();

        // Used to store all the values of same class into a list to print them
        List<WebElement> all = driver.findElements(By.xpath("//*[@class=\"planGrid__selectorLabel planGrid__planLabel\"]"));
        System.out.println(all.size());
        for (int i = 0; i < all.size(); i++) {
            sleep(2000);

            //method to read the text in the text box
            System.out.println(all.get(i).getText());
        }
        driver.quit();
    }
}