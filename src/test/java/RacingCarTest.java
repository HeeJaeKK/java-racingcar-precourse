import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingCarTest {

    private RacingCar racingCar;

    @BeforeEach
    public void beforeSet() {
        racingCar = new RacingCar();
    }

    @Test
    public void validateLength() {
        Assertions.assertTrue(racingCar.validateCar("Test"));
        Assertions.assertFalse(racingCar.validateCar("Example"));
    }
}
