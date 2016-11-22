package mvc.views;

import javax.swing.text.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;
    public JLabel lbTitle = new JLabel("設定對齊方式");
    private ButtonGroup buttonAlignGroup1=new ButtonGroup();
    private ButtonGroup buttonAlignGroup2=new ButtonGroup();
    public JRadioButton[] radioButtonAlign={
        new JRadioButton("靠左", true), new JRadioButton("置中"), new JRadioButton("靠右")
    };    

    public JToggleButton[] toggleButtonAlign={
        new JToggleButton("靠上"), new JToggleButton("置中"), new JToggleButton("靠下")
    };

    public View(String text) {
        frame=new JFrame(text);
        lbTitle.setVerticalAlignment(SwingConstants.CENTER);

        JPanel jpHAlign = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 5));
        JPanel jpVAlign = new JPanel(new GridLayout(3, 1, 5, 5));
        for(int i=0; i<3; i++) {
            jpHAlign.add(radioButtonAlign[i]);
            jpVAlign.add(toggleButtonAlign[i]);
            buttonAlignGroup1.add(radioButtonAlign[i]);
            buttonAlignGroup2.add(toggleButtonAlign[i]);
        }
            
        frame.getContentPane().setLayout(new GridLayout(2, 2)); //設定使用GridLayout管理版面
        JPanel panelTop=new JPanel(new GridLayout(1, 2));
        panelTop.add(lbTitle);
        panelTop.add(jpVAlign);

		frame.getContentPane().add(panelTop);
        frame.getContentPane().add(jpHAlign);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setVisible(true);
    }
}