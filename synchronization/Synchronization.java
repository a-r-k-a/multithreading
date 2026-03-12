package synchronization;
public class Synchronization {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        MyThread thread = new MyThread(c1);
        MyThread thread2 = new MyThread(c1);

        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(c1.getter());
    }
}
