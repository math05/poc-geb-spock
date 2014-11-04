import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import geb.spock.GebReportingSpec
import pages.*

import spock.lang.Shared

abstract class BaseSpec extends GebReportingSpec {
  
  protected String testClassName;
  
  @Rule
  TestWatcher testNameRule = new TestWatcher() {
     protected void starting(Description description) {
       if (testClassName == null)  {
         testClassName = description.getClassName()
       }  
     }
  }
  
  abstract def configure();
  
  def setupSpec() {
    configure()
  }
  
  
  
  /**
  * Utility method for pausing browser for debugging purposes
  */
  protected void pause() {
     js.exec """
         (function() {
             window.__gebPaused = true;
             var div = document.createElement("div");
             div.setAttribute('style', "\\
                 position: absolute; top: 0px;\\
                 z-index: 3000;\\
                 padding: 10px;\\
                 background-color: red;\\
                 border: 2px solid black;\\
                 border-radius: 2px;\\
                 text-align: center;\\
             ");
  
             var button = document.createElement("button");
             button.innerHTML = "Unpause Geb";
             button.onclick = function() {
                 window.__gebPaused = false;
             }
             button.setAttribute("style", "\\
                 font-weight: bold;\\
             ");
  
             div.appendChild(button);
             document.getElementsByTagName("body")[0].appendChild(div);
         })();
     """
  
     waitFor(300) { !js.__gebPaused }
  }
}

@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.METHOD, ElementType.TYPE])
@interface CompletePath {  
}

@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.METHOD, ElementType.TYPE])
@interface HappyPath {
}

@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.METHOD, ElementType.TYPE])
@interface Current {
}

