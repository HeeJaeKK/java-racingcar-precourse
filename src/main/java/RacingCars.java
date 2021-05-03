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
        validateCarNameUnique();
    }

    public void validateCarNameLength() {
        for(RacingCar racingCar : this.racingCarList)
            this.racingCarsAvail = this.racingCarsAvail && !racingCar.getCarName().equals("FALSE");
        if(!this.racingCarsAvail)
            System.out.println("자동차 이름의 길이가 제한을 벗어났습니다.");
    }

    public int compareStr(String compareStr) {
        int SameCnt = 0;
        for(RacingCar racingCar : this.racingCarList)
            SameCnt += racingCar.getCarName().equals(compareStr) ? 1 : 0;
        return SameCnt;
    }

    public void validateCarNameUnique() {
        int SameCnt = 0;
        for(RacingCar racingCar : this.racingCarList)
            SameCnt += compareStr(racingCar.getCarName());
        if(SameCnt != this.racingCarList.size()) {
            System.out.println("중복된 자동차 이름이 있습니다.");
            this.racingCarsAvail = false;
        }
    }

    public RacingCar getRacingCar(int carNum) {
        return racingCarList.get(carNum);
    }

    public boolean isRacingCarsAvail() {
        return racingCarsAvail;
    }
}
