package screwed.model;

import screwed.Utility;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

public final class Options {

    private final boolean upper;

    private final boolean lower;

    private final boolean number;

    private final String symbols;

    private final int size;

    public Options(boolean upper, boolean lower, boolean number, String symbols, int size) {
        this.upper = upper;
        this.lower = lower;
        this.number = number;
        this.symbols = symbols;
        this.size = size;

    }


    public boolean lower() {
        return lower;
    }

    public boolean number() {
        return number;
    }

    public boolean upper() {
        return upper;
    }

    public String symbols() {
        return symbols;
    }

    public int size() {
        return size;
    }

    public void popup(String pass) {
        System.out.println(pass);

        Utility.writeFile("./pass.txt", pass);

        // options
        int num;
        Object[] options = {"Yes, please",
                "No, thanks"};
        try {
            num = JOptionPane.showOptionDialog(null,
                    "Generated \" " + pass + " \"!\n" +
                            "Copy password?",
                    "Generated Password!",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon(ImageIO.read(ClassLoader.getSystemResource("Screwed_Logo.png"))),
                    options,
                    options[1]);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        if (num == JOptionPane.YES_OPTION) {
            // paste
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            StringSelection selection = new StringSelection(pass);
            clipboard.setContents(selection, null);


        }

    }

}