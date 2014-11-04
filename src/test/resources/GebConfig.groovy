/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.ie.InternetExplorerDriver


//this variable should not be here - just set from cmd line or runner configuration, added here for faster kickstart

//Chrome driver by default - please download from https://code.google.com/p/selenium/wiki/ChromeDriver
driver = { 
  System.setProperty('webdriver.chrome.driver', 'C:\\chromedriver.exe')  
  new ChromeDriver() 
}

//local
//remote server
baseUrl = 'http://example.com/yourapp/'

//set follwing environment variables in your system properties
username = System.getenv('GEB_USERNAME') //or enter your user name
password = System.getenv('GEB_PASSWORD') //or enter your password
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
  
  devl {
    baseUrl = "http://example2.com/yourapp/"
  }

}

