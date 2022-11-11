import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdown {
    public static String strColor = "Red";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver dropd = new ChromeDriver();
        dropd.get("https://demoqa.com/select-menu");
        dropd.manage().window().maximize();
        Select select = new Select(dropd.findElement(By.id("oldSelectMenu")));

        List<WebElement> lst = select.getOptions();
        for (WebElement elmntDropdownlist : lst) {
            if (strColor.equalsIgnoreCase(elmntDropdownlist.getText())) {
                select.selectByVisibleText(strColor);
                System.out.println("Red is present");
            }
        }
        dropd.quit();
    }

}