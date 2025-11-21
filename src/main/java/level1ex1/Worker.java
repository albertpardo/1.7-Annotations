package level1ex1;

public class Worker {
    private String name;
    private String surname;
    private double priceHour;

    public Worker (String name, String surname, double priceHour){
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public double getPriceHour(){
        return priceHour;
    }

    protected double calculateSalary(double hours){
        return priceHour * hours;
    }

    @Override
    public String  toString(){
        return "name: " + name + ", surname : " + surname + ", priceHour: " + priceHour;
    }
}
