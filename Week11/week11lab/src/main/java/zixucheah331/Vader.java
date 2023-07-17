package zixucheah331;

import java.awt.*;

public class Vader extends Ship {
    public Vader(int sx, int sy, int s) {
        super(sx, sy, s);
    }

    public void drawVaderShip(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 30, 30);
    }

    public void handleVaderCollideBorder() {
        if ((x <= 0) | (x >= 570) | (y <= 0) | (y >= 570)) {
            dx = -dx;
            dy = -dy;
        }
        updatePosition();
    }

    public void moveVader() {
        int dir = rdm.nextInt(4);
        if (dir == 0) moveLeft();
        else if (dir == 1) moveUp();
        else if (dir == 2) moveRight();
        else if (dir == 3) moveDown();
    }
}
