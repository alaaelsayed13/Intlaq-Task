package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    protected WebDriver driver;
    private By questionsdatabutton=By.xpath("//a[contains(@class,'v-card v-card--link v-sheet theme--light')]");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public QuestionDataPage ClickQdButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(questionsdatabutton));
        driver.findElement(questionsdatabutton).click();
return new QuestionDataPage(driver);
    }
}
