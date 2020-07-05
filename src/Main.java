import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //create JFrame with JPanel in game class
        newWindow(800,800, "Chess");
    }
    public static void newWindow(int width, int height, String title){
        JFrame frame = new JFrame(title);
        frame.setSize(width,height);
        frame.setContentPane(new Game(width,height-15));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //frame.setResizable(false);
    }
}
