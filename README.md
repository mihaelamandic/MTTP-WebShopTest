
 MTTPP - Selenium Test on Links webshop
=================================================
This webshop test project is created for college coursework. Project is testing Links webshop site and url is https://www.links.hr/hr/.
 
In this repository you can find five tests for testing navigation through website and for testing some basic functionalities like registration, searching items and adding item to cart.

Tests are written in JAVA programming language using IntelliJ IDEA.

The test cases are following:
* Check whether are present basic elements on the site. This is the simplest test and it shows if the website is loaded correctly.
* Creating registered user with inserting only mandatory information, such as gender, name, surname, e-mail address and password. After that, if everything went well, user is notified that he/she needs to go to e-mail address to confirm the registration.
* Search for Samsung Smartphone item using search box. After inserting search item in search box, user clicks on search button and gets filtered all items which are associated to searched text.
* Add item into cart. When user wants to buy something, he first must add it into cart. In test, first displayed item in "Akcije" tab is selected and added into cart. For the test to be successful, cart size must not be empty.
* Register for getting newsletter. User simply inserts his e-mail address into Newsletter field and clicks on button "Sign me up (Prijavi me)" to submit it.

To use this project, clone this repository on your computer and install the following:
-----
1. [Install Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. [Install IntelliJ](https://www.jetbrains.com/idea/download/)
3. Download web driver (use web driver for the web browser you use):

|Driver |URL |
|----------------|--------------------------------------------------------------|
|Chrome |https://chromedriver.chromium.org/downloads |
|Firefox |https://github.com/mozilla/geckodriver/releases |
|Edge |https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/ |

To run all tests, you can right click on testng.xml and select Run '...\testng.xml' or you can write in Terminal command 'mvn test' and send keys 'Ctrl + Enter'. 

References
-----
[LV 2 - Automatsko testiranje Web aplikacija (Frontend) - Selenium Web Driver (FERIT)](https://moodle.srce.hr/2021-2022/pluginfile.php/5883972/mod_resource/content/6/LV%202%20-%20Automatsko%20testiranje%20Web%20aplikacija%20%28Frontend%29%20-%20Selenium%20Web%20Driver.pdf)
