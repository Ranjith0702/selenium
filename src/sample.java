import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver xpaxes = new ChromeDriver();
        xpaxes.manage().window().maximize();
        xpaxes.get("https://www.redbus.in/bus-tickets/chennai-to-bangalore?fromCityName=Chennai&fromCityId=123&toCityName=Bangalore&toCityId=122&onward=08-Nov-2022&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
        xpaxes.findElement(By.id("//*[@class=\"clearfix m-top-16\"]/child::div")).click();
    }
}
