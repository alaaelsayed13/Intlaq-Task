import Pages.HomePage;
import Pages.LoginPage;
import Pages.QuestionDataPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginpage;
    protected HomePage homePage;
    protected QuestionDataPage questionDataPage;
    @BeforeClass
    public void SetUp(){
        driver = new ChromeDriver();
        GoHome();
        loginpage= new LoginPage(driver);
    }
    public void GoHome(){
        driver.get("http://drugstest.mans.edu.eg/");
        driver.manage().window().maximize();
    }
   public void SuccessfulLogin(){
       loginpage.SetUserName("AlaaMonem1");
       loginpage.SetPassword("AlaaMonem1@123");
       loginpage.ChangeLanguage();
   }
    @AfterClass
    public void teardown(){

        driver.quit();
    }
}
