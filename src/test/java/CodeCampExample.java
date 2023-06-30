import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class CodeCampExample {
    public WebDriver driver;
    public Properties config;
    public FileInputStream fis;

    @Test
    public void clickMeDownTest() {
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/");

        System.out.println(  driver.findElement(By.xpath("//a[@class='v-btn v-btn--block v-btn--contained theme--light v-size--default anibtn']")).getText());
       WebElement el= driver.findElement(By.xpath("//a[@class='v-btn v-btn--block v-btn--contained theme--light v-size--default anibtn']"));
               el.click();
       try{
           el.click();
           System.out.println("element found");
       }catch(Throwable t){
           System.out.println("element not found");
       }

    }
    @Test
    public void clickMeUpTest() {
       // driver.get("https://d18u5zoaatmpxx.cloudfront.net/");

        System.out.println(  driver.findElement(By.xpath("//a[@class='v-btn v-btn--block v-btn--contained theme--light v-size--default anibtn']")).getText());
        driver.findElement(By.xpath("//a[@class='v-btn v-btn--block v-btn--contained theme--light v-size--default anibtn']")).click();
         driver.findElement(By.xpath("//a[@role='button']")).click();
        //Assertions.assertEquals("CLICK ME UP!",driver.findElement(By.xpath("//a[@class='v-btn v-btn--block v-btn--contained theme--light v-size--default anibtn']")) );

    }
    @Test
    public void doFormTest() {
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/");
        driver.findElement(By.xpath("//span[text()='Forms']")).click();
        FormClass form=new FormClass(driver);
        form.enterUserName(config.getProperty("name"));
        form.enterEmail("sital_prasad@hotmail.com");
        form.chooseState();
      //  form.clickSubmitButtonMethod();


//WebElement el1=driver.findElement(By);
      // driver.get("https://d18u5zoaatmpxx.cloudfront.net/");
       /*
driver.findElement(By.xpath("//span[text()='Forms']")).click();
driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Sital Prasad");//#name
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sital_prasad@hotmail.com");
driver.findElement(By.xpath("//div[@class='v-input__append-inner']")).click();
driver.findElement(By.xpath("//div[@role='listbox']/div[1]")).click();
driver.findElement(By.xpath("//div[@class='v-input--selection-controls__ripple']")).click();
driver.findElement(By.xpath("//span[text()='submit']")).click();
List<WebElement> opt=driver.findElements(By.xpath("//div[@role='listbox']/div[i]"));
for(WebElement o:opt){
    System.out.println(o);
    if(o.getText().equals("NSW")){
        o.click(); break;
    }else{
        System.out.println("not found");
    }
}*/

    }


    @BeforeEach()
    public void openBrowser(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        config=new Properties();
       // fis=new FileInputStream("C:\\Users\\MicroRentals\\Documents\\UIAutomationLab\\UIAutomationLab\\src\\test\\java\\config.properties");
        //config.load(fis);

        driver.get("https://d18u5zoaatmpxx.cloudfront.net/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // new WebDriverWait(Duration.ofSeconds(5), driver);
    }
    @Test
    public void exploreEarthTest() {
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/");
        PlanetPage pg2=new PlanetPage(driver);
        pg2.clickOnExploreButton("Venus");

        // Assertions.assertEquals("Exploring Earth",)

    }

    @Test
    public void doPlanetTest() {
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/");
        PlanetPage planetPage=new PlanetPage(driver);
        planetPage.clickOnPlanetPage();
        planetPage.clickOnExploreButton("Earth");
    }

    @Test
    public void doPlanetPractice(){
        driver.get("https://d18u5zoaatmpxx.cloudfront.net/");

    }


    @AfterEach
    public void WEbPlayGround() {

      //  driver.quit();
    }
}


