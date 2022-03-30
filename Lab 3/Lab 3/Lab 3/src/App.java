import java.util.Random; //imports Random
import java.lang.Math; //imports Math 

public class App {
    public static final int UPPERBOUND = 50;//sets highest possible bound 
    public static final int SEED = 689540126; //same seed will always populate the same "random" numbers, 
    public static final int LOWERBOUND = 5;//sets lowest possible bound 
    
    public static void main(String[] args)  {
        Random rand = new Random(); //generates new random 
        int[] randArray = new int[UPPERBOUND];//new random array with upperbound constraints 
        int[] tally = new int [(UPPERBOUND * 2)-1];
        int numUsed = Math.abs((rand.nextInt() % 46))+5; //gives values 5 to 50 

        for (int i = 0; i < numUsed; i++){
            randArray[i] = rand.nextInt() % UPPERBOUND;
            // System.out.println(randArray[i]); //prints N (number), should be moved to printArray
        }

        for (int i = 0; i < numUsed; i++)
            tally[randArray[i]+ (UPPERBOUND - 1)]++; 
        
        System.out.printf("%8s %8s\n", "N", "Count"); //prints name of columns

        for(int i = -(UPPERBOUND - 1); i < UPPERBOUND; i++){ 
            if(tally[i + (UPPERBOUND - 1)] != 0)
                System.out.printf("%8d %8d\n", i, tally[i + (UPPERBOUND-1)]);
        }
    }
}

/* 
PROBLEMS: 
1. NOT RANDOM OUTPUTS 
2. NOT IN CONSTRAINTS (-20)
3. NOT PRINTING CORRECTLY 
4. TOO LONG OF A LIST 
*/