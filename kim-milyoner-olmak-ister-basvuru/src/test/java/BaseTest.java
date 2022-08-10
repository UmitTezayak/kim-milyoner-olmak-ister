import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver;
    PracticeFormPage practiceFormPage;

    @BeforeAll
    public void setUp(){
        System.out.println("test basladi");
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.atv.com.tr/milyoner/form");
        driver.manage().window().maximize();
        practiceFormPage = new PracticeFormPage(driver);
    }

    @AfterAll
    public void tearDown() throws InterruptedException {
        System.out.println("test bitti");
        Thread.sleep(1000);
        driver.quit();
    }
}
