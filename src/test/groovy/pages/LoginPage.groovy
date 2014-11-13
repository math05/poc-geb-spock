package pages
import geb.Page

class LoginPage extends Page {

    static at = {
        form {$("form", id: "form")}
        loginModalTitle.text() == "Please sign in"
        inputLogin.isDisplayed()
        inputPassword.isDisplayed()
        loginButton.isDisplayed()
    }
  
  static content = {
      form(wait: true)                  { $("form", id: "form") }
      loginModalTitle                   { $("h3") }
      inputLogin                        { form.find("input[name='user']") }
      inputPassword                     { form.find("input[name='password']") }
      loginButton                       { form.find("button", type: "submit") }
      loginAlert                        { $("div.modal-content").find("div.alert.alert-danger") }
      bdlLogo                           { $(".bigdl-logo") }
  }
}
