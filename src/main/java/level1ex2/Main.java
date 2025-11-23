package level1ex2;

import level1ex2.model.InPersonWorker;
import level1ex2.model.OnlineWorker;
import level1ex2.model.Worker;

public class Main {
    private static <T extends Worker> void printWorkerInfoAndSalary(T worker, double workingHours){
        System.out.println("--- Worker info & salary ----");
        System.out.println(worker.toString());
        System.out.println("Salary : " + worker.calculateSalary(workingHours));
        System.out.println();
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args){
        OnlineWorker onlineWorker = new OnlineWorker("OnlineWorker", "Paredes", 30);
        InPersonWorker inPersonWorker = new InPersonWorker("InPersonWorker", "Garcia", 30);

        System.out.println(onlineWorker.deprecatedMethodTest(45));
        System.out.println(inPersonWorker.deprecatedMethodTest(1000));

    }
}
