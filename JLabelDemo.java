import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
//import java.applet.Applet;

/* 
<applet code="JLabelDemo.java" height=300 width=500> </applet>
*/

public class JLabelDemo extends Applet {
    public void init() {
        JLabel l1 = new JLabel("This is JLabel");
        Label l2 = new Label("This is label ");
        add(l1);
        add(l2);
    }

}
