import java.util.regex.Pattern;

public class UserRegistration {

    static final String namePattern = "^[A-Z][a-z]{3,30}$";

    public boolean firstName(String name) throws UserRegistrationException {

        boolean pattern = Pattern.compile(namePattern).matcher(name).matches();
        if (pattern) {
            System.out.println(name + " is a valid first name!!");
            return true;
        } else {
            throw new UserRegistrationException(name + " is not a valid first name!!");
        }
    }

    public boolean lastName(String name) throws UserRegistrationException {

        boolean pattern = Pattern.compile(namePattern).matcher(name).matches();
        if (pattern) {
            System.out.println(name + " is a valid last name!!");
            return true;
        } else {
            throw new UserRegistrationException(name + " is not a valid last name!!");
        }
    }
}
