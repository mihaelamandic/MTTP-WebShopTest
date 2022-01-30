package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LinksHomePage {
    private WebDriver driver;

    //constructor driver injection
    public LinksHomePage(WebDriver driver){
        this.driver = driver;
    }
    //Declaring elements
    @FindBy(xpath = "/html/body/div[5]/div[1]/div[3]/div/div[1]/a")
    public WebElement pageTitle;

    @FindBy(id = "small-searchterms")
    public WebElement searchBox;

    @FindBy(linkText = "Informatika")
    public WebElement informatikaCategory;

    @FindBy(linkText = "Televizori / Audio i video")
    public WebElement televizoriCategory;

    @FindBy(linkText = "Bijela tehnika / Kućanski aparati")
    public WebElement bijelaTehnikaCategory;

    @FindBy(linkText = "Sport i oprema")
    public WebElement sportOpremaCategory;

    @FindBy(linkText = "Igračke, djeca i bebe")
    public WebElement igračkeCategory;

    @FindBy(linkText = "Kućni ljubimci")
    public WebElement kucniLjubimciCategory;

    @FindBy(xpath = "//*[@id=\"headerMenuParent\"]/ul[1]/li[1]/a")
    public WebElement akcije;

    @FindBy(id = "newsletter-email")
    public WebElement newsletter;

    @FindBy(id = "newsletter-subscribe-button")
    public WebElement newsletterButton;

    @FindBy(xpath = "/html/body/div[5]/div[7]/div[6]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div/div[4]/button")
    public WebElement addToCartButton;

    @FindBy(xpath = "/html/body/div[5]/div[7]/div[6]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div/div[4]/button/span[2]")
    public WebElement cardQuantity;

    @FindBy(id = "eu-cookie-ok")
    public WebElement cookieButton;


    //Methods
    public void setSearchBox(String item){
        searchBox.sendKeys(item);
    }
    public void akcijeClick(){
        akcije.click();
    }
    public void addToCartClick(){
        addToCartButton.click();
    }
    public void setNewsletterEmail(String email){
        newsletter.sendKeys(email);
    }
    public void newsletterButtonClick(){
        newsletterButton.click();
    }
    public void closeCookie(){
        cookieButton.click();
    }

}
