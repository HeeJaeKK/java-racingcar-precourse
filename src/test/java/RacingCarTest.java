import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    private RacingCar racingCar;

    @BeforeEach
    public void beforeSet() {
        racingCar = new RacingCar("Test");
    }

    @Test
    public void validateLength() {
        Assertions.assertTrue(racingCar.validateCar("Test"));
        Assertions.assertFalse(racingCar.validateCar("Example"));
    }

    @Test
    public void generateRacingCarTest() {
        Assertions.assertEquals(new RacingCar("Test").getCarName(),"Test");
        Assertions.assertEquals(new RacingCar("TestCar").getCarName(),"FALSE");
    }
}