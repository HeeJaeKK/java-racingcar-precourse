import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingCalculatePrinterTest {

    private RacingCalculatePrinter racingCalculatePrinter;

    @BeforeEach
    public void beforeSet() {
        racingCalculatePrinter = new RacingCalculatePrinter();
    }

    @Test
    public void printRacingCarTest() {
        RacingCar racingCar = new RacingCar("Test1");
        racingCar.proceedRace();
        Assertions.assertEquals(racingCalculatePrinter.printRacingCar(racingCar),"Test1 : -");
    }
}
