package zixucheah331.week8lab;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstUIB implements ActionListener {
    JFrame f;
    JPanel p;
    JButton btnOut;
    JButton btnExit;
    public MyFirstUIB() {
        f = new JFrame();
        p = new JPanel();
    }
    public void init() {
        f.setTitle("My Second Exercise");
        f.setSize(400,300);
        p.setLayout(null);
        btnOut = new JButton("OUT");
        btnOut.setBounds(110,0,90,50);
        btnOut.addActionListener(this);
        p.add(btnOut);
        JLabel labName = new JLabel("Minah Oh Minah");
        labName.setBounds(25,50,100,50);
        p.add(labName);
        btnExit = new JButton("EXIT");
        btnExit.setBounds(300,200,90,50);
        btnExit.addActionListener(this);
        p.add(btnExit);
        f.add(p);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnExit || e.getSource() == btnOut)
            System.exit(0);
    }
    public static void main(String args[]) {
        MyFirstUIB mfui = new MyFirstUIB();
        mfui.init();
    }
}
