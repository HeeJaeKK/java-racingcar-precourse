import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomNumGeneratorTest {

    private RandomNumGenerator randomNumGenerator;

    @BeforeEach
    public void beforeSet() {
        randomNumGenerator = new RandomNumGenerator();
    }

    @Test
    public void randomNumGenerateTest() {
        int testCnt = 10;
        for(int i=0;i<testCnt;i++)
            Assertions.assertNotEquals(new RandomNum(9).getNum(), -1);
    }

}
