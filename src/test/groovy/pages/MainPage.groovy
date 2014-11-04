package pages
import geb.Page

class MainPage extends Page {
   
  static at = {
    title == 'Application name'
    $('#content center img').attr('src').endsWith('Icons/Collage.jpg')
  }
  
  static content = {
    header {}
    menu { module MenuModule}
    footer { module FooterModule}
  }
}
