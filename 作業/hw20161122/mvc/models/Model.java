package mvc.models;

import javax.swing.*;
import java.awt.event.*;

public class Model {
   
    public JLabel movedObject;

    public ActionListener movingAction = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String command = e.getActionCommand();

                //取得觸發事件之元件的動作命令字串
                //判斷動作命令字串以設定標籤內文字的對齊方式
                if(command.equals("Left"))
                    movedObject.setHorizontalAlignment(SwingConstants.LEFT);
                else if(command.equals("Center"))
                    movedObject.setHorizontalAlignment(SwingConstants.CENTER);
                else if(command.equals("Right"))
                    movedObject.setHorizontalAlignment(SwingConstants.RIGHT);
                else if(command.equals("Top"))
                    movedObject.setVerticalAlignment(SwingConstants.TOP);
                else if(command.equals("Bottom"))
                    movedObject.setVerticalAlignment(SwingConstants.BOTTOM);
                else if(command.equals("Middle"))
                    movedObject.setVerticalAlignment(SwingConstants.CENTER);
            }	
        };
}