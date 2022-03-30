/*
Title: Fibonaccis for-loop edition
@author cmalach1
Date: 3/21/22

*/
public class App {
    public static void main(String[] args) throws Exception 
    {
        fibs(5); 
    }

    public static void fibs(int n) //fibonacci method using for loop 
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
}

