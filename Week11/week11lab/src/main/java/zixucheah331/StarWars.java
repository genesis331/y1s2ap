package zixucheah331;

import javax.swing.*;
import java.awt.event.*;

public class StarWars extends JFrame implements ActionListener {
    private final int SWIDTH = 900;
    private final int SHEIGHT = 700;
    private JButton btnStart, btnExit;
    private JButton btnLeft, btnRight, btnUp, btnDown;
    private GameCanvas gameC = new GameCanvas();
    public StarWars() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("StarWars v0.3");
        setSize(SWIDTH, SHEIGHT);
        setLayout(null);
    }
    public void init() {
        gameC.setBounds(25, 25, 600, 630);
        add(gameC);
        btnLeft = new JButton("LEFT");
        btnLeft.setBounds(650, 400, 100, 25);
        btnLeft.addActionListener(this);
        add(btnLeft);
        btnRight = new JButton("RIGHT");
        btnRight.setBounds(750, 400, 100, 25);
        btnRight.addActionListener(this);
        add(btnRight);
        btnUp = new JButton("UP");
        btnUp.setBounds(700, 375, 100, 25);
        btnUp.addActionListener(this);
        add(btnUp);
        btnDown = new JButton("DOWN");
        btnDown.setBounds(700, 425, 100, 25);
        btnDown.addActionListener(this);
        add(btnDown);
        btnStart = new JButton("START");
        btnStart.setBounds(650, 500, 100, 25);
        btnStart.addActionListener(this);
        add(btnStart);
        btnExit = new JButton("EXIT");
        btnExit.setBounds(650, 625, 100, 25);
        btnExit.addActionListener(this);
        add(btnExit);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnExit) {
            System.exit(0);
        } else if (e.getSource() == btnStart) {
            gameC.startTimer();
        } else if (e.getSource() == btnLeft) {
            gameC.moveLeft();
        } else if (e.getSource() == btnUp) {
            gameC.moveUp();
        } else if (e.getSource() == btnRight) {
            gameC.moveRight();
        } else if (e.getSource() == btnDown) {
            gameC.moveDown();
        }
    }
    public static void main(String args[]) {
        StarWars sw = new StarWars();
        sw.init();
    }
}
