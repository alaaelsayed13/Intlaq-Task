package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddDataPage {
    protected WebDriver driver;

    private By requestermethod= By.xpath("//div[@class='v-expansion-panel v-expansion-panel--active v-expansion-panel--next-active v-item--active'][1]//div[@role='button']");
    private By selection=By.xpath("//div[@class='v-list-item__title'][contains(text(),'ابن سينا')]");
    private By requester=By.xpath("//div[@class='v-expansion-panel v-expansion-panel--active v-expansion-panel--next-active v-item--active'][1]//div[@xs='9'][2]//div[@role='combobox']");
    private By selection2=By.xpath("//div[@class='v-expansion-panel v-expansion-panel--active v-expansion-panel--next-active v-item--active'][1]//div[@xs='9'][2]//div[@role='combobox']//input[1]");
    private By orginization=By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]");
    private By selection3=By.xpath("//div[@class='v-list-item__title'][normalize-space()='MUH']");
   private By department =By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[3]/div/div/div[1]/div[1]/div[1]");
   private By selection4=By.xpath("//div[contains(text(),'burn Intensive Care')]");
   private By classification=By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div[5]/div/div/div[1]/div[1]/div[1]");
   private By selection5=By.xpath("//div[contains(text(),'Drug Availability')]");
   private By choosedrug=By.xpath("//*[@id=\"AppsContent\"]/div/div/div/form/div/div/div[3]/div/div/div[1]/div[1]/div/div/div[1]/div[1]/div[1]");
   private By input=By.xpath("//div[@class='v-expansion-panel v-expansion-panel--active v-item--active']//div[@class='row'][1]//div[@role='combobox']//div[@class='v-select__selections']//input");
   private By selection6=By.xpath("//div[@role='listbox']//div[@role='option'][1]//div[contains(text(),'(Tab)')]");
   private By questiontitle=By.xpath("(//div[@class='v-input__slot']/div[contains(@class, 'v-text-field__slot')]/input)[5]");
   private By question=By.xpath("(//textarea[@required='required' and @rows='3'])[1]\n");
   private By savebutton=By.xpath("//*[@id=\"AppsContent\"]/div/div/div/div/div[1]/button");
    public AddDataPage(WebDriver driver){
        this.driver=driver;
    }
    public void SetRequestMethod(){
       driver.findElement(requestermethod).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(selection));
       driver.findElement(selection).click();
    }
    public void SetRequester(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(requester));
        driver.findElement(requester).click();
        wait.until(ExpectedConditions.elementToBeClickable(selection2));
        driver.findElement(selection2).sendKeys("الادخال الآلى للنظام");
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }
    public void SetOrginization(){
        driver.findElement(orginization).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(selection3));
        driver.findElement(selection3).click();
    }
    public void SetDepartment(){
        driver.findElement(department).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(selection4));
        driver.findElement(selection4).click();
    }
    public void SetClassification(){
        driver.findElement(classification).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(selection5));
        driver.findElement(selection5).click();
    }
    public void SetDrug(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(choosedrug));
        driver.findElement(choosedrug).click();
        wait.until(ExpectedConditions.elementToBeClickable(input));
        driver.findElement(input).sendKeys("Panadol");
        wait.until(ExpectedConditions.elementToBeClickable(input));
        driver.findElement(selection6).click();
    }
    public void SetQuestionTitle(){
        driver.findElement(questiontitle).sendKeys("Availability");
    }
    public void SetQuestion(){
        driver.findElement(question).sendKeys("Is It Available?");
    }
    public void Save(){
        driver.findElement(savebutton).click();
    }

}
