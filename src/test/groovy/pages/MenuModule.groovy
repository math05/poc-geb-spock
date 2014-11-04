package pages

import geb.Module

class MenuModule extends Module {

  static content = {
    container {$('#nav')}
    home { container.find('.level_1 a') }
    orderSearch { container.find('.level_2 a:nth-child(1)') }
    pendingSearch { container.find('.level_2 a:nth-child(2)') }
    readySearch { container.find('.level_2 a:nth-child(3)') }
  }
}
