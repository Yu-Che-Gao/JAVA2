import javax.swing.*;  //引用Swing套件
import java.awt.*;

public class hw20160920 extends JFrame {

	hw20160920() {
		Container cp = getContentPane(); //取得內容面版
		cp.setLayout(new GridLayout(3, 1));
		JPanel[] rows=this.getJPanel(3);
		for(int i=0; i<rows.length; i++) {
			JButton[] btnArray=this.getMultiJButton(3, (2-i)*3+1);
			
			for(int j=0; j<btnArray.length; j++) {
				btnArray[j].setPreferredSize(new Dimension(75, 75));
				rows[i].add(btnArray[j]);
			}
			
			cp.add(rows[i]);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300); //設定視窗的大小
		setVisible(true); //顯示視窗
	}
	
	private JPanel[] getJPanel(int nums) {
		JPanel[] rows=new JPanel[nums];
		for(int i=0; i<rows.length; i++) {
			rows[i]=new JPanel();
		}
		
		return rows;
	}
	
	private JButton[] getMultiJButton(int nums, int startNum) {
		JButton[] btnArray=new JButton[nums];
		for(int i=0; i<btnArray.length; i++) {
			btnArray[i]=new JButton(String.valueOf(startNum+i));
		}
		
		return btnArray;
	}

	public static void main(String args[]) {
		new hw20160920(); //建立視窗框架物件
	}
}