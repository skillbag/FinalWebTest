import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class StepsWork {
    public static final WebDriver driver;
    private static final MainInc mainInc;


    static {
        System.setProperty("webDriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        mainInc = new MainInc(driver);
    }

    //test1
    @Given("URL online platform")
    public void SkfUrl() {
        mainInc.go();
    }

    @Then("Close site")
    public void SkfClose() {
        mainInc.close();
    }

    //test2
    @Then("Select All Courses")
    public void AllCourses() {
        mainInc.AllCourses();
    }

    //test3
    @And("Select start IT")
    public void SelIT() {
        mainInc.IT();
    }

    //test4
    @And("Click button enroll in a courses")
    public void ClickButton() {
        mainInc.Button();
    }

    //test5
    @Then("Click online messenger assistant")
    public void ClickMessenger() {
        mainInc.Messenger();
    }

    // test6
    @Then("insert Name")
    public void InsertName() {
        mainInc.Name();
    }

    @Then("insert a non-existent email in the feedback form")
    public void InsertEmail() {
        mainInc.Email();
    }

    @And("insert a non-existent number telephone")
    public void InsertTelephone() {
        mainInc.Telephone();
    }

    @Then("click on the button to get a consultation")
    public void ClickButt() {
        mainInc.ButtonC();
    }

    //test7
    @Then("insert a valid email")
    public void InsertEmail1() {
        mainInc.Email1();
    }

    @And("insert a valid telephone")
    public void InsertTelephone1() {
        mainInc.Telephone1();
    }

    //test8
    @Then("Click button read history")
    public void ClickRead() {
        mainInc.Read();
    }

    //test9
    @And("click social telegram share button")
    public void ClickShare() {
        mainInc.Telega();
    }
    //test10

    @And("Click Logo")
    public void ClickLogo1(){
        mainInc.Logo1();
    }

    //test11
    @Then("Click Habr")
    public void ClickHabr() {
        mainInc.Habr();
    }

    @Then("Click Vkontakte")
    public void ClickVkontakte() {
        mainInc.Vkontakte();
    }

    @And("Click Youtube")
    public void ClickYoutube() {
        mainInc.Youtube();
    }

    //test12
    @Then("Сlick programming")
    public void ClickProg() {
        mainInc.Programing();
    }

    @And("Click difference between profession, specialization")
    public void DifferenceProfession() {
        mainInc.DifferenceProfession();
    }

    //test13
    @Then("Click java QA engineer profession")
    public void ClickQA() {
        mainInc.Qa();
    }

    @And("Click introduction and collapse tab")
    public void CollapseTab() {
        mainInc.Collapse();
    }

    @And("Click test design and collapse tab")
    public void CollapseTab1() {
        mainInc.Collapse1();
    }

    //test14
    @Then("Click is free")
    public void ClickFree() {
        mainInc.Free();
    }

    @Then("Сhoose the first master class how to become a tester")
    public void ChooseClass() {
        mainInc.Choose();
    }

    @And("Submit the form with an email to participate")
    public void SendForm() {
        mainInc.Send();
    }

    //test15
    @Then("Click past events")
    public void ClickEvents() {
        mainInc.ClickEvent();
    }

    @And("Write java in the search engine and go to the first news about java")
    public void WriteJava() {
        mainInc.Write();
    }

    //test16
    @Then("Click Blog and webinar")
    public void ClockBlogW() {
        mainInc.BlogW();
    }

    @And("launching a webinar analytic date scan")
    public void WebinarData() {
        mainInc.Data();
    }

    //test17
    @Then("Choose java course developer")
    public void JavaCourses() {
        mainInc.JavaC();
    }

    @And("Click on the real story of our students")
    public void StorySt() {
        mainInc.Story();
    }
    //test18
    @Then("click on vacancies")
    public void Vacancies(){
        mainInc.Manager();
    }
    @And("Click send resume")
    public void SendR(){
        mainInc.SendR();
    }
    //test19
    @Then("go to higher education and choose a course")
    public void GoCourse(){
        mainInc.Courses();
    }
    @And("Click on teacher")
    public void TeacherClick(){
        mainInc.Teacher();
    }
    //test20
    @And("click the skillfactory link in the Habr group")
    public void ClickHb(){
        mainInc.LinkHb();
    }
    //test21
     @Then("Open the intensive python developer course and click the course program")
    public void OpenPythonDeveloper(){
       mainInc.PythonDeveloper();
     }
     @Then("go to the python tester course and see the faq about the course")
    public void OpenPythonTester(){
        mainInc.PythonTester();
     }
     @And("enter the C++ developer course, watch the short program and open the application form")
    public void CplusDeveloper(){
        mainInc.DeveloperC();
     }
     //test22
    @Then("click on the student's story")
    public void ClickStor(){
        mainInc.StoryH();
    }
    @And("follow the link to the course and sign up")
    public void GoBack(){
        mainInc.Backend();
    }

    }






