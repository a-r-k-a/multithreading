public class ThreadMethods extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running........");
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t1 = new ThreadMethods();
        t1.start();    // runs the run() method that is overriden
        t1.join();     // waits for this thread to terminate
    }
}
