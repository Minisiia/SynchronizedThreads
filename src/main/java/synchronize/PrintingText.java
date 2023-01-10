package synchronize;

public class PrintingText {
    private long threatID = 1;                  // id = 1 у потоку main

    public synchronized void printText(String text) {
        long currentThreatID = Thread.currentThread().getId();  // перевірка через id, щоб не друкувати 2 рази з одного потоку
        for (; currentThreatID == threatID; ) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(text);
        threatID = currentThreatID;
        notify();
    }
}
