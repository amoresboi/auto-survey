import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver

baseUrl = "http://www.swagbucks.com/"

// default driver...
System.setProperty('webdriver.chrome.driver', "src/main/resources/chromedriver.exe")
driver = {new ChromeDriver()}

environments {
    // specify environment via -Dgeb.env=ie
    "ie" {
        def ieDriver = new File('src/test/resources/IEDriverServer.exe')
        System.setProperty('webdriver.ie.driver', ieDriver.absolutePath)
        driver = { new InternetExplorerDriver() }
    }

    "chrome" {
        def chromeDriver = new File('src/test/resources/chromedriver') // add .exe for Windows...
        System.setProperty('webdriver.chrome.driver', chromeDriver.absolutePath)
        driver = { new ChromeDriver() }
    }

    'ff' {
        driver = { new FirefoxDriver() }
        driver.manage().window().maximize()
    }
}