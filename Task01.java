/*   Write a program that calculates how many books k, on average,
are read per year by one visitor of a school library.
The average number of books read per month v and the average number
of visitors to the library per year n are known.

The integer values v and n are entered using the keyboard.

k = total books per month v  * 12 / visitors quantity per year n

*/

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter average numer of books read per month in the library: ");

        int v = input.nextInt();

        System.out.print("Please enter the average number of visitors per year:");

        int n = input.nextInt();

        double k = (double) v * 12 / n; //treat v as double only for this calculation

        System.out.print("Average books per visitor per year:" + k);

    }
}


