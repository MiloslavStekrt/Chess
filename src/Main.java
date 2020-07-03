import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> figure_ids = new ArrayList();
    static List<Figurine> figurines = new ArrayList();
    static String[][] playField = new String[8][8];
    static boolean Start = true;
    static int DefWarrior = 2,DefAles ;

    //create Default figurine_id from Chess
    public static void DefaultIds(){
        figure_ids.add("King");
        figure_ids.add("Queen");
        for (int i = 0; i < 2; i++) {
            figure_ids.add("Horseman");
            figure_ids.add("Tower");
            figure_ids.add("Archer");
        }
        for (int i = 0; i < 8; i++) {
            figure_ids.add("Warrior");
        }
    }

    public static void DefaultPosition(){

    }

    public static void main(String[] args) {
        DefaultIds();
        for (int i = 0; i < figure_ids.size(); i++) {
            if (figure_ids.get(i).contains("Warrior")){
                // add object Figurine to list with name Warrior

                if (Start == true)
                    DefWarrior = 7;

                playField[DefWarrior][i] = "Warrior";
                figurines.add(new Figurine(DefWarrior, i, "Warrior"));
            }else if(figure_ids.get(i).contains("Tower")){
                if (Start == true){
                    playField[1][8] = "Tower";
                    figurines.add(new Figurine(1, 8, "Tower"));
                    playField[8][8] = "Tower";
                    figurines.add(new Figurine(8, 8, "Tower"));
                }else{
                    playField[1][1] = "Tower";
                    figurines.add(new Figurine(1, 1, "Tower"));
                    playField[8][1] = "Tower";
                    figurines.add(new Figurine(8, 1, "Tower"));
                }
            }
        }

        /*
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Chess");
        window.setContentPane(new Game());
        */
    }
}
