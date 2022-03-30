/*
Title: Power Method algorithm 
@author cmalach1
Date: 3/21/22

*/


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.print("Please enter a base: ");
        Scanner inputA = new Scanner(System.in);
        double base = inputA.nextDouble(); //gets Base value from user 
        System.out.print("Please enter an exponent: ");
        Scanner inputB = new Scanner(System.in);
        int exp = inputB.nextInt(); //gets Exponent value from user 
        System.out.print(pow(base, exp)); //prints out return value from pow() 
    }

    public static int pow(double base, int exp)//returns integer value of the base and exponent provided by user 
    {
        if (exp == 0)//base case: any number to 0th power is 1 
        {
            return 1;
        }
        else if(exp % 2 == 0) //recursive case 1: even numbers 
        {
            return pow(base * base, exp / 2);
        }
        else //recursive case 2: odd numbers 
        {
            return (int) (base * pow(base, exp - 1)); //(int) casts the double base into an int for adequate output 
        }
    }
}
