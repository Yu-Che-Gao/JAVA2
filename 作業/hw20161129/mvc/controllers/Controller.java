package mvc.controllers;

import mvc.models.*;
import mvc.views.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Controller {
   
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model=model;
        this.view=view;
        AbstractListModel<String>[] poolModelArray=model.getPoolModel();            
        view.jList1.setModel(poolModelArray[1]);
        view.jList2.setModel(poolModelArray[2]);
        view.jList3.setModel(poolModelArray[0]);
    }

    public void control() {
        left2Right1Action();
    }

    private void left2Right1Action() {
        view.leftToRight1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(view.jList1.getSelectedIndex() != -1) {
                    // model.insertPool(1, view.jList1.getSelectedValue());
                    model.getPoolModel()[2].addElement("aaa");
                }
                
            }
        });
    }
}