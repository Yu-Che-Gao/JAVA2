package mvc.views;

import javax.swing.*;
import java.awt.*;

public class View {

    public JLabel label;
    private JFrame frame;
    private int tempRow;
    private GridBagConstraints gbc;
    
    public View(String text) {
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
        frame.getContentPane().add(new JButton("Num Lock"), gbc);

        gbc=GBC(gbc, 1, tempRow, 1, 1);
        frame.getContentPane().add(new JButton("/"), gbc);

        gbc=GBC(gbc, 2, tempRow, 1, 1);
        frame.getContentPane().add(new JButton("*"), gbc);

        gbc=GBC(gbc, 3, tempRow, 1, 1);
        frame.getContentPane().add(new JButton("-"), gbc);

        tempRow=2;
        for(int i=0; i<3; i++) {
			gbc=GBC(gbc, i, tempRow, 1, 1);
			frame.getContentPane().add(new JButton(String.valueOf(i+1)), gbc);
		}

        gbc=GBC(gbc, 3, tempRow, 1, 2);
		frame.getContentPane().add(new JButton("+"), gbc);
		
        tempRow=3;
		for(int i=0; i<3; i++) {
			gbc=GBC(gbc, i, tempRow, 1, 1);
			frame.getContentPane().add(new JButton(String.valueOf(i+4)), gbc);
		}
		
        tempRow=4;
		for(int i=0; i<3; i++) {
			gbc=GBC(gbc, i, tempRow, 1, 1);
			frame.getContentPane().add(new JButton(String.valueOf(i+7)), gbc);
		}
		
		gbc=GBC(gbc, 3, tempRow, 1, 2);
		frame.getContentPane().add(new JButton("Enter"), gbc);
		
        tempRow=5;
		gbc=GBC(gbc, 0, tempRow, 2, 1);
		frame.getContentPane().add(new JButton("0"), gbc);
		
		gbc=GBC(gbc, 2, tempRow, 1, 1);
		frame.getContentPane().add(new JButton("0"), gbc);

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
