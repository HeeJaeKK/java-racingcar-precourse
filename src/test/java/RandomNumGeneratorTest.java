import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomNumGeneratorTest {

    private RandomNumGenerator randomNumGenerator;
    private int TestCnt = 10;

    @BeforeEach
    public void beforeSet() {
        randomNumGenerator = new RandomNumGenerator();
    }

    @Test
    public void randomNumGenerateTest() {
        for(int i=0;i<TestCnt;i++)
            Assertions.assertNotEquals(randomNumGenerator.generateRandomNum(), -1);
    }

    @Test
    public void validateNumRandomlyGenerated() {
        boolean isUnique = true;
        for(int i=0;i<TestCnt;i++)
            isUnique = isUnique && randomNumGenerator.generateRandomNum() == randomNumGenerator.generateRandomNum();
        Assertions.assertFalse(isUnique);
    }
}
