import Pages.HomePage;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{
@Test
    public void SuccessfullNavigation(){
    SuccessfulLogin();
     homePage=loginpage.ClickLoginButton();
    homePage.ClickQdButton();

}
}
