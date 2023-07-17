package zixucheah331;

import java.awt.*;

public class Player extends Ship {
    public Player(int sx, int sy, int s) {
        super(sx, sy, s);
    }

    public void drawPlayerShip(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, 30, 30);
    }

    public boolean playerCollideBorder() {
        boolean collide = false;
        if ((x <= 0) | (x >= 570) | (y <= 0) | (y >= 570))
            collide = true;
        return collide;
    }
}
