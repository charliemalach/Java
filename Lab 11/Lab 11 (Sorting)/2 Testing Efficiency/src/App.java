/*
Title: Testing Efficency 
@author cmalach1
Date: 3/24/22
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
        System.out.print(powR(base, exp)); //prints out return value from pow() 
    }

    public static int powR(double base, int exp)//Pow function using Recursion  
    {
        if (exp == 0)//base case: any number to 0th power is 1 
        {
            return 1;
        }
        else if(exp % 2 == 0) //recursive case 1: even numbers 
        {
            return powR(base * base, exp / 2);
        }
        else //recursive case 2: odd numbers 
        {
            return (int) (base * powR(base, exp - 1)); //(int) casts the double base into an int for adequate output 
        }
    }

    public static void powI(double base, int exp)//Pow function using Iteration 
    {
        double baseVal = base;
        int expVal = exp;
        int output = 1;

        for(; exp != 0; exp--)
        {
            output *= base;
        }

    }

    public static void fibI(int n) //fibonacci function using iteration 
    {
        int val1 = 1, val2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(val1 + " ");
            int sum = val1 + val2; 
            val1 = val2;  
            val2 = sum;
        }
    }


    public static int fibR(int n) //fibonacci function using recursion 
    {
        if (n == 0) //base case: returns 0 
        {
            return 0;
        }
        else if(n == 1) // base case 1: returns 1 
        {
            return 1; 
        }
            return fibR(n - 1) + fibR(n - 2); // recursive case 1: returns nth fibonacci number 
    }
}
