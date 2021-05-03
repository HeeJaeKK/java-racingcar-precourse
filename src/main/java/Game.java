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

    public void runGameStage(RacingCars racingCars) {
        for (int i=0;i<racingCars.getRacingCars().length;i++) {
            int randomNum = this.randomNumGenerator.generateRandomNum();
            this.racingCalculator.calculateProceedRace(racingCars.getRacingCar(i), randomNum);
        }
        racingCalculatePrinter.printRacingCars(racingCars.getRacingCars());
    }

    public static void main(String[] args) {
        Game game = new Game();
        RacingCars racingCars = game.userInput.userRacingCarInput();
        int gameStageCnt = game.userInput.userTryNumInput();
        for(int i=0;i<gameStageCnt;i++) {
            game.runGameStage(racingCars);
        }
        game.racingCalculatePrinter.printRacingWinner(racingCars.getRacingCars());
    }
}
