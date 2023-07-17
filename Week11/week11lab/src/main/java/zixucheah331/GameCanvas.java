package zixucheah331;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameCanvas extends Canvas implements ActionListener, KeyListener {
    private Timer aTimer;
    private int gameStatus = 0;
    // 0 = waiting for start game
    // 1 = game running
    // 2 = game over
    private Player player;
    private Vader vader;
    public GameCanvas() {
        aTimer = new Timer(50, this); // 50 ms 0.05 sec or 20x per second
        player = new Player(300, 500, 5);
        vader = new Vader(300, 100, 10);
        addKeyListener(this);
    }
    public void startTimer() {
        if (gameStatus == 0) {
            aTimer.start();
            gameStatus = 1;
        }
    }
    public void paint(Graphics g) {
        if (player.playerCollideBorder()) {
            gameStatus = 2;
        }
        if (gameStatus == 1) {
            vader.moveVader();
            player.updatePosition();
            vader.updatePosition();
            vader.handleVaderCollideBorder();
        }
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 600, 600);
        g.setColor(Color.BLUE);
        g.fillRect(0, 600, 600, 30);
        player.drawPlayerShip(g);
        vader.drawVaderShip(g);
        if (gameStatus == 0) {
            g.setColor(Color.WHITE);
            g.drawString("PRESS START TO BEGIN..", 250, 300);
        }
        if (gameStatus == 2) {
            g.setColor(Color.WHITE);
            g.drawString("G A M E O V E R", 250, 300);
        }
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == aTimer) {
            repaint(0, 0, 600, 630);
            requestFocus();
        }
    }
    public void moveLeft() {
        player.moveLeft();
    }
    public void moveRight() {
        player.moveRight();
    }
    public void moveUp() {
        player.moveUp();
    }
    public void moveDown() {
        player.moveDown();
    }
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == 37) {
            moveLeft();
        } else if (keyCode == 38) {
            moveUp();
        } else if (keyCode == 39) {
            moveRight();
        } else if (keyCode == 40) {
            moveDown();
        }
    }
    public void keyReleased(KeyEvent e) {
    }
    public void keyTyped(KeyEvent e) {
    }
}