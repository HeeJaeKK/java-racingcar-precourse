import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    private BufferedReader br;

    public UserInput() {
        br = new BufferedReader(new InputStreamReader(System.in));
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

    public RacingCars userRacingCarInput() {
        RacingCars racingCars = new RacingCars("Initialization");
        while(!racingCars.isRacingCarsAvail()) {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            racingCars = new RacingCars(read());
        }
        return racingCars;
    }

    public boolean validateUserInputTryNum(String userInputTryNum) {
        try {
            Integer.parseInt(userInputTryNum);
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
