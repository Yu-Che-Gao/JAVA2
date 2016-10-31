package mvc.views;

import javax.swing.text.*;
import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;
    public JLabel IDLabel;
    public JButton IDVerify;
    public JButton IDMaker;
    public JFormattedTextField IDinput;

    public View(String text) {
        frame=new JFrame(text);
        frame.getContentPane().setLayout(new GridLayout(2, 2));

        IDLabel=new JLabel("身分證字號");
        IDVerify=new JButton("驗證");
        IDMaker=new JButton("產生");

        try {
            MaskFormatter IDMask=new MaskFormatter("U#########");
            IDinput=new JFormattedTextField(IDMask);
        } catch(Exception ex) {
            System.out.println(ex);
        }
        

        frame.getContentPane().add(IDLabel);
        frame.getContentPane().add(IDinput);
        frame.getContentPane().add(IDVerify);
        frame.getContentPane().add(IDMaker);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}