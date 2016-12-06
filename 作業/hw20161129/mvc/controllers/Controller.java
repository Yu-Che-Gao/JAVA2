package mvc.controllers;

import mvc.models.*;
import mvc.views.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Controller {
   
    private Model model;
    private View view;
    private customListModel[] poolModelArray;

    public Controller(Model model, View view) {
        this.model=model;
        this.view=view;
        poolModelArray=model.getPoolModel();            
        view.jList1.setModel((ListModel<String>)poolModelArray[1]);
        view.jList2.setModel((ListModel<String>)poolModelArray[2]);
        view.jList3.setModel((ListModel<String>)poolModelArray[0]);
        view.jList1.setSelectedIndex(0);
        view.jList2.setSelectedIndex(0);
    }

    public void control() {
        List1ToRight();
        List2ToRight();
    }

    private void List1ToRight() {
        view.leftToRight1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(view.jList1.getSelectedIndex() != -1) {
                    poolModelArray[0].add(view.jList1.getSelectedValue());
                    poolModelArray[1].remove(view.jList1.getSelectedIndex());
                }
            }
        });
    }

    private void List2ToRight() {
        view.leftToRight2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(view.jList2.getSelectedIndex() != -1) {
                    poolModelArray[0].add(view.jList2.getSelectedValue());
                    poolModelArray[2].remove(view.jList2.getSelectedIndex());
                }
            }
        });
    }
}