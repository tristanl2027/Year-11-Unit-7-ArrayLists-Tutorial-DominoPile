import java.util.ArrayList;
import java.util.Collections;

class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile(){
        pile = new ArrayList<>();
    }

    public void newStack6() {
        for (int i = 0; i <= 6; i++){
            for (int j = i; j <= 6; j++){
                pile.add(new Domino(i, j));
            }
        }
    }

    public ArrayList<Domino> getPile(){
        return pile;
    }

    public void shuffle(){
        Collections.shuffle(pile);
    }
}
