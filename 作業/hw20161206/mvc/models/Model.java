package mvc.models;

import javax.swing.*;

public class Model {
    private Object [] listData = new Object[9]; //儲存組合方塊選項物件的陣列
    private DefaultComboBoxModel cmbModel=null;
    
    public Model() {
        listData[0] = new String("男明星");
		listData[1] = new Book("高宇哲",
			"不相信音樂", 590.0, new ImageIcon("image\\高宇哲.jpg"),
			"2005-5-1");
		listData[2] = new Book("怪獸", 
			"相信音樂", 750.0, new ImageIcon("image\\怪獸.jpg"), 
			"2003-9-1");
		listData[3] = new Book("瑪莎", 
			"相信音樂", 590.0, new ImageIcon("image\\瑪莎.jpg"), 
			"2004-3-1");
		listData[4] = new Book("阿信", 
			"相信音樂", 590.0, new ImageIcon("image\\阿信.jpg"), 
			"2004-3-1");
		listData[5] = new Book("石頭", 
			"相信音樂", 660.0, new ImageIcon("image\\石頭.jpg"),
			"2004-5-1");
		listData[6] = new Book("冠佑", 
			"相信音樂", 660.0, new ImageIcon("image\\冠佑.jpg"),
			"2004-5-1");

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
