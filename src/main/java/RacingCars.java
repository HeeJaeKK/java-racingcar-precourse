import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RacingCars {


    private List<RacingCar> racingCarList = new ArrayList<>();
    private boolean racingCarsAvail = true;

    public RacingCars(String inputCars) {
        for (String racingCarName : inputCars.split(","))
            racingCarList.add(new RacingCar(racingCarName));
        validateCarNameLength();
    }

    public void validateCarNameLength() {
        for(RacingCar racingCar : this.racingCarList)
            racingCarsAvail = racingCarsAvail && !racingCar.getCarName().equals("FALSE");
        if(!racingCarsAvail)
            System.out.println("자동차 이름의 길이가 제한을 벗어났습니다.");
    }

    public RacingCar getRacingCar(int carNum) {
        return racingCarList.get(carNum);
    }

    public boolean isRacingCarsAvail() {
        return racingCarsAvail;
    }
}
