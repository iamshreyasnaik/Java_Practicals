import java.applet.Applet;
import javax.swing.*;
import java.awt.event.*;

/*
<applet code="EvenOdd.java" height=300 width=500></applet>
*/
public class EvenOdd extends Applet implements ActionListener {
    JLabel l1, l2;
    JTextField t1;
    JButton b1;

    public void init() {
        l1 = new JLabel("Enter Any Number : ");
        t1 = new JTextField(20);
        b1 = new JButton("Enter");
        l2 = new JLabel("your result..");

        add(l1);
        add(t1);
        add(b1);
        add(l2);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        int num = Integer.parseInt(t1.getText());

        if (num % 2 == 0) {
            l2.setText("The number " + num + " is Even.");
        } else {
            l2.setText("The number " + num + " is Odd.");
        }
    }

}