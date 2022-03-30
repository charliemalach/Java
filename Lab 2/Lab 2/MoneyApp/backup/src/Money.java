public class Money {
    int dollar; //declare money variables 
    int cent;

    public Money(){ //default money constructor 
        dollar = 0;
        cent = 0;
    }

    public Money(int dollar, int cent){ 
        this.dollar = dollar; 
        this.cent = cent; 
    }

    public Money(int dollar){
        this.dollar = dollar; 
        this.cent = 0;
    }

    public String toString(){ //toString method
        if(cent < 9)
            return "$" + dollar + "." + "0" + cent ;
        else
        return "$" + dollar + "." + cent;
    }

    public int getDollar(){ //accessor method for dollars 
        return dollar;
    }

    public int getCent(){ //accessor method for cents 
        return cent; 
    }

    public void setDollar (int dollar){ //mutator method for dollars 
        this.dollar = dollar; 
    }

    public void setCent (int cent){ //mutator method for cents 
        this.cent = cent;
    }

    public Money add(Money other){ //method to add one money object to another 
        int newDollar = dollar + other.dollar;
        int newCent = cent + other.cent;
        if (newCent >= 100)
            newDollar =  cent + 1;
            newCent = 0;
        Money finalValue = new Money (newDollar, newCent);
        return finalValue;
    }

    public Money subtract(Money other){ //method to subtract one money object from another 
        int newDollar = dollar - other.dollar;
        int newCent = cent - other.cent;
        Money finalValue = new Money (newDollar, newCent);
        return finalValue;
    }

    public boolean equal(Money other){ //method to check if two money values are equal to each other 
        if (this.dollar == other.dollar & this.cent == other.cent){
        System.out.println("$" + this.dollar +"." + this.cent + " and $" + other.dollar + "." + other.cent + " are the same.");
        return true;
        }
        System.out.println("$" + this.dollar +"." + this.cent + " and $" + other.dollar + "." + other.cent + " are not the same.");
        return false;
    }  
}