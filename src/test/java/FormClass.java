import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormClass {
    public WebDriver driver;
    public FormClass(WebDriver driver){
        this.driver=driver;
    }


    By enterUserName=By.xpath("//input[@id='name']");
    By enterEmail=By.xpath("//input[@id='email']");
    By chooseState=By.xpath("//div[@role='listbox']/div[1]");
    By clickCheckBox=By.xpath("//div[@class='v-input--selection-controls__ripple']");
    By clickSubmitButton=By.xpath("//span[text()='submit']");
    By clickCancelButton=By.xpath("");

    public void enterUserName(String name){
        driver.findElement(enterUserName).sendKeys("sital");

    }
    public void enterEmail(String email){
        driver.findElement(enterEmail).sendKeys("sital_prasad@hotmail.com");

    }
    public void chooseState(){
        driver.findElement(By.xpath("//div[@class='v-input__append-inner']")).click();
        driver.findElement(By.xpath("//div[@role='listbox']/div[1]")).click();
        driver.findElement(By.xpath("//div[@class='v-input--selection-controls__ripple']")).click();
     //   driver.findElement(By.xpath("//div[@role='listbox']/div[1]")).click();
     //   driver.findElement(By.xpath("//div[@class='v-input--selection-controls__ripple']")).click();


    }
    public void clickSubmitButtonMethod(){
        driver.findElement(clickSubmitButton).click();

    }


    public void clickOnCancelButton(){
driver.findElement(By.xpath("//span[text()='clear']")).click();

    }




}
