package zixucheah331;

import java.util.Random;

public class Ship {
    protected int x;
    protected int dx = 0;
    protected int y;
    protected int dy = 0;
    protected int speed;
    protected Random rdm = new Random();
    public Ship(int sx, int sy, int s) {
        x = sx;
        y = sy;
        speed = s;
    }
    public void updatePosition() {
        x = x + dx;
        y = y + dy;
    }
    public void moveLeft() {
        dx = -speed;
        dy = 0;
    }
    public void moveRight() {
        dx = speed;
        dy = 0;
    }
    public void moveUp() {
        dx = 0;
        dy = -speed;
    }
    public void moveDown() {
        dx = 0;
        dy = speed;
    }
}