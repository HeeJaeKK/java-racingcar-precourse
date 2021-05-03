import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserInputTest {

    private UserInput userInput;

    @BeforeEach
    public void beforeSet() {
        userInput = new UserInput();
    }

    @Test
    public void allocateRacingCarsTest() {
        RacingCar[] racingCars = userInput.allocateRacingCars("Test1,Test2,Test123");
        Assertions.assertEquals(racingCars[0].getCarName(),"Test1");
        Assertions.assertEquals(racingCars[1].getCarName(),"Test2");
        Assertions.assertEquals(racingCars[2].getCarName(),"FALSE");
    }

    @Test
    public void validateUserInputCarNameTest() {
        RacingCar racingCarTest1 = new RacingCar("Test1");
        RacingCar racingCarTest2 = new RacingCar("Test2");
        Assertions.assertTrue(userInput.validateUserInputCarName(new RacingCar[] {racingCarTest1, racingCarTest2}));
        RacingCar racingCarTest3 = new RacingCar("Test123");
        Assertions.assertFalse(userInput.validateUserInputCarName(new RacingCar[] {racingCarTest1, racingCarTest2, racingCarTest3}));
        RacingCar racingCarTest4 = new RacingCar("");
        Assertions.assertFalse(userInput.validateUserInputCarName(new RacingCar[] {racingCarTest1, racingCarTest2, racingCarTest4}));
    }

    @Test
    public void validateUserInputTryNumTest() {
        Assertions.assertTrue(userInput.validateUserInputTryNum("10"));
        Assertions.assertFalse(userInput.validateUserInputTryNum("dfa"));
    }

    @Test
    public void validateUserInputCarNameUnique() {
        RacingCar racingCarTest1 = new RacingCar("Test1");
        RacingCar racingCarTest2 = new RacingCar("Test2");
        Assertions.assertTrue(userInput.validateCarNameUnique(new RacingCar[] {racingCarTest1, racingCarTest2}));
        RacingCar racingCarTest3 = new RacingCar("Test2");
        Assertions.assertFalse(userInput.validateCarNameUnique(new RacingCar[] {racingCarTest1, racingCarTest2, racingCarTest3}));
    }
}
