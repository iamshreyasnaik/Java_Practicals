import java.applet.Applet;
import javax.swing.*;

/* 
<applet code="JTextFieldDemo.java" width=400 height=300></applet>
*/

public class JTextFieldDemo extends Applet {
    public void init() {
        JTextField t1 = new JTextField("text", 10);
        add(t1);
    }
}
