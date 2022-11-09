import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            WebDriver frms = new ChromeDriver();
            frms.manage().window().maximize();
            frms.get("http://demo.guru99.com/test/guru99home/");

            frms.switchTo().frame("a077aa5e"); //switching the frame by ID

            System.out.println("********We are switch to the iframe*******");
            frms.findElement(By.xpath("html/body/a/img")).click();

            System.out.println("*********We are done***************");
        }
    }

