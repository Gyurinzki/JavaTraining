package array.arraylist;

import java.util.Arrays;
import java.util.List;

public class Sum {


    public static void main(String[] args) {
        int elso;
        int masodik;

        List<Integer> szam = Arrays.asList(2, 6, 3, 5, 7, 9);

        for (int i = 0; i < szam.size()-1; i++) {
            elso = szam.get(i);
            masodik = szam.get(i+1);
            System.out.println(elso + masodik);
        }

    }

}
