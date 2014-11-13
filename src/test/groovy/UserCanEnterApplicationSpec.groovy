import pages.LoginPage

import spock.lang.Stepwise;

@Stepwise
class UserCanEnterApplicationSpec extends BaseSpec {
  
  def configure() {
  }
  
  def "user can go to main page"() {
    given: "You have the admin username and password"
        def username = "admin"
        def password = "password"

    when: "Navigate to Login Page"
        to LoginPage

    and: "Log into CMS"
        inputLogin.value username
        inputPassword().value password
        loginButton().click()

    then:
        assert at (LoginPage)
//
//    and:
//    assert ( {$("a[value='America/New York']")} )
//
//    when: "Navigate to the organization profile"
//    timeZoneLink().click()
//
//    then:
//    assert at (OrganizationProfilePage)
//
//    and: "Verify America New York is selected"
//    assert ( $("span", text: contains("America/New York")) )

  }

}
