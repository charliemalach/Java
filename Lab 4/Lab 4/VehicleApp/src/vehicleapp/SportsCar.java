package vehicleapp;

public class SportsCar extends Car
{

    private int tickets;
    public SportsCar()
    {
        super.setDoors(2);
        super.setType("sports car");
        tickets = 0;
    }

    public SportsCar(double speed, int wheels, String color, int doors, int tickets)
    {
        super(speed, wheels, color, doors);
        super.setType("sports car");
        this.tickets = tickets;
    }

    public String toString()
    {
        return super.toString() + "\nI have " + tickets + " speed tickets.";
    }

    public String movement()
    {
        return "I fly!";
    }

    public int getTickets() 
    {
        return tickets;
    }

    public void setTickets(int tickets)
    {
        this.tickets = tickets;
    }
    
}
