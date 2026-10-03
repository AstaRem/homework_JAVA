/*

Task 2

The dimensions of a room — its length and width — are known. Both values are integers.
Write a program to calculate the total amount of money required to purchase
tiles for the floor of the room.
An additional 5% of tiles must be purchased to account for possible waste or damage.

The following data are entered using the keyboard: length, width, and price.

The price variable must be of a floating-point type.

int length
int width
double price

plotas = (length * width)
atsarga = plotas * 0.05
plyteliu kiekis = (plotas + atsarga) * price
 */


import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length of the room: ");

        int length = input.nextInt();

        System.out.print("Please enter the width of the room: ");

        int width = input.nextInt();

        System.out.print("Please enter the tile price in eur per square meter: ");

        double price_m = input.nextInt();

        int area = (length * width);
        double spare = area * 0.05;
        double s_meters = area + spare;

        double price_total = s_meters * price_m;


        System.out.print("The cost of the tiles for your room: " + price_total + " eur ");

    }
}


