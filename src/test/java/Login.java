import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {

    WebDriver wd;


    @BeforeMethod
    public void  preCon(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
    }

    @Test
    public void SuccessLogin(){
        click(By.cssSelector("[href='/login']"));
        type(By.cssSelector("[placeholder='Email']"), "bobdilan182346@gmail.com");

        type(By.cssSelector("[placeholder='Password']"), "Bob12345$.com");
        click(By.xpath("//button[1]"));

    }
    private void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    private void click(By locator) {
        wd.findElement(locator).click();
    }
}
