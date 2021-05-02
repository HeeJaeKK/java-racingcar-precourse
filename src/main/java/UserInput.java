import java.util.ArrayList;
import java.util.List;

public class UserInput {

    public RacingCar[] allocateRacingCars(String racingCarNames) {
        List<RacingCar> racingCarList = new ArrayList<>();
        for (String racingCarName : racingCarNames.split(","))
            racingCarList.add(new RacingCar(racingCarName));
        return racingCarList.toArray(new RacingCar[0]);
    }

    public boolean validateUserInput(RacingCar[] racingCars) {
        boolean isValidated = true;
        for(RacingCar racingCar : racingCars)
            isValidated = isValidated && !racingCar.getCarName().equals("FALSE");
        return isValidated;
    }

}
