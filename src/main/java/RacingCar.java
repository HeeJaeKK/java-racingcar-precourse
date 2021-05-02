public class RacingCar {

    private String carName = "FALSE";
    private String race = "";

    public boolean validateCar(String carName) {
        return carName.length() <= 5;
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
