import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class getattribute {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\CODOID\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver edge = new EdgeDriver();
        edge.manage().window().maximize();
        edge.get("https://www.youtube.com/");
        WebElement s = edge.findElement(By.xpath("//input[@id=\"search\"]"));
        s.sendKeys("Naruto");
        Thread.sleep(2000);
        String search= s.getAttribute("value");
        Thread.sleep(2000);
        System.out.println("The text in search box: "+search);
        edge.quit();
    }
    }
