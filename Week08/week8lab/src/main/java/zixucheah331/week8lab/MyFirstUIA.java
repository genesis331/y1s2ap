package zixucheah331.week8lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstUIA implements ActionListener {
    JFrame f;
    JPanel p;
    JButton btnExit;
    public MyFirstUIA() {
        f = new JFrame();
        p = new JPanel();
    }
    public void init() {
        f.setTitle("My First Exercise");
        f.setSize(400,300);
        p.setLayout(null);
        JLabel labName = new JLabel("Minah Oh Minah");
        labName.setBounds(25,25,100,50);
        p.add(labName);
        btnExit = new JButton("EXIT");
        btnExit.setBounds(300,200,90,50);
        btnExit.addActionListener(this);
        p.add(btnExit);
        f.add(p);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnExit)
            System.exit(0);
    }
    public static void main(String args[]) {
        MyFirstUIA mfui = new MyFirstUIA();
        mfui.init();
    }
}
