public class RacingCalculatePrinter {

    private RacingCalculator racingCalculator;

    public RacingCalculatePrinter() {
        racingCalculator = new RacingCalculator();
    }

    public String printRacingCar(RacingCar racingCar) {
        return racingCar.getCarName() + " : " + racingCar.getRace();
    }

    public void printRacingCars(RacingCar[] racingCars) {
        System.out.println("");
        System.out.println("실행 결과");
        for(RacingCar racingCar : racingCars)
            printRacingCar(racingCar);
    }

    public void printRacingWinner(RacingCar[] racingCars) {
        System.out.println("");
        System.out.println(racingCalculator.calculateWinner(racingCars) + "가 최종 우승했습니다.");
    }
}
