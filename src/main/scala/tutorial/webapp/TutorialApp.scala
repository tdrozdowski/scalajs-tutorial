package tutorial.webapp

import org.scalajs.jquery.jQuery
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

/**
 * Created with IntelliJ IDEA.
 * User: terry
 * Date: 8/10/15
 * Time: 7:06 PM
 *
 */
object TutorialApp extends JSApp {
  @JSExport
  def main() = {
    appendPar("Hello World!")
  }

  def appendPar(message : String) = {
    jQuery("body").append(s"<p>$message</p>")
  }
}