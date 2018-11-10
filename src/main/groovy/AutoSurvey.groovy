import geb.Browser
import org.openqa.selenium.Keys

class AutoSurvey {
    static void main(String[] args) {
//        def browser = new Browser()
        Browser.drive {
            to SwagBucksLoginPage
            username.value("m.amores.s@gmail.com")
            interact {
                sendKeys(Keys.TAB)
                sendKeys(Keys.TAB)
                sendKeys(Keys.TAB)
                sendKeys(Keys.SPACE)
            }
            loginCaptcha.click()
        }


    }
}
