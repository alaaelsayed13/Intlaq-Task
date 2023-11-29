import Pages.AddDataPage;
import Pages.QuestionDataPage;
import org.testng.annotations.Test;

public class AddDataTest extends BaseTest{
    @Test
    public void AddData() throws InterruptedException {
        SuccessfulLogin();
        homePage=loginpage.ClickLoginButton();
        questionDataPage=homePage.ClickQdButton();
        AddDataPage addDataPage= questionDataPage.AddQuestions();
        addDataPage.SetRequestMethod();
        addDataPage.SetRequester();
        addDataPage.SetOrginization();
        addDataPage.SetDepartment();
        addDataPage.SetClassification();
        addDataPage.SetDrug();
        addDataPage.SetQuestionTitle();
        addDataPage.SetQuestion();
        addDataPage.Save();




    }
}
