import java.util.ArrayList;
import java.util.List;

public class RacingCars {


    private List<RacingCar> racingCarList = new ArrayList<>();

    public RacingCars(String inputCars) {
        for (String racingCarName : inputCars.split(","))
            racingCarList.add(new RacingCar(racingCarName));
    }

    public RacingCar getRacingCar(int carNum) {
        return racingCarList.get(carNum);
    }
}
