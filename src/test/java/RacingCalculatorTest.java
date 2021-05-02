import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingCalculatorTest {

    private RacingCalculator racingCalculator;

    @BeforeEach
    public void beforeSet() {
        racingCalculator = new RacingCalculator();
    }

    @Test
    public void calculateProceedRaceTest() {
        RacingCar racingCar = new RacingCar("Test");
        racingCalculator.calculateProccedRace(racingCar,4);
        Assertions.assertEquals(racingCar.getRace(),"-");
        racingCalculator.calculateProccedRace(racingCar,3);
        Assertions.assertEquals(racingCar.getRace(),"-");
    }

}
