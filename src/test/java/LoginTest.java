import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void SuccessfulLogin(){
        loginpage.SetUserName("AlaaMonem1");
        loginpage.SetPassword("AlaaMonem1@123");
        loginpage.ClickLoginButton();
    }
}
