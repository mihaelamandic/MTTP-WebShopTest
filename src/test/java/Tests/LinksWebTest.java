package Tests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Pages.*;
import java.util.Random;
import static junit.framework.Assert.assertTrue;


public class LinksWebTest{
    //-------------------Global Variables-----------------------------------
//Declare a Webdriver variable
    public WebDriver driver;

    //Declare a test URL variable
    public String testURL = "https://www.links.hr/hr/";


    //----------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        //remove comments next to driver which you want to use (Chrome, Firefox or Edge)
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        //System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");

    //Create a new ChromeDriver, FirefoxDriver and EdgeDriver
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        //driver = new EdgeDriver();

    //Go to https://www.links.hr/hr/
        driver.navigate().to(testURL);
        System.out.print(driver.getTitle());

    }

    @Test(description = "Verify elements on Links page")
    public void verifySiteElements() throws InterruptedException {
        //set POM
        LinksHomePage homePage = PageFactory.initElements(driver, LinksHomePage.class);

        //checking presence of title
        System.out.println("And I will check whether is present page logo");
        assertTrue(homePage.pageTitle.isDisplayed());
        System.out.println("Logo is present");

        //checking presence of search
        System.out.println("And I will check whether is present Search");
        assertTrue(homePage.searchBox.isDisplayed());
        System.out.println("Search is present");

        //checking presence of Categories
        System.out.println("And I will check whether are present Categories");
        assertTrue(homePage.informatikaCategory.isDisplayed());
        assertTrue(homePage.televizoriCategory.isDisplayed());
        assertTrue(homePage.bijelaTehnikaCategory.isDisplayed());
        assertTrue(homePage.sportOpremaCategory.isDisplayed());
        assertTrue(homePage.igračkeCategory.isDisplayed());
        assertTrue(homePage.kucniLjubimciCategory.isDisplayed());
        assertTrue(homePage.akcije.isDisplayed());
        System.out.println("Categories are present");

        //checking presence of newsletter
        System.out.println("And I will check whether is present newsletter");
        assertTrue(homePage.newsletter.isDisplayed());
        System.out.println("Newsletter is present");

    }
    @Test(description = "Make a registration to Links - creating registered user with inserting only mandatory fields")
    public void register() throws InterruptedException {
        //set POM
        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
        LinksHomePage homePage = PageFactory.initElements(driver, LinksHomePage.class);
        System.out.println("And I will close cookie.");
        homePage.closeCookie();

        //check whether is present button Registrirajte se
        System.out.println("And I will check whether is present Registrirajte se button");
        assertTrue(registerPage.registerButton.isDisplayed());
        System.out.println("Registrirajte se button is present. And I will click on it");
        registerPage.registerClick();

        System.out.println("And I will verify that Registrirajte se text is present");
        assertTrue(registerPage.registerText.isDisplayed());
        System.out.println("Registrirajte se text is present");

        assertTrue(registerPage.osobniPodaciText.isDisplayed());
        System.out.println("And I will check whether is Rod (Gender) present");
        assertTrue(registerPage.rodText.isDisplayed());
        System.out.println("And I will choose Ž gender");
        registerPage.selectŽrod();

        System.out.println("And I will verify Name part and insert Name");
        assertTrue(registerPage.imeText.isDisplayed());
        registerPage.insertName("TestMTTP123");

        System.out.println("And I will verify Surname part and insert Surname");
        assertTrue(registerPage.prezimeText.isDisplayed());
        registerPage.insertSurname("TestSurnameMTTP123");

        System.out.println("And I will verify E_mail part and insert E_mail");
        assertTrue(registerPage.poštaText.isDisplayed());
        Random random = new Random();
        int randomInt = random.nextInt(1000);
        String posta = "test.test"+ randomInt + "@gmail.com";
        System.out.println(posta);
        registerPage.insertE_mail(posta);

        System.out.println("And I will verify Password part");
        assertTrue(registerPage.tvojaLozinkaText.isDisplayed());
        System.out.println("And I will insert Password");
        assertTrue(registerPage.lozinkaText.isDisplayed());
        registerPage.insertPassword("TestMTTPLongPassword123");
        System.out.println("And I will confirm password");
        assertTrue(registerPage.potvrdiLozinkuText.isDisplayed());
        registerPage.confirmPassword("TestMTTPLongPassword123");

        Thread.sleep(5);

        System.out.println("And I will submit my registration");
        registerPage.submitRegistration();
        Thread.sleep(5);

        System.out.println("And I will check whether is present text which says that I will get confimation e-mail");
        //mora biti prisutan "Poslan vam je e-mail koji sadrži upute za aktivaciju članstva." tekst, ukoliko nije, znači da registracija nije dobro prošla
        assertTrue(registerPage.uspješnaRegText.isDisplayed());

        System.out.println("And I will click on button Continue");
        registerPage.nastavitiClick();
        Thread.sleep(5);
        System.out.println("And I will check whether is present Registrirajte se button");
        assertTrue(registerPage.registerButton.isDisplayed());
        // user se registrirao, no ne do kraja jer treba otići na svoj e-mail i potvrditi registraciju, tako da je user trenutno u neaktivnom stanju
    }

    @Test(description = "Search Smartphone Samsung item")
    public void searchItem() throws InterruptedException {
        //set POM
        LinksHomePage homePage = PageFactory.initElements(driver, LinksHomePage.class);

        System.out.println("And I will insert Smartphone Samsung in searchbox.");
        homePage.setSearchBox("Smartphone Samsung");
        homePage.searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(10);

    }

    @Test(description = "Add item to cart")
    public void addToCart() throws InterruptedException {
        //set POM
        LinksHomePage homePage = PageFactory.initElements(driver, LinksHomePage.class);
        System.out.println("And I will close cookie.");
        homePage.closeCookie();
        System.out.println("And I will click on Akcije tab.");
        homePage.akcijeClick();
        System.out.println("And I will add first item to cart.");
        homePage.addToCartClick();
        System.out.println("And I check whether is present card quantity - must be.");
        assertTrue(homePage.cardQuantity.isDisplayed());

    }

    @Test(description = "Register for newsletter")
    public void registerForNews() throws InterruptedException {
        //set POM
        LinksHomePage homePage = PageFactory.initElements(driver, LinksHomePage.class);

        System.out.println("And I will insert e-mail in Newsletter field.");
        Random random = new Random();
        int randomInt = random.nextInt(1000);
        String posta = "test.test"+ randomInt + "@gmail.com";
        homePage.setNewsletterEmail(posta);
        System.out.println("And I will click on button Prijavi me.");
        homePage.newsletterButtonClick();

    }

    //---------------Test TearDown-----------------------------------
    @AfterMethod
    public void teardownTest() {
//Close browser and end the session
        driver.quit();
    }
}
