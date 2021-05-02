import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomNumGeneratorTest {

    private RandomNumGenerator randomNumGenerator;
    private int randomNumTest;

    @BeforeEach
    public void beforeSet() {
        randomNumGenerator = new RandomNumGenerator();
        randomNumTest = randomNumGenerator.getRandomNum();
    }

}
