import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


class intrfce implements face1 {
    public void full() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver in = new ChromeDriver();
        in.manage().window().maximize();
        in.get("https://www.netflix.com/");
        in.close();
    }
    public void power() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver in = new ChromeDriver();
        in.manage().window().maximize();
        in.get("https://www.netflix.com/");
        in.close();

    }


    public static void main(String[] args) {
        intrfce i1 = new intrfce();
        i1.full();
        intrfce i2 = new intrfce();
        i2.power();
    }
    }


