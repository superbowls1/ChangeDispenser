import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//joey slepski lab 6 3/07 intelij

public class ChangeDispenser {
    private static final int[] coinworth = {100, 25, 10, 5, 1};
    private static final String[] coinname = {"dollar", "quarter", "dime", "nickle", "penny"};


    //public wrapper
    //NOTE - your wrapper method does NOT have to be a void method.
    public static void makeChange(int amount) {
        recursive(amount, 0);
    }



    private static void recursive(int amount,int coinindex) {
        if (amount <= 0) {
            return;
        }
        int count = amount / coinworth[coinindex];
        if (count > 0) {
            System.out.println(count + " " + coinname[coinindex]);

        }
        int remaining = amount % coinworth[coinindex];
        recursive(remaining, coinindex + 1);


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount of money");
        double amount = in.nextDouble();
        int cents = (int) (amount * 100);
        makeChange(cents);
    }
}



