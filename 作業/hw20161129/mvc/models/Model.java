package mvc.models;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Model {
   private ArrayList[] poolList;
   private customListModel[] poolModel;
   public Model() {
        initPoolModel();
   }

   private void initPoolModel() {
       poolModel=new customListModel[3];
       String[][] temp={
            {},
            { "阿信", "冠佑", "石頭", "瑪莎", "怪獸", "周杰倫", "林俊傑" },
            { "Selina", "Hebe", "Ella", "LuLu", "阿妹", "阿福" }
        };

        poolModel[0]=new customListModel(temp[0]);
        poolModel[1]=new customListModel(temp[1]);
        poolModel[2]=new customListModel(temp[2]);
   }

   public customListModel[] getPoolModel() {
       return poolModel;
   }   
}

