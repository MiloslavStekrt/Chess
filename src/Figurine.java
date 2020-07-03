import java.util.ArrayList;
import java.util.List;

public class Figurine {
    int x_position, y_position;
    String figure_id;
    boolean firstTime = false;

    public Figurine(int x_position,int y_position, String id){
        this.x_position = x_position;
        this.y_position = y_position;
        this.figure_id = id;
        if (figure_id.contains("warrior")){
            firstTime = true;
        }
    }
    public void canMove(int figure_id, int x_move, int y_move){
        //King - 3x3

        //Queen - Tower + Archer

        //Horseman - 5x5 - ( Queen + King)

        //Tower - all x in y_position + all y in x_position

        //Archer - all x = y

        //Warrior - first time = 1 +1 else 1
    }
}
