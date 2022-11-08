import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fox {

    public static void main(String[] args) throws InterruptedException {
        // webdriver setup
        System.setProperty("webdriver.gecko.driver","C:\\Users\\CODOID\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
        WebDriver fire = new FirefoxDriver();
        fire.manage().window().maximize();
        fire.get("https://www.youtube.com/");
        WebElement search = fire.findElement(By.xpath("//*[@class=\"ytd-searchbox\"]"));
        search.sendKeys("Naruto");
        search.click();

    }
}