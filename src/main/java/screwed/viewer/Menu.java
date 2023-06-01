package screwed.viewer;

import screwed.controller.UserController;
import screwed.model.Options;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Menu extends JPanel {

    // global var

    JButton button;
    JCheckBox upper;
    JCheckBox lower;
    JCheckBox number;
    JTextField symbols;
    JTextField size;

    // gui configuration

    final String default_symbols = "!\"#$%&'()=-~^/_<>+*@";
    final String default_passwords = "11";
    final boolean default_upper = true;
    final boolean default_lower = true;
    final boolean default_number = true;

    public Menu() {

        // -- start menu --

        // --- start check box panel ---

        JPanel checkBox = new JPanel();

        // char upper
        upper = new JCheckBox("add upper", default_upper);
        upper.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 12));

        // char lower
        lower = new JCheckBox("add lower", default_lower);
        lower.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 12));

        // number
        number = new JCheckBox("add number", default_number);
        number.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 12));

        checkBox.add(upper, BorderLayout.WEST);
        checkBox.add(lower, BorderLayout.CENTER);
        checkBox.add(number, BorderLayout.EAST);


        // --- end check box panel ---

        add(checkBox);

        // --- start symbol text area panel ---
        JPanel symbol = new JPanel();

        // symbol

        // description
        JTextField boxDescription = new JTextField("symbols:");
        boxDescription.setEditable(false);
        boxDescription.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 12));
        boxDescription.setHorizontalAlignment(JTextField.CENTER);
        boxDescription.setBorder(null);

        symbol.add(boxDescription);

        // symbols

        symbols = new JTextField(default_symbols);

        symbol.add(symbols);

        // --- end symbol text area panel ---

        add(symbol);

        // --- start passwords field panel ---

        JPanel num = new JPanel();

        // passwords description
        JTextField minDescription = new JTextField("passwords:");
        minDescription.setEditable(false);
        minDescription.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 12));
        minDescription.setHorizontalAlignment(JTextField.CENTER);
        minDescription.setBorder(null);

        // passwords
        size = new JTextField(default_passwords);

        num.add(minDescription);
        num.add(size);

        // --- start max & min field panel ---


        add(num);

        // --- start screwed panel ---

        JPanel screwed = new JPanel();

        button = new JButton("Screwed!");
        button.setBackground(Color.WHITE);
        button.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 12));

        screwed.add(button);

        // --- end screwed panel ---

        add(screwed, BorderLayout.EAST);

        // -- end menu --

        new UserController().Initialize_Menu(this);

    }

    // getter

    public Options getOptions() {
        return new Options(upper.isSelected(),
                lower.isSelected(),
                number.isSelected(),
                symbols.getText(),
                Integer.parseInt(size.getText())
        );

    }

    public void genPassword(ActionListener actionListener) {
        button.addActionListener(actionListener);

    }

}
