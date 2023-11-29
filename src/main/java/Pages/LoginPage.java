package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
        private WebDriver driver;
        private By usernameinput= By.id("input-12");
        private By passwordinput=By.id("input-17");
        private By loginbutton=By.cssSelector("span.v-btn__content");
        private By changelanguage=By.xpath("//button[2]//span[@class='v-btn__content']");
        public LoginPage(WebDriver driver){
            this.driver=driver;
        }
        public void SetUserName(String username){
            driver.findElement(usernameinput).sendKeys(username);

        }
        public void SetPassword(String password){
            driver.findElement(passwordinput).sendKeys(password);

        }
        public HomePage ClickLoginButton(){
            driver.findElement(loginbutton).click();
            return new HomePage(driver);
        }
        public void ChangeLanguage(){
            driver.findElement(changelanguage).click();
        }
    }


