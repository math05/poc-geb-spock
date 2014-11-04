These tests are run using Geb (gebish.org) and Spock libraries (spockframework.org)

1. To run all tests run maven command
	mvn test
	
2. To change browser call maven build with additional parameters
	mvn -Dgeb.env=ie test
	
	or 
	
	mvn -Dgeb.driver=ie test

3. To run tests on IE - InternetExporlerDriver (https://code.google.com/p/selenium/wiki/InternetExplorerDriver) is needed. 
Please note that also on IE 7 or higher on Windows Vista or Windows 7, you must set the Protected Mode settings 
for each zone to be the same value (they are different on Deere laptops)

4. To run tests on Chrome - ChromeDrive is needed https://code.google.com/p/selenium/wiki/ChromeDriver
a) ChromeDriver have to be downloaded
b) when running test provide additional configuration

	mvn -Dgeb.env=chrome -Dwebdriver.chrome.driver=C:\chromedriver.exe test