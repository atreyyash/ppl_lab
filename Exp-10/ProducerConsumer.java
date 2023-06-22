import java.util.LinkedList;
public class ProducerConsumer {
private LinkedList<Integer> buffer = new LinkedList<>();
private int capacity;
public ProducerConsumer(int capacity) {
this.capacity = capacity;
}
public void produce() throws InterruptedException {
int value = 0;
while (true) {
synchronized (this) {
while (buffer.size() == capacity) {
wait();
}
System.out.println("Producer produced: " + value);
buffer.add(value++);
notify();
Thread.sleep(1000);
}
}
}
public void consume() throws InterruptedException {
while (true) {
synchronized (this) {
while (buffer.isEmpty()) {
wait();
}
int value = buffer.removeFirst();
System.out.println("Consumer consumed: " + value);
notify();
Thread.sleep(1000);
}
}
}
public static void main(String[] args) {
System.out.print("Yash Atrey\n35520807220\nCSE-A ( 109 )\n\n");
ProducerConsumer pc = new ProducerConsumer(5);
Thread producerThread = new Thread(() -> {
try {
pc.produce();
} catch (InterruptedException e) {
e.printStackTrace();
}
});
Thread consumerThread = new Thread(() -> {
try {
pc.consume();
} catch (InterruptedException e) {
e.printStackTrace();
}
});
producerThread.start();
consumerThread.start();
}
}
