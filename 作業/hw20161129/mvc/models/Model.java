package mvc.models;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Model {
   private ArrayList[] poolList;
   private AbstractListModel[] poolModel;
   public Model() {
        initPoolList();
        initPoolModel();
   }

   private void initPoolModel() {
       poolModel=new AbstractListModel[3];
        poolModel[0]=new AbstractListModel<String>() {
            String[] strings=(String[])poolList[0].toArray(new String[0]);
            public void addElement(String text) { 
                poolList[0].add(text);
                fireIntervalAdded(this, poolList[0].size()-1, poolList[0].size()-1);
             }
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        };

        poolModel[1]=new AbstractListModel<String>() {
            String[] strings = (String[])poolList[1].toArray(new String[0]);
            public void addElement(String text) { 
                poolList[0].add(text);
                fireIntervalAdded(this, poolList[1].size()-1, poolList[1].size()-1);
             }
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        };

        poolModel[2]=new AbstractListModel<String>() {
            String[] strings = (String[])poolList[2].toArray(new String[0]);
            public void addElement(String text) { 
                poolList[0].add(text);
                fireIntervalAdded(this, poolList[2].size()-1, poolList[2].size()-1);
             }
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        };
   }

   private void initPoolList() {
       String[][] poolData={
            {},
            { "阿信", "冠佑", "石頭", "瑪莎", "怪獸", "周杰倫", "林俊傑" },
            { "Selina", "Hebe", "Ella", "LuLu", "阿妹", "阿福" }
        };

        poolList=new ArrayList[poolData.length];
        for(int i=0; i<poolList.length; i++) {
            poolList[i]=new ArrayList<String>();
            for(int j=0; j<poolData[i].length; j++) {
                poolList[i].add(poolData[i][j]);
            }
        }
            
   }

   public void insertPool(int number, String data) {
      poolList[number].add(data);
   }

   public List[] getPool() {
       return poolList;
   }

   public AbstractListModel[] getPoolModel() {
       return poolModel;
   }
}