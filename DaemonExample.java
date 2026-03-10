public class DaemonExample {

    public static void main(String[] args) throws InterruptedException {
        Thread daemonThread = new Thread(() -> {
            int count = 0;
            while (true) {
                System.out.println("Daemon still running......." + ++count);
                // try {
                //     // Thread.sleep(500);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                //     System.out.println("Daemon interrupted");
                // }
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread userThread = new Thread(() -> {
            for ( int i=0; i<5; i++) {
                System.out.println("User thred is runing: " + i);
                // try {
                //     // Thread.sleep(1000);
                // } catch (InterruptedException e) {
                //     e.printStackTrace();
                //     System.out.println("User thread interrupted");
                // }
            }
            System.out.println("User thread finished");
        });

        userThread.start();
        userThread.join();

        System.out.println("Main thread has finished executing, JVM will quit now");
    }
    
}
