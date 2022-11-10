//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.PageFactory;
//
//import static java.lang.Thread.sleep;
//
//public class sample {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        // webdriver setup
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CODOID\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.netflix.com/");
//
//        //method to send values to textboxes
////        driver.findElement(By.id("id_email_hero_fuji")).sendKeys("ranji0702@gmail.com");
//        sleep(2000);
//
//        //method to click the anything
//        driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[1]/div[2]/form/div/div/button/span[1]")).click();
//        sleep(1000);
//
//        //method to move cursor to specific point
//        WebElement signin = driver.findElement(By.linkText("Sign In"));
//        Actions daac = new Actions(driver);
//        daac.moveToElement(signin).perform();
//        sleep(1000);
//        daac.click().perform();
//        sleep(1000);
////        driver.findElement(By.id("id_password")).sendKeys("Ranji@2505");
//        sleep(1000);
//   //     driver.findElement(By.xpath("//button[@class=\"btn login-button btn-submit btn-small\"]")).click();
//        PageFactory.initElements((driver,samplelogin.class));
//        samplelogin.email.sendKeys("ranji0702@gmail.com");
//        samplelogin.password.sendKeys("Ranji@2505");
//        samplelogin.signup.click();
//    }
//}