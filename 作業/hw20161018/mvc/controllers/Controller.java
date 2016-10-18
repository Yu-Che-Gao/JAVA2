package mvc.controllers;

import javax.script.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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