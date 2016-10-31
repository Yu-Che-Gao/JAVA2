
package mvc.controllers;

import mvc.models.*;
import mvc.views.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Controller {
    
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model=model;
        this.view=view;
    }
    
    public void control() {        
        view.IDVerify.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean result = model.verifyID(view.IDinput);
                if(result)
                     JOptionPane.showMessageDialog(null, "驗證正確!!", "驗證身分證字號", JOptionPane.INFORMATION_MESSAGE);
                else
                     JOptionPane.showMessageDialog(null, "驗證錯誤!!", "驗證身分證字號", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        view.IDMaker.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                view.IDinput.setText(model.makeID());
            }
        });
    }
}