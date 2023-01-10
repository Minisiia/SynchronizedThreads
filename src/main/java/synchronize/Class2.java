package synchronize;

public class Class2 implements Runnable {
    private PrintingText printingText;
    private String text = "Class 2";

    public Class2(PrintingText printingText) {
        this.printingText = printingText;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            printingText.printText(text);
        }
    }
}
