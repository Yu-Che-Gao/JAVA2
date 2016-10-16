package mvc.controllers;

import javax.script.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import mvc.models.*;
import mvc.views.*;

public class Controller {

    private Model model;
    private View view;
    private ActionListener actionListener;
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    
    public void control() {        
        JButton[] digitalButton=view.digitalButton;
        for(int i=0; i<digitalButton.length; i++) {
            digitalButton[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    model.setExpr(model.getExpr()+e.getActionCommand());
                    view.label.setText(model.getExpr());
                }
            });
        }

        JButton[] operatorButton=view.operatorButton;
        for(int i=1; i<=4; i++) {
            operatorButton[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    model.setExpr(model.getExpr()+e.getActionCommand());
                    view.label.setText(model.getExpr());
                }
            });
        }

        view.operatorButton[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("JavaScript");
                try {
                    model.setExpr(engine.eval(model.getExpr()).toString());
                    view.label.setText(model.getExpr());
                } catch(ScriptException ex) {
                    System.out.println(ex);
                }
            }
        });
    }
}