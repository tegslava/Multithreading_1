package multithread;

public class MyThread extends Thread {
    final private String name;
    final private int sleepingTime;

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                System.out.printf("%s. Всем привет!\n", name);
                Thread.sleep(sleepingTime);
            }
        } catch (InterruptedException e) {
        }
        System.out.printf("%s завершен... \n", Thread.currentThread().getName());
    }

    public MyThread(String name, ThreadGroup threadGroup, int sleepingTime) {
        super(threadGroup, name);
        this.name = name;
        this.sleepingTime = sleepingTime;
    }
}
