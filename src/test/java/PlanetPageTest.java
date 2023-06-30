import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PlanetPageTest {

    public WebDriver driver;
    public PlanetPageTest(WebDriver driver){
        this.driver=driver;
    }

    public void getPlanets(){
        List<WebElement> allPlanets=driver.findElements(By.className("planets"));
    }
    public void getSpecificPlanet(){

     //   driver.findElement(By.);

    }

}
