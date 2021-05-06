import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    void givenFirstName_WhileProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.firstName("Bhushan");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhileNotProper_ThrowsException() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.firstName("bhushan");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenLastName_WhenProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.lastName("Mahajan");
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastname_WhenNotProper_ThrowsExcption() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.lastName("mahajan");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenEmail_WhenProper_ReturnsMessage() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.emailId("bhushan@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmail_WhenNotProper_ThrowsException() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.lastName("bhushan@mahajan@gmail.com");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenEmail_WhenNotProper_ThrowsException1() {
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.lastName("bhushan.@mahajan@gmail.co.in");
            Assertions.assertFalse(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
}
