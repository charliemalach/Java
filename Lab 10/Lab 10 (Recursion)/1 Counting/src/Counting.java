/*
Title: Counting recursion algorithm 
@author cmalach1
Date: 3/21/22
*/



import java.util.Scanner;

public class Counting {
    public static void main(String[] args) throws Exception 
    {
        System.out.print("Please enter a positive integer: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //scans user input for integer 
        input.close();
        counting(n);
    }

    public static void counting(int n) //prints n integers in order starting from one
    {
        if ( n == 1 ) //base case: input is 1 and only prints once 
            System.out.print(1);
        else //recursive case: input is greater than 1 
        {
            counting(n-1);
            System.out.print(", " + n);
        }
    }
}
