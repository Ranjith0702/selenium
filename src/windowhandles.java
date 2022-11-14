import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class windowhandles {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver wh = new ChromeDriver();
        wh.manage().window().maximize();
        wh.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        wh.findElement(By.xpath("//button[@id=\"newWindowsBtn\"]")).click();

                String parent=wh.getWindowHandle();
               // wh.findElement(By.xpath("//*[@title=\"Search Jobs\"]")).click();

                Set<String> child =wh.getWindowHandles();
                List<String> childlist = new ArrayList<>(child);
        System.out.println(childlist);
        Thread.sleep(1000);
        wh.switchTo().window(childlist.get(1));
        Thread.sleep(1000);
        wh.switchTo().window(childlist.get(2));
      wh.findElement(By.xpath("//div[@class=\"container\"]/child::input[@name=\"name\"]/preceding::input")).click();

        Thread.sleep(1000);
        //        for (int i=0;i<count;i++) {
//
//            if (!parent.equals(child_window)) {
//                wh.switchTo().window(child_window);
//
//                System.out.println(wh.switchTo().window(child_window).getTitle());
//                wh.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Ranjith");
//                wh.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Kumar");
//                Thread.sleep(3000);
//                wh.close();
//            }


        wh.switchTo().window(parent);
        Thread.sleep(2000);
        wh.quit();

            }
        }