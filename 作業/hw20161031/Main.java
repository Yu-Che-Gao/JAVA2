import javax.swing.*;  //引用套件
import java.awt.*;
import javax.swing.border.*; //定義框線類別的套件

public class Main extends JFrame{

    Main() {
        Container cp = getContentPane(); //取得內容面版
        JLabel	lbCompound = new JLabel();
        ImageIcon icon = new ImageIcon(".\\ROC_FLAG.jpg"); 
        lbCompound.setIcon(icon);
        lbCompound.setBorder(BorderFactory.createCompoundBorder(
				new CompoundBorder(new MatteBorder(10, 10, 10, 10, Color.red),
                new MatteBorder(10, 10, 10, 10, Color.white)),
				new MatteBorder(10, 10, 10, 10, Color.blue)));

        JPanel jpMatteBevel = new JPanel(new GridLayout(1, 2, 10, 10));
		jpMatteBevel.add(lbCompound);

        cp.add(jpMatteBevel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//設定關閉視窗將預設結束程式

		pack(); //以最適大小顯示視窗
		setVisible(true); //顯示視窗框架
    }

    public static void main(String args[]) {
        new Main();
    }
}