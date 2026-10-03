/*

Task 3

Write a program that calculates the area s and perimeter p of a
rectangle whose upper-left corner has the coordinates (x1, y1)
and lower-right corner has the coordinates (x2, y2).
All coordinates are integers.

Enter the coordinates of the given points using the keyboard.
The sides of the rectangle are parallel to the coordinate axes.

For example:

x1 = 0, y1 = 5, x2 = 4, y2 = 0

Then:

s = 20 and p = 18

The values x1, y1, x2, and y2 are entered using the keyboard.


x krastines ilgis  x2 - x1 = 4 - 0 = 4
y krastines ilgis y1 -y2 = 5 -0 = 5

perimetras p = (4 + 5) * 2
plotas s = 4 * 5 = 20
 */

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter coordinates for x1: ");

        int x1 = input.nextInt();

        System.out.print("Enter coordinates for x2: ");

        int x2 = input.nextInt();

        System.out.print("Enter coordinates for y1: ");

        int y1 = input.nextInt();

        System.out.print("Enter coordinates for y2: ");

        int y2 = input.nextInt();


        int x_length = x2 - x1;//x krastines ilgis
        int y_length =  y1 -y2; //y krastines ilgis

        int p = (x_length + y_length) * 2; //perimetras
        int s = x_length * y_length; //plotas


        System.out.print("the area of a rectangle is " + s + " " +
                "and perimeter of rectangle is " + p);

    }
}