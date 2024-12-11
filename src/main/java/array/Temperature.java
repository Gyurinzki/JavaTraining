package array;

import java.util.Arrays;

public class Temperature {

    boolean sameTempValues(double[] day, double[] anotherday) {
        return Arrays.equals(day, anotherday);
    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        System.out.println(temperature.sameTempValues(new double[]{1, 2, 3}, new double[] {1, 2, 3}));
        System.out.println(temperature.sameTempValues(new double[]{2.2, 2, 3}, new double[] {2.2, 2, 3}));
    }

}
