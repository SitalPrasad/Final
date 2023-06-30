import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class PlanetPage {
    public WebDriver driver;

    public PlanetPage(WebDriver driver) {
        this.driver = driver;
    }
    //  By name=By.className("name");

    By enterName = By.className("name");
    By enterTagName = By.tagName("button");

    public void clickOnPlanetPage() {
        driver.findElement(By.xpath("//span[text()='Planets']")).click();
    }
    public void clickOnPlanetPage1(){
        driver.findElement(By.cssSelector("[area-label=Planets")).click();
    }

    public void clickOnExploreButton(String planet) {
        for(Planet plnt: getAllPlanet()){
           // System.out.println(plnt.getName());
            if(plnt.getName().equalsIgnoreCase(planet)){
              plnt.clickExplore();
            }
        }
    }

    public List<Planet> getAllPlanet(){
        List<Planet> allPlanets = new ArrayList<>();
        for (WebElement plnt : driver.findElements(By.className("planet"))) {
            //System.out.println(plnt.findElement(By.className("name")).getText());
            allPlanets.add(new Planet(plnt));
        }
        return allPlanets;
    }
}
