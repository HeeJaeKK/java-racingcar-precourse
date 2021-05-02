import java.util.ArrayList;
import java.util.List;

public class UserInput {

    public RacingCar[] allocateRacingCars(String racingCarNames) {
        List<RacingCar> racingCarList = new ArrayList<>();
        for (String racingCarName : racingCarNames.split(","))
            racingCarList.add(new RacingCar(racingCarName));
        return racingCarList.toArray(new RacingCar[0]);
    }

}
