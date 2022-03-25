import javax.swing.JButton;
import java.applet.Applet;

/*
<applet code="JButtonDemo.java" height=400 width=500></applet>
*/

public class JButtonDemo extends Applet
{

    public void init()
    {
        JButton b1 = new JButton("Click here");
        add(b1);
    }
    
}
