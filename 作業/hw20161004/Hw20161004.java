import javax.swing.*; //�ޥ�Swing�M��
import java.awt.*; //�ޥ�AWT�M��

public class Hw20161004 extends JFrame {

	Hw20161004() {
		Container cp = getContentPane(); //���o����

		cp.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets  = new Insets(5, 5, 5, 5);
		gbc.ipadx = gbc.ipady = 10;
		control Control=new control();
		
		for(int i=0; i<3; i++) {
			gbc=Control.GBC(gbc, i, 0, 1, 1);
			cp.add(new JButton(String.valueOf(i+1)), gbc);
		}
		
		gbc=Control.GBC(gbc, 3, 0, 1, 2);
		cp.add(new JButton("+"), gbc);
		
		for(int i=0; i<3; i++) {
			gbc=Control.GBC(gbc, i, 1, 1, 1);
			cp.add(new JButton(String.valueOf(i+4)), gbc);
		}
		
		for(int i=0; i<3; i++) {
			gbc=Control.GBC(gbc, i, 2, 1, 1);
			cp.add(new JButton(String.valueOf(i+7)), gbc);
		}
		
		gbc=Control.GBC(gbc, 3, 2, 1, 2);
		cp.add(new JButton("Enter"), gbc);
		
		gbc=Control.GBC(gbc, 0, 3, 2, 1);
		cp.add(new JButton("0"), gbc);
		
		gbc=Control.GBC(gbc, 2, 3, 1, 1);
		cp.add(new JButton("0"), gbc);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack(); //�վ�����j�p
		setVisible(true); //��ܵ���
	}

	public static void main(String args[]) {
		new Hw20161004(); //�ŧi�إߵ����e����frame����
	}
}

class control extends JFrame {
	public GridBagConstraints GBC(GridBagConstraints gbc, int gridX, int gridY, int gridWidth, int gridHeight) {
		gbc.gridx = gridX; gbc.gridy = gridY; //�]�w���󪺦�C��m
		gbc.gridwidth = gridWidth; gbc.gridheight = gridHeight; //�]�w�e�׬�1�氪�׬�2�C
		gbc.weightx = gbc.weighty = 1.0; //�]�w���t�h�l�Ŷ����v��
		gbc.fill = GridBagConstraints.BOTH;
		return gbc;
	}
}