package screwed.controller;

import screwed.Utility;
import screwed.model.Options;
import screwed.viewer.Menu;

public class UserController {

    public void Initialize_Menu(Menu menu) {

        menu.genPassword(e -> {
            Options options = menu.getOptions();
            options.popup(Utility.genPassword(options));

        });
    }

}
