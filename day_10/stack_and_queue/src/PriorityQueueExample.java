import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(9);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);

        priorityQueue.forEach(i -> System.out.print(i + "\t"));
    }
}
