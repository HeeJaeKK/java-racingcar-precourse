import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {

    private BufferedReader br;

    public UserInput() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

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
        if(!isValidated)
            System.out.println("자동차 이름의 길이가 제한을 벗어났습니다.");
        return isValidated;
    }

    public String read() {
        String input = null;
        try{
            input = br.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        return input;
    }

    public int compareStr(String[] compareStrArr, String compareStr) {
        int SameCnt = 0;
        for(String str : compareStrArr)
            SameCnt += str.equals(compareStr) ? 1 : 0;
        return SameCnt;
    }

    public boolean validateCarNameUnique(String userInput) {
        String[] userInputCarName = userInput.split(",");
        int SameCnt = 0;
        for(String str : userInputCarName)
            SameCnt += compareStr(userInputCarName, str);
        if(SameCnt == userInputCarName.length)
            return true;
        System.out.println("중복된 자동차 이름이 있습니다.");
        return false;
    }

    public RacingCar[] userRacingCarInput() {
        boolean isValidatedInput = false;
        RacingCar[] racingCarsInput = new RacingCar[] {};
        while(!isValidatedInput) {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String input = read();
            isValidatedInput = validateCarNameUnique(input);
            racingCarsInput = allocateRacingCars(input);
            isValidatedInput = isValidatedInput && validateUserInputCarName(racingCarsInput);
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
