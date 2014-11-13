/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.ie.InternetExplorerDriver

//Chrome driver by default - please download from https://code.google.com/p/selenium/wiki/ChromeDriver
driver = { 
    System.setProperty('webdriver.chrome.driver', 'C:\\chromedriver.exe')
    def driver = new ChromeDriver()
    driver.manage().window().maximize()
    driver
}

baseUrl = 'https://qa-admin.bigdls.com'
//set following environment variables in your system properties
//username = System.getenv('GEB_USERNAME') //or enter your user name
//password = System.getenv('GEB_PASSWORD') //or enter your password
reportsDir = 'target/test-reports/geb'

//sample configuration for waiting
waiting {
    timeout = 10
    presets {
        slow {
            timeout = 20
            retryInterval = 1
        }
        quick {
            timeout = 1
        }
    }
}

environments {
  
    local {

    }
  
    qa {
        baseUrl = "https://qa-admin.bigdls.com"
    }

    stag {
        baseUrl = "https://stag-admin.bigdls.com"
    }

}

