package level1ex2;

public class InPersonWorker extends Worker {

    private static double fuel = 100.4;

    public InPersonWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(double hoursWorkedByMonth){
        return  super.getPriceHour() * hoursWorkedByMonth + fuel;
    }

    @Override
    public String toString(){
        return (super.toString() + ", fuel: " + fuel);
    }

    @Deprecated
    public String deprecatedMethodTest( double number){
        return ("This is a deprecated method in 'InPersonWorker' object and has received the number : " + number);
    }
}
