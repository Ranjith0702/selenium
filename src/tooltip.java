import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver ttip = new ChromeDriver();
        ttip.manage().window().maximize();
        ttip.get("http://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
        Actions tip = new Actions(ttip);
        tip.moveToElement(ttip.findElement(By.xpath("//a[text()='Hover over me']"))).perform();
        String data = ttip.findElement(By.xpath("//div[@class=\"tooltip-inner\"]")).getText();
        System.out.println(data);
        ttip.close();

    }
}
