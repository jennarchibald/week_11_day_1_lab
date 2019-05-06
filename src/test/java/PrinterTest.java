import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }


    @Test
    public void hasPaperLeft(){
        assertEquals(100, printer.getRemainingSheets());
    }

    @Test
    public void printUsesSheets(){
        printer.print(4, 3);
        assertEquals(88, printer.getRemainingSheets());
    }

    @Test
    public void doesNotPrintIfNotEnoughSheets(){
        printer.print(55, 3);
        assertEquals(100, printer.getRemainingSheets());
    }

    @Test
    public void paperCanBeRefilled(){
        printer.refill(100);
        assertEquals(200, printer.getRemainingSheets());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void printUsesToner(){
        printer.print(4, 3);
        assertEquals(88, printer.getToner());
    }

    @Test
    public void printerDoesNotPrintIfNotEnoughToner(){
        printer.print(55, 4);
        assertEquals(100, printer.getToner());
    }
}
