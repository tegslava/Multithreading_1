import multithread.MyThread;

/**
 * @author Tegneryadnov_VI
 * @java Задача 1. Межпоточный диалог
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int THREADS_SLEEPING_TIME = 3000;
        int MAIN_THREAD_SLEEPING_TIME = 15000;
        int THREAD_COUNT = 4;

        ThreadGroup mainGroup = new ThreadGroup("main group");
        for (int i = 0; i < THREAD_COUNT; i++) {
            new MyThread(String.format("Я поток %d", i + 1),
                    mainGroup,
                    THREADS_SLEEPING_TIME).start();
        }
        Thread.sleep(MAIN_THREAD_SLEEPING_TIME);
        System.out.println("Завершаю все потоки.");
        mainGroup.interrupt();
    }
}
