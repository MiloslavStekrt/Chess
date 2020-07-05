import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {
    int width, height, border = 20;
    public Game(int width, int height){
        this.width = width - border;
        this.height = height - 2 * border;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,width, height);
    }

    @Override
    public void repaint(Rectangle r) {
        //s
    }
}
