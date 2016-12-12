package mvc.controllers;

import mvc.models.*;
import mvc.views.*;
import javax.swing.*;
import java.awt.event.*; //引用包含ItemListener介面的套件

public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        model=new Model();
        this.model=model;
        this.view=view;
    }

    public void control() {
        view.jComboBox1.setModel(model.getCmbModel());
        view.jComboBox1.setSelectedIndex(1); //設定選項的項目
        view.image.setHorizontalAlignment(JLabel.CENTER);
        view.image.setIcon(((Book)model.getListData()[1]).getCoverImage());
        view.label.setHorizontalAlignment(JLabel.CENTER);
        view.label.setText(((Book)model.getListData()[1]).getPublisher());

        view.jComboBox1.addItemListener(new ItemListener(){

			//回應改變選項狀態的動作
			public void itemStateChanged(ItemEvent e){

				Book item = (Book)e.getItem(); //取得被選取選項的物件

				view.label.setText(item.getPublisher()); //設定書籍資料			
				view.image.setIcon(item.getCoverImage()); //設定顯示書籍封面
			}
		});
    }
}