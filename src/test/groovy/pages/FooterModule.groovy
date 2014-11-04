package pages

import geb.Module

class FooterModule  extends Module {

  static content = {
    container {$('#bottom')}    
    userRow {container.find('center table tbody tr:nth-child(2) td')}
  }
}
