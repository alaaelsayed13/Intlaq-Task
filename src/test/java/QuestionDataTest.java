import Pages.QuestionDataPage;
import org.testng.annotations.Test;

public class QuestionDataTest extends BaseTest{
    @Test
    public void AddQuestion(){
        SuccessfulLogin();
        homePage=loginpage.ClickLoginButton();
        QuestionDataPage questionDataPage=homePage.ClickQdButton();
        questionDataPage.AddQuestions();
    }
}
