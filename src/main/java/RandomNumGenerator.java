import java.util.Random;

public class RandomNumGenerator {

    private Random random;

    public RandomNumGenerator() {
        random = new Random();
    }

    public int generateRandomNum() {
        int randomNum = new RandomNum(random.nextInt(9)).getNum();
        if (randomNum != -1)
            return randomNum;
        return -1;
    }

}
