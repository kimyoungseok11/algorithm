import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack<Number> s = new Stack<Number>();
        Queue<Number> q = new LinkedList<>();

        s.push(1);
        s.push(2);
        s.push(5);
        s.push(7);
        s.pop();

        q.offer(1);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.poll();
        System.out.println(s);
        System.out.println(q);
    }
}
