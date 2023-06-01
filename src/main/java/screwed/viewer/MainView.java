package screwed.viewer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MainView extends JFrame {

    final int WIDTH = 650;
    final int HEIGHT = 150;

    public MainView() {
        // set JFrame options

        setTitle("Screwed");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setLayout(new GridLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        setResizable(false);

        try {
            setIconImage(ImageIO.read(ClassLoader.getSystemResource("Screwed_Logo.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Title title = new Title();
        Menu menu = new Menu();
        add(title);
        add(menu);

        setVisible(true);


    }

}
