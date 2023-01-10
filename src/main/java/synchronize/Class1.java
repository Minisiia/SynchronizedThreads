package synchronize;

public class Class1 implements Runnable {
    private PrintingText printingText;
    private String text = "Class 1";

    public Class1(PrintingText printingText) {
        this.printingText = printingText;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            printingText.printText(text);
        }
    }
}
