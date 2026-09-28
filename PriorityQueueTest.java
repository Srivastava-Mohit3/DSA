import java.util.*;

class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Person> pq = new PriorityQueue<>((a, b) -> b.age - a.age);
        pq.offer(new Person(10, "A"));
        pq.offer(new Person(20, "B"));
        pq.offer(new Person(30, "C"));
        pq.offer(new Person(40, "D"));
        System.out.println(pq.poll().name);
    }
}
