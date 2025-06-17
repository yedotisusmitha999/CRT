
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try { 
                Thread.sleep(1000); 
            } 
            catch (InterruptedException e) { 
                e.printStackTrace(); }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        
        t1.start();  // Starts the first thread
        t2.start();  // Starts the second thread
        t3.start();
    }
}
