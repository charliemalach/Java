import java.util.Random; //imports Random
import java.util.Arrays; //imports Arrays
import java.lang.Math; //imports Math 

public class App {

    private static final int UPPERBOUND = 50;
    private static int[] randArray = new int[UPPERBOUND];
    private static final int LOWERBOUND = 5;
    private static int[] tally = new int [(UPPERBOUND * 2)-1];
    
    public static void main(String[] args)  {
        Random rand = new Random(UPPERBOUND);
        int numUsed = Math.abs((rand.nextInt() % 46))+5;
        System.out.printf("%8s %8s\n", "N", "Count"); //prints name of columns
        for (int i = 0; i < numUsed; i++){
            
            randArray[i] = rand.nextInt() % UPPERBOUND;
            System.out.printf("%8s\n", randArray[i]); //prints N (number)
        }
        for (int j = 0; j < numUsed; j++){
            tally[randArray[j]+UPPERBOUND]++;
            System.out.printf("%16s\n", tally[j]); //prints count of N
            
        }
    }

}