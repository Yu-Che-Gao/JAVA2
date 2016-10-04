import javax.swing.*; //引用Swing套件
import java.awt.*; //引用AWT套件

public class Hw20161004 extends JFrame {

	Hw20161004() {
		Container cp = getContentPane(); //取得版面

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
		pack(); //調整視窗大小
		setVisible(true); //顯示視窗
	}

	public static void main(String args[]) {
		new Hw20161004(); //宣告建立視窗畫面的frame物件
	}
}

class control extends JFrame {
	public GridBagConstraints GBC(GridBagConstraints gbc, int gridX, int gridY, int gridWidth, int gridHeight) {
		gbc.gridx = gridX; gbc.gridy = gridY; //設定元件的行列位置
		gbc.gridwidth = gridWidth; gbc.gridheight = gridHeight; //設定寬度為1欄高度為2列
		gbc.weightx = gbc.weighty = 1.0; //設定分配多餘空間的權重
		gbc.fill = GridBagConstraints.BOTH;
		return gbc;
	}
}