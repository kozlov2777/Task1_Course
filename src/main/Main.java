package main;

import guitar.AcousticGuitar;
import guitar.ElectricGuitar;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {

        ElectricGuitar electricGuitar = new ElectricGuitar("Yamaha", "20000","2010");
        electricGuitar.play(list());
        electricGuitar.playDistortion(chord());
        System.out.println(electricGuitar);
        AcousticGuitar acousticGuitar = new AcousticGuitar("Cord", "20000", "2016");
        System.out.println(list());
        acousticGuitar.playFingerStyle(note());
        System.out.println(acousticGuitar);
    }

    private ArrayList<String> note(){
        ArrayList<String> note = new ArrayList<>();
        note.add("Ля минор, До мажор, Си ми моль");
        note.add("До, Ре, Ми, Фа");
        note.add("Со, Ля, Си");
        return note;
    }

    private ArrayList<String> chord(){
        ArrayList<String> chord = new ArrayList<>();
        chord.add("Am Dm E");
        chord.add("Bm G Em F#");
        chord.add("Dm E Am");
        return chord;
    }
    private ArrayList<String> list(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Изгиб гитары жёлтой");
        list.add("Районы кварталы");
        list.add("Девочка панк");
        return list;
    }
}
