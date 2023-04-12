package homeworks.lesson17.Encapsulation;

public class WorkerApp {
    public static void main(String[] args) {
        Worker worker=new Worker("Abbas",100,20);
        System.out.println(worker.getAge());
        worker.setSalary(200);
        System.out.println(worker.getSalary());
        System.out.println(worker.getName());
    }
}
