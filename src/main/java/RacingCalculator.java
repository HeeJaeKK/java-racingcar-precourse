import java.util.StringJoiner;

public class RacingCalculator {

    public void calculateProccedRace(RacingCar racingCar, int index) {
        if(index >= 4)
            racingCar.proceedRace();
    }

    public int calculateWinnerLength(RacingCar[] racingCars) {
        int maxLength = 0;
        for (RacingCar racingCar : racingCars)
            maxLength = Math.max(maxLength, racingCar.getRace().length());
        return maxLength;
    }

    public void distinguishWinner(StringJoiner winners, RacingCar candidateRacingCar, int maxLength) {
        if(candidateRacingCar.getRace().length() == maxLength)
            winners.add(candidateRacingCar.getCarName());
    }
    public String calculateWinner(RacingCar[] racingCars) {
        int maxLength = calculateWinnerLength(racingCars);
        StringJoiner winners = new StringJoiner(", ");
        for (RacingCar racingCar : racingCars)
            distinguishWinner(winners, racingCar, maxLength);
        return winners.toString();
    }
}
