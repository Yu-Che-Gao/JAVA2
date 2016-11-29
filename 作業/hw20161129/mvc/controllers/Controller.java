package mvc.controllers;

import mvc.models.*;
import mvc.views.*;


public class Controller {
   
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model=model;
        this.view=view;
    }

    public void control() {
        
    }
}