import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTest {
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\REX\\Desktop\\jenkins\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("working");
    }
}
