import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver dd = new ChromeDriver();
        dd.manage().window().maximize();
        dd.get("https://jqueryui.com/droppable/");
        dd.switchTo().frame(0);
        WebElement drag = dd.findElement(By.id("draggable"));
        WebElement drop = dd.findElement(By.id("droppable"));
        Actions daac = new Actions(dd);
        daac.dragAndDrop(drag, drop).perform();
        dd.close();
    }
}
