package Figurine;

public class Warrior {
    public int getX_position() {
        return x_position;
    }

    public void setX_position(int x_position) {
        this.x_position = x_position;
    }

    public int getY_position() {
        return y_position;
    }

    public void setY_position(int y_position) {
        this.y_position = y_position;
    }

    int x_position, y_position;
    boolean firstTime = true;

    public Warrior(int x_position,int y_position){
        this.x_position = x_position;
        this.y_position = y_position;
    }
}
