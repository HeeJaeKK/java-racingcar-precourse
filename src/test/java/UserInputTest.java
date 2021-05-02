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
}
