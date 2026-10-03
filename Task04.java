/*

Task 4

Write a program to calculate the area of a triangle.

The lengths of the three sides of the triangle
are entered using the keyboard, and the program must output the calculated area.

ivesti tik teigiamus skaicius - 3 krastines a, b, c
a + b > c
a + c > b
b + c > a


 */

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter side a for the triangle - positive integer number: ");

        int a = input.nextInt();

        System.out.print("Enter side b for the triangle - positive integer number: ");

        int b = input.nextInt();

        System.out.print("Enter side c for the triangle - positive integer number: ");

        int c = input.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.print("The triangle can be made ");

            double p = (a + b + c) / 2.0; //pusperimetris
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //Herono formule;

            System.out.printf("the triangle area is: %.2f ", area);//%.2f - cia bus ivesta reiksme su 2 skaiciais po kablelio

        } else {

            System.out.print("The triangle cannot be made, because the sum of two sides is less than a third side, please enter the correct values");
        }

    }
}
