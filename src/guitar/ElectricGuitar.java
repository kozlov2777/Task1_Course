package guitar;

import java.util.ArrayList;

public class ElectricGuitar extends Guitar{
    public ElectricGuitar(String name, String price, String year) {
        super(name, price, year);
    }

    public void playDistortion(ArrayList chord){
        System.out.println(chord);
    }
}
