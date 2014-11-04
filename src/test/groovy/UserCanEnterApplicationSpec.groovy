import pages.MainPage

import spock.lang.Stepwise;

@Stepwise
class UserCanEnterApplicationSpec extends BaseSpec {
  
  def configure() {
  }
  
  def "user can go to main page"() {
    given: "logged in user goes"
      to MainPage

    expect: "user is"
      waitFor {at MainPage}
  }

}
