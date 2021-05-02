import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RandomNumTest {

    private RandomNum randomNum;

    @BeforeEach
    public void beforeSet() {
        randomNum = new RandomNum(1);
    }

    @Test
    public void validateNum0to9() {
        Assertions.assertTrue(randomNum.validateNum(1));
        Assertions.assertTrue(randomNum.validateNum(9));
        Assertions.assertFalse(randomNum.validateNum(10));
        Assertions.assertFalse(randomNum.validateNum(-1));
    }
}