import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxis {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver xpaxis = new ChromeDriver();
        xpaxis.manage().window().maximize();
        xpaxis.get("https://www.youtube.com/");
        xpaxis.close();

    }
}
