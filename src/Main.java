import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double G;
        int n, y;

        System.out.print("Enter the n: ");
        n = input.nextInt();
        System.out.println();

        System.out.print("Enter the y: ");
        y = input.nextInt();
        System.out.println();

        G = n * (y + 3.5) + Math.sqrt(y);

        System.out.println("G is " + G);
    }
}
