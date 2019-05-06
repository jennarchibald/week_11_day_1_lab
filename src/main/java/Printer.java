public class Printer {

    private int remainingSheets;
    private int tonerVolume;

    public Printer(int sheets){
        this.remainingSheets = sheets;
        this.tonerVolume = 100;
    }
    public int getRemainingSheets() {
        return remainingSheets;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        int sheetsToBePrinted = numberOfCopies * numberOfPages;
        if (sheetsToBePrinted <= remainingSheets && sheetsToBePrinted <= tonerVolume){
            remainingSheets -= sheetsToBePrinted;
            tonerVolume -= sheetsToBePrinted;
        }
    }

    public void refill(int newSheets) {
        remainingSheets += newSheets;
    }

    public int getToner() {
        return tonerVolume;
    }
}
