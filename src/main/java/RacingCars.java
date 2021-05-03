import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    final static String SEPERATOR = ",";

    private List<RacingCar> racingCarList = new ArrayList<>();
    private boolean racingCarsAvail = true;

    public RacingCars(String inputCars) {
        for (String racingCarName : inputCars.split(SEPERATOR))
            racingCarList.add(new RacingCar(racingCarName));
        validateRacingCars(inputCars);
    }

    private void validateRacingCars(String inputCars) {
        validateCarNameLength();
        validateCarNameUnique();
        validateCarSize(inputCars);
    }

    public void validateCarSize(String inputCars) {
        if(stringCount(inputCars) == this.racingCarList.size() - 1)
            return;
        System.out.println(",를 형식에 맞게 찍어주세요.");
        this.racingCarsAvail = false;
    }

    private int stringCount(String inputCars) {
        int strCnt = 0;
        for(int i=0;i<inputCars.length();i++)
            strCnt += SEPERATOR.equals(inputCars.charAt(i) + "") ? 1 : 0;
        return strCnt;
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
