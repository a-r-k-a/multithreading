public class Lifycycle extends Thread {
    @Override
    public void run() {
        System.out.println("Running State");
        try {
            Thread.sleep(2000);
            System.out.println("This is a separate Thread");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Lifycycle l1 = new Lifycycle();
        System.out.println(l1.getState());
        l1.start();
        System.out.println(l1.getState());
        System.out.println(Thread.currentThread().getState());
        Thread.sleep(100);
        System.out.println(l1.getState());
        l1.join();
        System.out.println(l1.getState());
    }
}
