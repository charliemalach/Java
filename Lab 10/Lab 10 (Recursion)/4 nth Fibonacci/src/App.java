/*
Title: Fibonaccis recursion edition
@author cmalach1
Date: 3/21/22
*/

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception 
    {
        System.out.print("Enter the value of n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //gets n  value from user 
        scanner.close();
        System.out.print(fibval(n)); //prints the return value of fibval()
    }

    public static int fibval(int n) //fibonacci method using recursion 
    {
        if (n == 0) //base case: returns 0 
        {
            return 0;
        }
        else if(n == 1) // base case 1: returns 1 
        {
            return 1; 
        }
            return fibval(n - 1) + fibval(n - 2); // recursive case 1: returns nth fibonacci number 
    }
}

