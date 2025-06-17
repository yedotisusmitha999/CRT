
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new MyRunnable());

        t1.start();  
        t2.start();  
        t3.start();
    }
}
