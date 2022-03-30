public class Money {
    int dollar;
    int cent;

    public Money(){
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

    public String toString(){
        if(cent < 9)
            return "$" + dollar + "." + "0" + cent ;
        else
        return "$" + dollar + "." + cent;
    }

    public int getDollar(){
        return dollar;
    }

    public int getCent(){
        return cent; 
    }

    public void setDollar (int dollar){
        this.dollar = dollar; 
    }

    public void setCent (int cent){
        this.cent = cent;
    }

    public Money add(Money other){
        int newDollar = dollar + other.dollar;
        int newCent = cent + other.cent;
        if (newCent >= 100)
            newDollar =  cent + 1;
            newCent = 0;
        Money finalValue = new Money (newDollar, newCent);
        return finalValue;
    }

    public Money subtract(Money other){
        int newDollar = dollar - other.dollar;
        int newCent = cent - other.cent;
        Money finalValue = new Money (newDollar, newCent);
        return finalValue;
    }
}