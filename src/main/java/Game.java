public class Game {

    public UserInput userInput;
    public RandomNumGenerator randomNumGenerator;
    public RacingCalculator racingCalculator;
    public RacingCalculatePrinter racingCalculatePrinter;

    public Game() {
        userInput = new UserInput();
        randomNumGenerator = new RandomNumGenerator();
        racingCalculator = new RacingCalculator();
        racingCalculatePrinter = new RacingCalculatePrinter();
    }

    public void runGameStage(RacingCar[] racingCars) {
        for (RacingCar racingCar : racingCars) {
            int randomNum = this.randomNumGenerator.generateRandomNum();
            this.racingCalculator.calculateProceedRace(racingCar, randomNum);
        }
        racingCalculatePrinter.printRacingCars(racingCars);
    }

    public static void main(String[] args) {
        Game game = new Game();
        RacingCar[] racingCars = game.userInput.userRacingCarInput();
        int gameStageCnt = game.userInput.userTryNumInput();
        for(int i=0;i<gameStageCnt;i++) {
            game.runGameStage(racingCars);
        }
        game.racingCalculatePrinter.printRacingWinner(racingCars);
    }
}
