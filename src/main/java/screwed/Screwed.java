package screwed;

import screwed.model.Options;
import screwed.viewer.MainView;

import javax.swing.*;
import java.util.logging.Logger;

public class Screwed {

    // gui starter

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Main");
        for (int i=0;i<args.length;i++) {
            switch (args[i]) {
                case "-gui":
                    logger.info("open the gui.");
                    break;

                case "-cui":
                    boolean upper = Boolean.parseBoolean(args[i+1]);
                    boolean lower = Boolean.parseBoolean(args[i+2]);
                    boolean number = Boolean.parseBoolean(args[i+3]);
                    String symbols = String.valueOf(args[i+4]);
                    int size = Integer.parseInt(args[i+5]);
                    int num = Integer.parseInt(args[i+6]);

                    for (int f=0;f<num;f++) {
                        String pass = Utility.genPassword(new Options(upper,
                                lower,
                                number,
                                symbols,
                                size
                        ));

                        System.out.println(pass);

                        Utility.writeFile("./pass.txt", pass);

                    }
                    logger.info("Generated " + num + " passwords.");
                    return;

                default:
                    break;

            }

        }

        SwingUtilities.invokeLater(MainView::new);

    }


}
