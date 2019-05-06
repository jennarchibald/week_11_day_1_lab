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

        if (this.enoughSheets(sheetsToBePrinted) && this.enoughToner(sheetsToBePrinted)){

            this.useSheets(sheetsToBePrinted);
            this.useToner(sheetsToBePrinted);
        }
    }

    private void useSheets(int usedSheets){
        remainingSheets -= usedSheets;
    }

    private void useToner(int tonerUsed){
        tonerVolume -= tonerUsed;
    }

    private boolean enoughSheets(int requiredSheets){
        return requiredSheets <= remainingSheets;
    }

    private boolean enoughToner(int requiredToner){
        return requiredToner <= tonerVolume;
    }

    public void refill(int newSheets) {
        remainingSheets += newSheets;
    }

    public int getToner() {
        return tonerVolume;
    }
}
