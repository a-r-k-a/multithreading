class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName() + "Thread Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}