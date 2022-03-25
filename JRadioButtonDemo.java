import java.applet.Applet;
import javax.swing.*;
import java.awt.event.*;

/*
<applet code="JRadioButtonDemo.java" height=500 width=700></applet>
*/

public class JRadioButtonDemo extends Applet implements ActionListener {
    JLabel l1;

    public void init() {
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        JRadioButton other = new JRadioButton("other");
        l1 = new JLabel("hello..");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        bg.add(other);

        add(male);
        add(female);
        add(other);
        add(l1);

        setLayout(null);
        male.setBounds(300, 100, 200, 40);
        female.setBounds(300, 200, 200, 40);
        other.setBounds(300, 300, 200, 40);
        l1.setBounds(300, 500, 200, 40);

        male.addActionListener(this);
        female.addActionListener(this);
        other.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        l1.setText("You selected : " + s);
    }
}
