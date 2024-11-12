import java.util.Scanner;

public class AvgArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] doubleArray = new double[10];
        System.out.print("Enter ten double values: ");
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = input.nextDouble();
        }
        
        double averageValue = average(doubleArray);
        System.out.println("The average is: " + averageValue);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }
}