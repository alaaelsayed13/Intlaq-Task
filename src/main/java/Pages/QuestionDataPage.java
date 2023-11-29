package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class QuestionDataPage {
    protected WebDriver driver;
    public By addquestions= By.xpath("//div[@id='applications'][1]");
    public QuestionDataPage(WebDriver driver){
        this.driver=driver;
    }
   public AddDataPage AddQuestions(){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       wait.until(ExpectedConditions.elementToBeClickable(addquestions));
        driver.findElement(addquestions).click();
        return new AddDataPage(driver);
}
}
