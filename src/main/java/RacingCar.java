public class RacingCar {

    final static int MAX_NAME_LENGTH = 5;

    private String carName = "FALSE";
    private String race = "";

    public boolean validateCar(String carName) {
        return carName.length() <= MAX_NAME_LENGTH;
    }

    public RacingCar(String carName) {
        if(validateCar(carName))
            this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public String getRace() {
        return race;
    }

    public void proceedRace() {
        this.race += "-";
    }
}
