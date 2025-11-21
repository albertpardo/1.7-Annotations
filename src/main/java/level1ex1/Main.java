package level1ex1;

public class Main {
    private static <T extends Worker> void printWorkerInfoAndSalary(T worker, double workingHours){
        System.out.println("--- Worker info & salary ----");
        System.out.println(worker.toString());
        System.out.println("Salary : " + worker.calculateSalary(workingHours));
        System.out.println();
    }

    public static void main(String[] args){
        Worker worker = new Worker("nameWorker", "Smith", 30);
        OnlineWorker onlineWorker = new OnlineWorker("OnlineWorker", "Paredes", 30);
        InPersonWorker inPersonWorker = new InPersonWorker("InPersonWorker", "Garcia", 30);

        printWorkerInfoAndSalary(worker, 20);
        printWorkerInfoAndSalary(onlineWorker, 20);
        printWorkerInfoAndSalary(inPersonWorker, 20);
    }
}
