package mvc.models;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Model {
   private Stack<String> pool;
   public Model() {
        pool= new java.util.Stack<String>();
   }

   public void insertPool(String data) {
      pool.push(data);
   }

   public Stack getPool() {
       return pool;
   }
}