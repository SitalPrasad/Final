import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Planet {

    private WebElement currentPlantCard;
    public Planet(WebElement planetCard){
        this.currentPlantCard = planetCard;
    }

    public String getName() {
        return currentPlantCard.findElement(By.className("name")).getText();
    }

    public void clickExplore() {
        currentPlantCard.findElement(By.tagName("button")).click();
    }
}
