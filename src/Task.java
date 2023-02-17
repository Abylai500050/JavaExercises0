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

    }

    void task3 ()
    {

    }
}
