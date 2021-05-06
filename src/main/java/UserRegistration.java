import java.util.regex.Pattern;

public class UserRegistration {

    static final String namePattern = "^[A-Z][a-z]{3,30}$";
    static final String emailPattern = "(^[a-z 0-9]{0,30} *([.+/-]?[a-z 0-9]{1,20})@[a-z]{1,20}.([a-z]{2,3} *(.[a-z]{2,3}))$)";

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

    public boolean emailId(String email) throws UserRegistrationException {

        boolean pattern = Pattern.compile(emailPattern).matcher(email).matches();
        if (pattern) {
            System.out.println(email + " is a valid email id!!");
            return true;
        } else {
            throw new UserRegistrationException(email + " is not a valid email id!!");
        }
    }
}
