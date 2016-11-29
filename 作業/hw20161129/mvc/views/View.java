package mvc.views;

import javax.swing.text.*;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;

public class View {
    private JFrame frame;

    public View(String text) {
        frame=new JFrame(text);
        Container cp = frame.getContentPane(); //取得內容面版

        String[] strTech = {"吳宗憲", "彭于晏", "沈玉琳", "都敏俊", "高宇哲", "KID", "周杰倫", "林俊傑"};
        String[] strTech2 = {"Selina", "Hebe", "Ella", "黃沐炎","小潔", "小優", "小call", "林志玲"};
        //設定選項的字串陣列

        DefaultListModel dlmBoyStar = new DefaultListModel();
        DefaultListModel dlmGirlStar = new DefaultListModel();
        DefaultListModel dlmSelStar = new DefaultListModel();
        //宣告處理清單方塊內選項的Model物件

        JList listBoyStar = new JList(dlmBoyStar);
        JList listGirlStar =new JList(dlmGirlStar);
        JList listSelStar = new JList(dlmSelStar);
        //以Model物件宣告清單方塊

        JLabel labelStar = new JLabel();
        JLabel labelSelStar = new JLabel("");
        //宣告顯示清單方塊內選項個數的訊息

        JButton btnToRight = new JButton(">");
        JButton btnToRight2 = new JButton(">");

        for(String item: strTech)
			dlmBoyStar.addElement(item);

        for(String item : strTech2)
            dlmGirlStar.addElement(item);

		listBoyStar.setVisibleRowCount(5); //設定左邊清單方塊的可視項目為5列
		listBoyStar.setSelectedIndex(0); //設定左邊清單方塊預設選取第1個選項

        listGirlStar.setVisibleRowCount(5); //設定左邊清單方塊的可視項目為5列
		listGirlStar.setSelectedIndex(0); //設定左邊清單方塊預設選取第1個選項

		listSelStar.setVisibleRowCount(5);


        cp.setLayout(new GridBagLayout());
		//設定內容面版使用GridBagLayout管理佈局

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.fill = GridBagConstraints.BOTH;

		gbc.gridwidth = 2; gbc.gridheight = 1;
		gbc.gridx = 0; gbc.gridy = 0;
		cp.add(new JLabel("被選取的男明星 : "), gbc);

		gbc.gridx = 3; gbc.gridy = 0;
		cp.add(new JLabel("被選中的明星名單 : "), gbc);

        gbc.gridx = 0; gbc.gridy = 6;
		cp.add(new JLabel("被選取的女名單 : "), gbc);

		gbc.gridwidth = 2; gbc.gridheight = 5;
		gbc.gridx = 0; gbc.gridy = 1;
		cp.add(new JScrollPane(listBoyStar), gbc); //加入左邊的清單方塊

        gbc.gridwidth = 2; gbc.gridheight = 5;
		gbc.gridx = 0; gbc.gridy = 7;
		cp.add(new JScrollPane(listGirlStar), gbc); //加入左邊的清單方塊

        gbc.gridwidth = 2; gbc.gridheight = 10;
		gbc.gridx = 3; gbc.gridy = 1;
		cp.add(new JScrollPane(listSelStar), gbc); //加入右邊的清單方塊

        gbc.gridx = 3; gbc.gridy = 7;
		gbc.gridwidth = 1; gbc.gridheight = 1;
		cp.add(labelSelStar, gbc); //將標籤加入容器
		
		gbc.fill = GridBagConstraints.NONE;
		gbc.insets = new Insets(10, 10, 10 ,10);

		gbc.gridx = 2; gbc.gridy = 2;
		cp.add(btnToRight, gbc); //加入將選項移至右邊的指令按鈕

        gbc.gridx = 2; gbc.gridy = 7;
		cp.add(btnToRight2, gbc); //加入將選項移至右邊的指令按鈕

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 300);
        frame.setVisible(true);
    }
}