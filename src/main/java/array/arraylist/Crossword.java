package array.arraylist;

import java.util.Arrays;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {


        List<String> i = Arrays.asList("KULCS", "KÁLYHA", "LÓ", "AJTÓ", "CSERESZNYEFA", "TEJ", "FELHŐ", "CIPŐ", "MOSODA", "KÁVÉTEJSZÍN", "CITERA", "BABA");
        String jelenlegi;

        for (int j = 0; j < i.size(); j++) {
            jelenlegi = i.get(j);
            if (jelenlegi.length() == 6) {
                System.out.println(jelenlegi);
            }
        }
    }

}
