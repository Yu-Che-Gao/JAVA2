package mvc.views;

import javax.swing.*;
import java.awt.*;

public class View {

    public JLabel label;
    public JButton[] digitalButton;
    public JButton[] operatorButton;
    
    private JFrame frame;
    private int tempRow;
    private GridBagConstraints gbc;
    
    public View(String text) {
        digitalButton=new JButton[10];
        for(int i=0; i<10; i++) {
            digitalButton[i]=new JButton(String.valueOf(i));
        }

        String[] operatorString={"Num Lock", "/", "*", "-", "+", "Enter", "."};
        operatorButton=new JButton[operatorString.length];
        for(int i=-0; i<operatorString.length; i++) {
            operatorButton[i]=new JButton(operatorString[i]);
        }

        tempRow=0;
        frame=new JFrame(text);
        frame.getContentPane().setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets  = new Insets(5, 5, 5, 5);
		gbc.ipadx = gbc.ipady = 10;

        tempRow=0;        
        gbc=GBC(gbc, 0, tempRow, 4, 1);
        label=new JLabel("", JLabel.RIGHT);
        frame.getContentPane().add(label, gbc);

        tempRow=1;
        gbc=GBC(gbc, 0, tempRow, 1, 1);
        frame.getContentPane().add(operatorButton[0], gbc);

        gbc=GBC(gbc, 1, tempRow, 1, 1);
        frame.getContentPane().add(operatorButton[1], gbc);

        gbc=GBC(gbc, 2, tempRow, 1, 1);
        frame.getContentPane().add(operatorButton[2], gbc);

        gbc=GBC(gbc, 3, tempRow, 1, 1);
        frame.getContentPane().add(operatorButton[3], gbc);

        tempRow=2;
        for(int i=0; i<3; i++) {
			gbc=GBC(gbc, i, tempRow, 1, 1);
			frame.getContentPane().add(digitalButton[i+1], gbc);
		}

        gbc=GBC(gbc, 3, tempRow, 1, 2);
		frame.getContentPane().add(operatorButton[4], gbc);
		
        tempRow=3;
		for(int i=0; i<3; i++) {
			gbc=GBC(gbc, i, tempRow, 1, 1);
			frame.getContentPane().add(digitalButton[i+4], gbc);
		}
		
        tempRow=4;
		for(int i=0; i<3; i++) {
			gbc=GBC(gbc, i, tempRow, 1, 1);
			frame.getContentPane().add(digitalButton[i+7], gbc);
		}
		
		gbc=GBC(gbc, 3, tempRow, 1, 2);
		frame.getContentPane().add(operatorButton[5], gbc);
		
        tempRow=5;
		gbc=GBC(gbc, 0, tempRow, 2, 1);
		frame.getContentPane().add(digitalButton[0], gbc);
		
		gbc=GBC(gbc, 2, tempRow, 1, 1);
		frame.getContentPane().add(operatorButton[6], gbc);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
    private GridBagConstraints GBC(GridBagConstraints gbc, int gridX, int gridY, int gridWidth, int gridHeight) {
		gbc.gridx = gridX; gbc.gridy = gridY; 
		gbc.gridwidth = gridWidth; gbc.gridheight = gridHeight;
		gbc.weightx = gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		return gbc;
	}
}
