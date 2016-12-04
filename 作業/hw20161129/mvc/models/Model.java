package mvc.models;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Model {
   private Stack<String> pool;
   private String[] poolData={};
   private String[] boyData={ "阿信", "冠佑", "石頭", "瑪莎", "怪獸", "周杰倫", "林俊傑" };
   private String[] girlData={ "Selina", "Hebe", "Ella", "LuLu", "阿妹", "阿福" };
   private AbstractListModel[] poolModel;
   private AbstractListModel<String> boyModel;
   private AbstractListModel<String> girlModel;
   public Model() {
        pool= new java.util.Stack<String>();
        poolModel=new AbstractListModel[3];
        poolModel[0]=new AbstractListModel<String>() {
            String[] strings=poolData;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        };

        poolModel[1]=new AbstractListModel<String>() {
            String[] strings = boyData;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        };

        poolModel[2]=new AbstractListModel<String>() {
            String[] strings = girlData;
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        };
   }

   public void insertPool(String data) {
      pool.push(data);
   }

   public Stack getPool() {
       return pool;
   }

   public AbstractListModel[] getPoolModel() {
       return poolModel;
   }
}