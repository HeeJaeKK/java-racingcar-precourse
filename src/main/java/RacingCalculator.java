public class RacingCalculator {

    public void calculateProccedRace(RacingCar racingCar, int index) {
        if(index >= 4)
            racingCar.proceedRace();
    }

    public int calculateWinnerLength(RacingCar[] racingCars) {
        int maxLength = 0;
        for(int i=0;i<racingCars.length;i++)
            maxLength = Math.max(maxLength, racingCars[i].getRace().length());
        return maxLength;
    }
}
