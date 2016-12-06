package mvc.models;

import java.util.*;
import javax.swing.*;

public class customListModel extends AbstractListModel {
        ArrayList temp;
        public customListModel(String[] initComponent) { temp=new ArrayList(Arrays.asList(initComponent)); }
        public Object getElementAt(int arg0) { return temp.get(arg0); }
        public int getSize() { return temp.size(); }
        public void add(String text) {
            temp.add(text);
            int index=temp.size()-1;
            fireIntervalAdded(0, index, index);
        }

        public void remove(int index) {
            temp.remove(index);
            fireIntervalRemoved(this, index, index);
        }
    }