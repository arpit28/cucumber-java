package steps;

import base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by 40203 on 30/08/2017.
 */
public class Hooks extends BaseUtil{

    private  BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }


    @Before
    public void InitializeTest() {

        System.out.println("Opening the browser : Chrome");

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\40203\\workspace\\selniumpractice\\libs\\chromedriver.exe");

        base.Driver = new ChromeDriver();

    }


    @After
    public void TearDownTest(Scenario scenario) {

        System.out.println("\n BaseTestSuite -> afterClass");
        base.Driver.quit();
    }


}
