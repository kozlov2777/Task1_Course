package guitar;

import java.util.ArrayList;

public class AcousticGuitar extends  Guitar{
    public AcousticGuitar(String name, String price, String year) {
        super(name, price, year);
    }

    public void playFingerStyle(ArrayList note){
        System.out.println(note);
    }
}

