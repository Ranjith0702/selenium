import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.actions.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/text-box");

        //Create object of the Actions class
        Actions actions = new Actions(driver);

        Thread.sleep(1000);

        WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        fullName.sendKeys("Ranjith kumar");
        WebElement email=driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        email.sendKeys("ranji0702@gmail.com");
        Thread.sleep(1000);

        WebElement currentAddress=driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        currentAddress.sendKeys("43 School Lane London EC71 9GO");

        // Select the Current Address using CTRL + Actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        Thread.sleep(1000);

        //To perform Copy  CTRL + C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();

        //To use TAB
        actions.sendKeys(Keys.TAB);
        actions.build().perform();
        Thread.sleep(1000);
        //To perform paste CTRL + V
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();

       driver.close();

    }

}