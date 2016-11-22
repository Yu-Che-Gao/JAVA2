package mvc.controllers;

import mvc.models.*;
import mvc.views.*;


public class Controller {
   
    Model model;
    View view;
    String[] radioButtonCommands={"Left", "Center", "Right"};
    String[] toggleButtonCommands={"Top", "Middle", "Bottom"};

    public Controller(Model model, View view) {
        this.model=model;
        this.view=view;
        model.movedObject=view.lbTitle;
    }

    public void control() {
        for(int i=0; i<view.radioButtonAlign.length; i++) {
            view.radioButtonAlign[i].setActionCommand(radioButtonCommands[i]);
            view.radioButtonAlign[i].addActionListener(model.movingAction);
        }

        for(int i=0; i<view.toggleButtonAlign.length; i++) {
            view.toggleButtonAlign[i].setActionCommand(toggleButtonCommands[i]);
            view.toggleButtonAlign[i].addActionListener(model.movingAction);
        }
    }
}