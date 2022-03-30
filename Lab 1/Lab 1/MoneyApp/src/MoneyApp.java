public class MoneyApp {
    public static void main(String[] args) {
        Money m1 = new Money();
        Money m2 = new Money(99, 99);
        Money m3 = new Money(0, 50);
        Money m4 = new Money(5, 05);
        Money m5 = new Money (0, 01);


        System.out.println("m1 is " + m1);
        System.out.println("m2 is " + m2);
        System.out.println("m3 is " + m3);
        System.out.println("m4 is " + m4);
        System.out.println("m5 is " + m5);

        Money test = m2.add(m5);
        Money test2 = m2.subtract(m5);
        Money test3 = addition(m2, m5);
        Money test4 = subtraction(m2, m5);
        
        System.out.println("Using Money.java addition: " + m2 + " + " + m5  + " = " + test);
        System.out.println("Using Money.java subtraction: " + m2 + " - " + m5  + " = " + test2);
        System.out.println("Using MoneyApp.java addition: " + m2 + " + " + m5  + " = " + test3);
        System.out.println("Using MoneyApp.java subtraction: " + m2 + " - " + m5  + " = " + test4);

    }

    public static Money addition(Money first, Money second){ //use getters and setters//
        int newDollar = first.getDollar() + second.getDollar();
        int newCent = first.getCent() + second.getCent();
        if (newCent >= 100)
            newDollar =  newDollar + 1;
            newCent = 0;
        Money finalValue = new Money (newDollar, newCent);
        return finalValue;
    } 

    public static Money subtraction(Money first, Money second){
        int newDollar = first.getDollar() - second.getDollar();
        int newCent = first.getCent() - second.getCent();
        Money finalValue = new Money (newDollar, newCent);
        return finalValue;
    }
}