import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RacingCarsTest {

    private RacingCars racingCars;

    @BeforeEach
    public void beforeSet() {
        racingCars = new RacingCars("Test1,Test2,Test3");
    }

    @Test
    public void generateRacingCarsTest() {
        Assertions.assertEquals(racingCars.getRacingCar(0).getCarName(),"Test1");
        Assertions.assertEquals(racingCars.getRacingCar(1).getCarName(),"Test2");
        Assertions.assertEquals(racingCars.getRacingCar(2).getCarName(),"Test3");
    }

}
