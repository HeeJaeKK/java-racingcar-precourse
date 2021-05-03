import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserInputTest {

    private UserInput userInput;

    @BeforeEach
    public void beforeSet() {
        userInput = new UserInput();
    }

    @Test
    public void validateUserInputTryNumTest() {
        Assertions.assertTrue(userInput.validateUserInputTryNum("10"));
        Assertions.assertFalse(userInput.validateUserInputTryNum("dfa"));
    }
}
