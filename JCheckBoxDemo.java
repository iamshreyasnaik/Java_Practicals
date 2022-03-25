import java.applet.Applet;
import javax.swing.*;
import java.awt.event.*;

/*
<applet code="JCheckBoxDemo.java" height=300 width=500> </applet>
*/

public class JCheckBoxDemo extends Applet implements ActionListener {
    JCheckBox c1, c2, c3, c4;
    JButton btn;
    JLabel l1;

    public void init() {
        c1 = new JCheckBox("Pen");
        c2 = new JCheckBox("Pencil");
        c3 = new JCheckBox("book");
        c4 = new JCheckBox("notebook");
        btn = new JButton("Enter");
        l1 = new JLabel("Result..");

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(btn);
        add(l1);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = "";
        if (c1.isSelected()) {
            s = s + " : Pen";
        }
        if (c2.isSelected()) {
            s = s + " : Pencil";
        }
        if (c3.isSelected()) {
            s = s + " : book";
        }
        if (c4.isSelected()) {
            s = s + " : notebook";
        }

        l1.setText("You selected : " + s);

    }
}