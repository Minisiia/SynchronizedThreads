package synchronize;

/**
 * Створити 2 довільні класи з полями та методами.
 * Необхідно синхронізувати методи цих класів між собою, тобто щоб виводило на екран значення один за одним (1 клас, 2 клас, 1, 2 тощо).
 */

public class Main {
    public static void main(String[] args) {
        PrintingText pt = new PrintingText();
        Class1 task1 = new Class1(pt);
        Class2 task2 = new Class2(pt);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}
