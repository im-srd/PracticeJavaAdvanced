package swingclassexample;

import javax.swing.*;
import java.awt.*;

public class Example1 {
    public static void main(String args[]){
        // Container --> Components
        // Frame --> Panel --> Components --> panel.add(Components)

        JFrame frame = new JFrame("My First Java GUI");
        frame.setSize(280,300);

        JPanel panel = new JPanel();

        // Components initialize karenge
        JLabel label = new JLabel("Hello Label");
        JButton b1 = new JButton("Button 1");
        JTextField text = new JTextField("Text field example");


        // Add karenge sare componets ko
        panel.add(label);
        panel.add(b1);
        panel.add(text);

        // At last panel ko add karenge apne frame me and then show()
        frame.add(panel);
        panel.setLayout(new GridLayout(2,2)); // Grid layout k help se equal parts me arrange kar sakte hai Components ko
        frame.show();

    }
}
