public class ThreadMethods extends Thread {

    // start()
    // run()
    // sleep()
    // join()
    // setPriority
    // interrupt
    // yield
    // setDaemon

    // public ThreadMethods(String name) {
    //     super(name);
    // }

    @Override
    public void run() {
        // System.out.println("Thread is running........");
        // for (int i=0; i<5; i++) {
        //     String a = "";
        //     for ( int j=0; j<10000; j++) {
        //         a += "a";
        //     }
        //     System.out.println(Thread.currentThread().getName() + "Priority: " + Thread.currentThread().getPriority() + "Count: " + i);
        //     try {
        //         Thread.sleep(10);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }

        // try {
        //     Thread.sleep(1000);
        //     System.out.println("Thread is running");
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        //     System.out.println("Thread interrupted: " + e);
        // }

        // for (int i = 0; i< 5; i++) {
        //     System.out.println(Thread.currentThread().getName() + " is running");
        //     // Thread.yield();
        // }

        while (true) {
            System.out.println("Hello world");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        // ThreadMethods low = new ThreadMethods("High Priority");
        // ThreadMethods medium = new ThreadMethods("Medium Priority");
        // ThreadMethods high = new ThreadMethods("Low Priority");
        // low.setPriority(Thread.MIN_PRIORITY);
        // medium.setPriority(Thread.NORM_PRIORITY);
        // high.setPriority(Thread.MAX_PRIORITY);
        // low.start();    // runs the run() method that is overriden
        // medium.start();    // runs the run() method that is overriden
        // high.start();    // runs the run() method that is overriden
        // // t1.join();     // waits for this thread to terminate
        // // System.out.println("THREAD t1 just finished executing");
        // ThreadMethods t1 = new ThreadMethods();
        // ThreadMethods t2 = new ThreadMethods();
        // t1.start();
        // t2.start();
        // t1.interrupt();

        ThreadMethods t1 = new ThreadMethods();
        t1.setDaemon( true);
        t1.start();
        System.out.println("Main done");
    }
}
