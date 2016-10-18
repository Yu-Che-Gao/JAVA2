package mvc.views;

import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame frame;
    JLabel[] loveLabel;

    public View(String text) {
        frame=new JFrame(text);
        frame.getContentPane().setLayout(new GridLayout(1, 3));

        loveLabel=new JLabel[3];
        loveLabel[0]=new JLabel("I", new ImageIcon(".\\img\\I.jpg"), SwingConstants.CENTER);
        loveLabel[1]=new JLabel("Love", new ImageIcon(".\\img\\Love.png"), SwingConstants.CENTER);
        loveLabel[2]=new JLabel("You", new ImageIcon(".\\img\\You.jpg"), SwingConstants.CENTER);

        for(int i=0; i<loveLabel.length; i++) {
            loveLabel[i].setHorizontalTextPosition(SwingConstants.CENTER);
            loveLabel[i].setVerticalTextPosition(SwingConstants.TOP);
            loveLabel[i].setFont(new Font("Times New Roman", Font.BOLD, 20));
            loveLabel[i].setForeground(new Color(255, 0, 0));
            frame.getContentPane().add(loveLabel[i]);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
