import java.util.Scanner;

public class Task {

    Scanner input = new Scanner(System.in);
    int number;

    public Task (int number)
    {

        this.number = number;
    }

    void run ()
    {
        switch (number) {
            case 1 -> task1();
            case 2 -> task2();
            case 3 -> task3();
        }
    }

    void task1 ()
    {
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

    void task2 ()
    {
        double U;
        int k, y;

        System.out.print("Enter the k: ");
        k = input.nextInt();
        System.out.println();

        System.out.print("Enter the y: ");
        y = input.nextInt();
        System.out.println();

        U = (Math.log10(k - y) + Math.pow(y, 4)) / (Math.pow(Math.E, y) + 2.355 * Math.pow(k, 2));

        System.out.println("U is " + U);
    }

    void task3 ()
    {

    }
}
