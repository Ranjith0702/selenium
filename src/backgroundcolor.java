import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import java.awt.*;

public class backgroundcolor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver bgclr = new ChromeDriver();
        bgclr.manage().window().maximize();
        bgclr.get("https://www.tnpsc.gov.in/");
        WebElement wb = bgclr.findElement(By.xpath("//h4[@class=\"notice-title\"]//descendant::a[text()='Apply Online']"));
        Actions act = new Actions(bgclr);
        act.moveToElement(wb).perform();
        String clr = wb.getCssValue("background-color");
        System.out.println(clr);
        String bg = Color.fromString(clr).asHex();
        System.out.println(bg);
        if(bg.equals("#1a6194")){
            System.out.println("Color matched");
        }
        else {
            System.out.println("Color mismatch");
        }
        bgclr.close();
    }
}
