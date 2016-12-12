package mvc.models;

import javax.swing.*;

public class Model {
    private Object [] listData = new Object[9]; //儲存組合方塊選項物件的陣列
    private DefaultComboBoxModel cmbModel=null;
    
    public Model() {
        listData[0] = new String("程式設計");
		listData[1] = new Book("Java 2 入門進階 – 適用JDK6.0",
			"文魁資訊", 590.0, new ImageIcon("image\\P4137.jpg"),
			"2005-5-1");
		listData[2] = new Book("Visual C++.NET 入門進階", 
			"宇哲資訊", 750.0, new ImageIcon("image\\P3237.jpg"), 
			"2003-9-1");
		listData[3] = new String("資料庫");
		listData[4] = new Book("Access 2003 徹底研究", 
			"語文資訊", 590.0, new ImageIcon("image\\A4023.jpg"), 
			"2004-3-1");
		listData[5] = new Book("Access 2003 程式設計", 
			"gogo資訊", 660.0, new ImageIcon("image\\A4033.jpg"),
			"2004-5-1");
		listData[6] = new String("動態網頁");
		listData[7] = new Book("JSP 動態網頁入門實務", 
			"哈哈資訊", 720.0, new ImageIcon("image\\W3135.jpg"), 
			"2003-12-1");
		listData[8] = new Book("ASP 動態網頁入門實務", 
			"XDD資訊", 580.0, new ImageIcon("image\\W4075.jpg"), 
			"2004-7-1");

        cmbModel = new DefaultComboBoxModel(){

            public void setSelectedItem(Object anItem){ //設定選取的選項

                //判斷是否為String, 是則直接終止方法
                if(anItem instanceof String)
                    return; //終止方法取消選取

                super.setSelectedItem(anItem);
                //呼叫基礎類別的setSelectedItem()方法
            }
        };

        for(Object elm : listData) cmbModel.addElement(elm); //將選項加入Model物件
    }

    public Object[] getListData() {
        return listData;
    }

    public DefaultComboBoxModel getCmbModel() {
        return cmbModel;
    }
}
