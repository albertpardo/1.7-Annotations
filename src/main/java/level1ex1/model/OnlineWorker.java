package level1ex1.model;

public class OnlineWorker extends Worker {

    private final double INTERNET_SERVICE = 20.2;

    public OnlineWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(double hoursWorkedByMonth){
        return  super.getPriceHour() * hoursWorkedByMonth + INTERNET_SERVICE;
    }

    @Override
    public String toString(){
        return (super.toString() + ", InternetService: " + INTERNET_SERVICE);
    }
}
