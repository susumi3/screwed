package screwed.viewer;

import javax.swing.*;
import java.awt.*;

public class Title extends JPanel {

    public Title() {
        // -- start title --

        // Title
        JTextField titleText = new JTextField();
        titleText.setText("Screwed");
        titleText.setEditable(false);
        titleText.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 35));
        titleText.setHorizontalAlignment(JTextField.CENTER);
        titleText.setBorder(null);

        // Description
        JTextField titleDescription = new JTextField();
        titleDescription.setText("A Simple password generator.");
        titleDescription.setEditable(false);
        titleDescription.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 12));
        titleDescription.setHorizontalAlignment(JTextField.CENTER);
        titleDescription.setBorder(null);

        // About
        JTextField about = new JTextField();
        about.setText("Simple generators are also simple icon & code :D");
        about.setEditable(false);
        about.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 7));
        about.setHorizontalAlignment(JTextField.CENTER);
        about.setBorder(null);

        add(titleText);
        add(titleDescription);
        add(about);

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        // -- end title --

    }

}
