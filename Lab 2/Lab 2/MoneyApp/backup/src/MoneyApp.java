import java.util.Scanner;
import java.util.Arrays;

public class MoneyApp {
    public static void main(String[] args) {

        Money[] ledger = new Money[3]; //new money array 
        // Money m1 = new Money();
        // Money m2 = new Money(99, 99);
        // Money m3 = new Money(0, 50);
        // Money m4 = new Money(5, 05);
        // Money m5 = new Money (0, 01);


        // System.out.println("m1 is " + m1);
        // System.out.println("m2 is " + m2);
        // System.out.println("m3 is " + m3);
        // System.out.println("m4 is " + m4);
        // System.out.println("m5 is " + m5);

        // Money test = m2.add(m5);
        // Money test2 = m2.subtract(m5);
        // Money test3 = addition(m2, m5);
        // Money test4 = subtraction(m2, m5);
        
        // System.out.println("Using Money.java addition: " + m2 + " + " + m5  + " = " + test);
        // System.out.println("Using Money.java subtraction: " + m2 + " - " + m5  + " = " + test2);
        // System.out.println("Using MoneyApp.java addition: " + m2 + " + " + m5  + " = " + test3);
        // System.out.println("Using MoneyApp.java subtraction: " + m2 + " - " + m5  + " = " + test4);

        popLedger(ledger);
        System.out.println("Here is the original ledger: \n");
        printLedger(ledger);
        ledger[0].equal(ledger[1]);
        searchLedger(ledger, ledger[0]);
        Sort(ledger);
        System.out.println("Sorted ledger: " + Arrays.toString(ledger)); //prints bubblesorted ledger 

    }

    public static Money addition(Money first, Money second){ //client file addition function
        int newDollar = first.getDollar() + second.getDollar();
        int newCent = first.getCent() + second.getCent();
        if (newCent >= 100)
            newDollar =  newDollar + 1;
            newCent = 0;
        Money finalValue = new Money (newDollar, newCent);
        return finalValue;
    } 

    public static Money subtraction(Money first, Money second){ //client file subtraction function
        int newDollar = first.getDollar() - second.getDollar();
        int newCent = first.getCent() - second.getCent();
        Money finalValue = new Money (newDollar, newCent);
        return finalValue;
    }

    public static void popLedger(Money[] arrayLedger){ //method populates array with values for dollar and cent
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < arrayLedger.length; i++) {
            System.out.println(" ");
            System.out.println("Please enter dollars for Value " + (i+1) + ":");
            System.out.println(" ");
            int ledgerDollar = console.nextInt();
            System.out.println("Please enter cents for Value " + (i+1) + ":");
            System.out.println(" ");
            int ledgerCent = console.nextInt();
            arrayLedger[i] = new Money(ledgerDollar, ledgerCent);
        }
    }

    public static void printLedger(Money[] arrayLedger){ //prints original array in order 
        Money printMe;
        for (int i = 0; i < arrayLedger.length; i++) {
            printMe = arrayLedger[i];
            System.out.print(printMe.toString());
            System.out.print(" ");
        }
        System.out.println();
    }   

    public static boolean searchLedger(Money[] arrayLedger, Money target){ //search for ledger
        int count = 0;
        while (target != arrayLedger[count]){
            if (target.equal(arrayLedger[count]) == true){
                return false;
                
            }
            count++;
        }
        return true;
    }

    public static void Sort(Money arrayLedger[]){
        for (int i = 0; i < arrayLedger.length; i++){
            for (int j = 0; j < arrayLedger.length - i - 1; j++){
                if (arrayLedger[j].getDollar() > arrayLedger[j+1].getDollar()){
                    if (arrayLedger[j].getCent() > arrayLedger[j+1].getCent()){
                        Money temp = arrayLedger[j];
                        arrayLedger[j] = arrayLedger[j+1];
                        arrayLedger[j+1] = temp;
                    }
                else if (arrayLedger[j].getCent() > arrayLedger[j+1].getCent()){
                    Money temp = arrayLedger[j];
                    arrayLedger[j] = arrayLedger[j+1];
                    arrayLedger[j+1] = temp;
                }
            }
        }
    }
}
}