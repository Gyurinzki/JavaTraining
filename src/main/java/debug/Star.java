package debug;

public class Star {

    public void writeStars(int[] numbers) {
        for (int i = 1; i <  + numbers.length; i++) {
            int stars = numbers[i] - numbers[i-1];
            printStars(stars);
            System.out.println();
        }
    }

    private void printStars(int stars) {
        for (int i = 1; i <= stars; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Star star = new Star();
        int[] numbers = {1, 3, 5, 10, 12};
        star.writeStars(numbers);
    }
}