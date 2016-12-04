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
    }

    public void control() {
        left2Right1Action();
    }

    private void left2Right1Action() {
        view.leftToRight1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(view.jList1.getSelectedIndex() != -1) {
                     model.insertPool(view.jList1.getSelectedValue().toString());
                    //  DefaultListModel<String> model = new DefaultListModel<String>();
                     ((DefaultListModel<String>)(view.jList1.getModel())).remove(3);
                     view.jList3.setModel(new javax.swing.AbstractListModel<String>() {
                            public int getSize() { 
                                return model.getPool().size(); 
                            }
                            public String getElementAt(int i) { 
                                return model.getPool().toArray()[i].toString(); 
                            }
                     });
                     
                     
                }
                
            }
        });
    }
}