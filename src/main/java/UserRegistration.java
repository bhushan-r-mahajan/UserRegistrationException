import java.util.regex.Pattern;

public class UserRegistration {

@FunctionalInterface
public interface UserRegistrationLambda {
    boolean validate(String pattern, String input);
}
UserRegistrationLambda validateInput= (pattern, input) -> Pattern.compile(pattern).matcher(input).matches();

    static final String namePattern = "^[A-Z][a-z]{3,30}$";
    static final String emailPattern = "(^[a-z 0-9]{0,30} *([.+/-]?[a-z 0-9]{1,20})@[a-z]{1,20}.([a-z]{2,3} *(.[a-z]{2,3}))$)";
    static final String phonePattern = "^[0-9]{2}\\s[0-9]{10}";
    static final String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-])(?=.{8,}).*$";

    public boolean firstName(String firstName) throws UserRegistrationException {
        if (validateInput.validate(namePattern, firstName)) {
            System.out.println(firstName + " is a valid first name!!");
            return true;
        } else {
            throw new UserRegistrationException(firstName + " is not a valid first name!!");
        }
    }

    public boolean lastName(String lastName) throws UserRegistrationException {
        if (validateInput.validate(namePattern, lastName)) {
            System.out.println(lastName + " is a valid last name!!");
            return true;
        } else {
            throw new UserRegistrationException(lastName + " is not a valid last name!!");
        }
    }

    public boolean emailId(String email) throws UserRegistrationException {
        if (validateInput.validate(emailPattern, email)) {
            System.out.println(email + " is a valid email id!!");
            return true;
        } else {
            throw new UserRegistrationException(email + " is not a valid email id!!");
        }
    }

    public boolean phoneNumber(String phone) throws UserRegistrationException {
        if (validateInput.validate(phonePattern, phone)) {
            System.out.println(phone + " is a valid phone number!!");
            return true;
        } else {
            throw new UserRegistrationException(phone + " is not a valid phone number!!");
        }
    }

    public boolean password(String pass) throws UserRegistrationException {
        if (validateInput.validate(passwordPattern, pass)) {
            System.out.println(pass + " is a valid password!!");
            return true;
        } else {
            throw new UserRegistrationException(pass + " is not a valid password!!");
        }
    }
}
