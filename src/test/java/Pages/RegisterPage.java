package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
    private WebDriver driver;

    //constructor driver injection
    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    //Declaring elements
    @FindBy(xpath = "//*[@id=\"header-white\"]/div/div[2]/div[4]/a")
    public WebElement registerButton;

    @FindBy(linkText = "Registrirajte se")
    public WebElement registerText;

    @FindBy(xpath = "/html/body/div[5]/div[8]/div[4]/div[1]/form/div/div[3]/div[3]/div[1]/strong")
    public WebElement osobniPodaciText;

    @FindBy(xpath = "/html/body/div[5]/div[8]/div[4]/div[1]/form/div/div[3]/div[3]/div[2]/div[1]/label")
    public WebElement rodText;

    @FindBy(xpath = "/html/body/div[5]/div[8]/div[4]/div[1]/form/div/div[3]/div[3]/div[2]/div[1]/div[2]/label")
    public WebElement ženskiRodCheckBox;

    @FindBy(xpath = "/html/body/div[5]/div[8]/div[4]/div[1]/form/div/div[3]/div[3]/div[2]/div[2]/label")
    public WebElement imeText;

    @FindBy(id = "FirstName")
    public WebElement imeInputField;

    @FindBy(xpath = "/html/body/div[5]/div[8]/div[4]/div[1]/form/div/div[3]/div[3]/div[2]/div[3]/label")
    public WebElement prezimeText;

    @FindBy(id = "LastName")
    public WebElement prezimeInputField;

    @FindBy(xpath = "/html/body/div[5]/div[8]/div[4]/div[1]/form/div/div[3]/div[3]/div[2]/div[5]/label")
    public WebElement poštaText;

    @FindBy(id = "Email")
    public WebElement poštaInputField;

    @FindBy(xpath = "/html/body/div[5]/div[8]/div[4]/div[1]/form/div/div[3]/div[7]/div[1]/strong")
    public WebElement tvojaLozinkaText;

    @FindBy(xpath = "/html/body/div[5]/div[8]/div[4]/div[1]/form/div/div[3]/div[7]/div[2]/div[1]/label")
    public WebElement lozinkaText;

    @FindBy(id = "Password")
    public WebElement lozinkaInputField;

    @FindBy(xpath = "/html/body/div[5]/div[8]/div[4]/div[1]/form/div/div[3]/div[7]/div[2]/div[2]/label")
    public WebElement potvrdiLozinkuText;

    @FindBy(id = "ConfirmPassword")
    public WebElement potvrdiLozinkuInputField;

    @FindBy(id = "register-button")
    public WebElement submitRegistrationButton;

    @FindBy(xpath = "/html/body/div[5]/div[7]/div[4]/div/div/div[2]/div[1]")
    public WebElement uspješnaRegText;

    @FindBy(xpath = "/html/body/div[5]/div[7]/div[4]/div/div/div[2]/div[2]/input")
    public WebElement nastavitiButton;

    //Methods
    public void registerClick(){
        registerButton.click();
    }

    public void selectŽrod(){
        ženskiRodCheckBox.click();
    }

    public void insertName(String name){
        imeInputField.sendKeys(name);
    }

    public void insertSurname(String surname){
        prezimeInputField.sendKeys(surname);
    }

    public void insertE_mail(String e_mail){
        poštaInputField.sendKeys(e_mail);
    }

    public void insertPassword(String password){
        lozinkaInputField.sendKeys(password);
    }

    public void confirmPassword(String password){
        potvrdiLozinkuInputField.sendKeys(password);
    }
    public void submitRegistration(){
        submitRegistrationButton.click();
    }

    public void nastavitiClick(){
        nastavitiButton.click();
    }

}
