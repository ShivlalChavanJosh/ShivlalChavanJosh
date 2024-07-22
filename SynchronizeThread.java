public class SequentialNumberPrinter {
    private static final int MAX_COUNT = 10;
    private static final Object lock = new Object();
    private static int number = 1;

    public static void main(String[] args) {
        Runnable printTask = () -> {
            while (true) {
                synchronized (lock) {
                    if (number > MAX_COUNT) {
                        break;
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    lock.notify();
                    try {
                        if (number <= MAX_COUNT) {
                            lock.wait();
                        } else {
                            lock.notify();
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        };

        Thread thread1 = new Thread(printTask, "Thread 1");
        Thread thread2 = new Thread(printTask, "Thread 2");

        thread1.start();
        thread2.start();
    }
}
