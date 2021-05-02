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
        racingCalculator.calculateProceedRace(racingCar,4);
        Assertions.assertEquals(racingCar.getRace(),"-");
        racingCalculator.calculateProceedRace(racingCar,3);
        Assertions.assertEquals(racingCar.getRace(),"-");
    }

    @Test
    public void calculateWinnerLengthTest() {
        RacingCar racingCarTest1 = new RacingCar("Test1");
        RacingCar racingCarTest2 = new RacingCar("Test2");
        racingCalculator.calculateProceedRace(racingCarTest1,4);
        Assertions.assertEquals(racingCalculator.calculateWinnerLength(new RacingCar[] {racingCarTest1, racingCarTest2}),1);
        racingCalculator.calculateProceedRace(racingCarTest1,4);
        Assertions.assertEquals(racingCalculator.calculateWinnerLength(new RacingCar[] {racingCarTest1, racingCarTest2}),2);
        racingCalculator.calculateProceedRace(racingCarTest2,4);
        Assertions.assertEquals(racingCalculator.calculateWinnerLength(new RacingCar[] {racingCarTest1, racingCarTest2}),2);
    }

    @Test
    public void calculateWinnerTest() {
        RacingCar racingCarTest1 = new RacingCar("Test1");
        RacingCar racingCarTest2 = new RacingCar("Test2");
        racingCalculator.calculateProceedRace(racingCarTest1,4);
        Assertions.assertEquals(racingCalculator.calculateWinner(new RacingCar[] {racingCarTest1, racingCarTest2}),"Test1");
        racingCalculator.calculateProceedRace(racingCarTest2,4);
        Assertions.assertEquals(racingCalculator.calculateWinner(new RacingCar[] {racingCarTest1, racingCarTest2}),"Test1, Test2");
        racingCalculator.calculateProceedRace(racingCarTest2,4);
        Assertions.assertEquals(racingCalculator.calculateWinner(new RacingCar[] {racingCarTest1, racingCarTest2}),"Test2");
    }
}
