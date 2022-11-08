import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class windowhandles {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver wh = new ChromeDriver();
        wh.manage().window().maximize();
        wh.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        wh.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();

                String parent=wh.getWindowHandle();
               // wh.findElement(By.xpath("//*[@title=\"Search Jobs\"]")).click();

                Set<String> child =wh.getWindowHandles();

        for (String child_window : child) {

            if (!parent.equals(child_window)) {
                wh.switchTo().window(child_window);

                System.out.println(wh.switchTo().window(child_window).getTitle());
                wh.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Ranjith");
                wh.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Kumar");
                Thread.sleep(3000);
                wh.close();
            }

        }

        wh.switchTo().window(parent);
        Thread.sleep(2000);
        wh.quit();

            }
        }