import geb.Page

class SwagBucksLoginPage extends Page {
    static url = "p/login"
    static at = { title == ("Login | Swagbucks") }

    static content = {
        username { $("div.homeSignupEmail input[name*='emailAddress'") }
        password { $("div.homeSignupPass input[name*='password'") }
        loginCaptcha { $("div.rc-anchor-center-item") }

    }
}
