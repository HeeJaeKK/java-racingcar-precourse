import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    public RacingCar[] allocateRacingCars(String racingCarNames) {
        List<RacingCar> racingCarList = new ArrayList<>();
        for (String racingCarName : racingCarNames.split(","))
            racingCarList.add(new RacingCar(racingCarName));
        return racingCarList.toArray(new RacingCar[0]);
    }

    public boolean validateUserInputCarName(RacingCar[] racingCars) {
        boolean isValidated = true;
        for(RacingCar racingCar : racingCars)
            isValidated = isValidated && !racingCar.getCarName().equals("FALSE");
        return isValidated;
    }

    public String read() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public RacingCar[] userRacingCarInput() {
        boolean isValidatedInput = false;
        RacingCar[] racingCarsInput = new RacingCar[] {};
        while(!isValidatedInput) {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            racingCarsInput = allocateRacingCars(read());
            isValidatedInput = validateUserInputCarName(racingCarsInput);
        }
        return racingCarsInput;
    }

    public boolean validateUserInputTryNum(String userInputTryNum) {
        try {
            int convertInteger = Integer.parseInt(userInputTryNum);
        } catch(Exception e) {
            System.out.println("숫자를 다시 입력해주세요.");
            return false;
        }
        return true;
    }

    public int userTryNumInput() {
        boolean isValidatedInput = false;
        int userTryNum = -1;
        while(!isValidatedInput) {
            System.out.println("시도할 횟수는 몇회인가요?");
            String input = read();
            isValidatedInput = validateUserInputTryNum(input);
            userTryNum = Integer.parseInt(input);
        }
        return userTryNum;
    }

}
