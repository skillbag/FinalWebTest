import jdk.jshell.spi.ExecutionControl;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static java.lang.CharSequence.compare;
import static org.openqa.selenium.Keys.ENTER;

public class MainInc {
    private static final String URL = "https://skillfactory.ru/";
    private final WebDriver driver;
    public MainInc(WebDriver driver){
        this.driver = driver;
    }

    public void go(){
        driver.get(URL);
    }
    public void close (){
        driver.quit();
    }
    public void AllCourses(){
        driver.findElement(By.className("tn-atom__sbs-anim-wrapper")).click();
    }
    public void IT(){
        driver.findElement(By.className("tn-elem__4583197321652779744723")).click();
    }
    public void Button(){
        driver.findElement(By.className("tn-elem__4361926361650022473427")).click();
    }
    public void Messenger(){
        driver.findElement(By.id("chat-container")).click();
    }
    public void Name(){
        driver.findElement(By.name("name")).sendKeys("Anon");
    }
    public void Email(){
        driver.findElement(By.name("email")).sendKeys("@");
    }
    public void Telephone(){
        driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("111111111");
    }
    public void ButtonC(){
        driver.findElement(By.className("tn-form__submit")).click();
    }
    public void Email1(){
        driver.findElement(By.name("email")).sendKeys("Anon@mail.ru");
    }
   public void Telephone1(){
        driver.findElement(By.name("tildaspec-phone-part[]")).sendKeys("9261111111");
   }
   public void Read(){
        driver.findElement(By.className("tn-elem__4572199691654866036754")).click();
   }
   public void Telega(){
       driver.findElement(By.className("social-button--telegram")).click();
   }
    public void Logo1(){
        driver.findElement(By.className("loaded")).click();
    }
    public void Habr(){
        driver.findElement(By.className("tn-elem__2988276021608735712198")).click();
    }
    public void Vkontakte(){
        driver.findElement(By.className("tn-elem__2988276021608548393864")).click();
    }
    public void Youtube(){
        driver.findElement(By.className("tn-elem__2988276021608548393857")).click();
        driver.quit();
    }
    public void Programing(){
        driver.findElement(By.className("tn-elem__4567460551656076157308")).click();
    }
    public void DifferenceProfession(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("tn-elem__3712652291635173767130")));
        driver.findElement(By.className("tn-elem__3712652291635173767130")).click();
    }
    public void Qa(){
        driver.findElement(By.className("tn-elem__4742230761654594993364")).click();
    }
    public void Collapse(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("tn-elem__2254512281594720059135")));
        driver.findElement(By.className("tn-elem__2254512281594720059135")).click();
    }
    public void Collapse1(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("tn-elem__2254512301594720059135")));
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.className("tn-elem__2254512301594720059135"));
        actions.doubleClick(elementLocator).perform();
    }
    public void Free(){
        driver.findElement(By.className("tn-elem__4567460551658239202580")).click();
    }
    public void Choose(){
        driver.findElement(By.className("tn-elem__4402296251650958401716")).click();
    }
    public void Send(){
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.findElement(By.className("t-checkbox__indicator")).click();
        driver.findElement(By.name("email")).sendKeys("Anon@mail.ru", ENTER);
    }
    public void ClickEvent(){
        driver.findElement(By.className("tn-elem__4568881041654788829796")).click();
    }
    public void Write(){
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.findElement(By.className("header-search")).click();
        driver.findElement(By.className("search-field")).sendKeys("java", ENTER);
        driver.findElement(By.className("post-card__thumbnail")).click();
    }
    public void BlogW(){
        driver.findElement(By.className("tn-elem__4567460551658239202589")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.findElement(By.id("menu-item-12708")).click();
    }
    public void Data(){
        driver.findElement(By.className("player")).click();
        driver.findElement(By.id("player")).click();
    }
    public void JavaC(){
    driver.findElement(By.className("tn-elem__4742230761654704878744")).click();
    }
    public void Story(){
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.className("tn-elem__4635127531656416522638"));
        actions.doubleClick(elementLocator).perform();
    }
    public void Manager() {
        driver.findElement(By.className("tn-elem__2988276021629470025496")).click();
    }
    public void SendR() {
        driver.findElement(By.className("tn-elem__4178987751645695395690")).click();
    }
    public void Courses(){
        driver.findElement(By.className("tn-elem__4681130601654780375511")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.findElement(By.className("tn-elem__4568917681652779744723")).click();
    }
    public void Teacher(){
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(2));
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.className("tn-elem__3897934761636314272203"))).click();
    }
    public void LinkHb(){
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.findElement(By.xpath("//a[@href='http://www.skillfactory.ru/']")).click();
    }
    public void PythonDeveloper(){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.className("tn-elem__4583197321652779877327")).click();
        driver.findElement(By.className("tn-elem__4362801881594720059135")).click();
        driver.findElement((By.className("tn-elem__4362801901594720059135"))).click();
        driver.navigate().back();
    }
    public void PythonTester(){
        driver.findElement(By.className("tn-elem__4583197321654594993374")).click();
        driver.findElement(By.className("t668__accordion")).click();
        driver.navigate().back();
    }
    public void DeveloperC(){
        driver.findElement(By.className("tn-elem__4685205591652779954434")).click();
        driver.findElement(By.className("tn-elem__4698262911594720059135")).click();
        driver.findElement(By.className("tn-elem__4698262941594720059135")).click();
        driver.findElement(By.className("tn-elem__4698263381620732775341")).click();
    }
    public void StoryH(){
        driver.findElement(By.className("tn-elem__4572199691654866164794")).click();
    }
    public void Backend() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@href='https://skillfactory.ru/backend-razrabotchik-na-golang']")).click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.findElement(By.className("tn-elem__4698341141593407797257")).click();
        driver.findElement(By.className("tn-form__submit")).click();

    }
}


