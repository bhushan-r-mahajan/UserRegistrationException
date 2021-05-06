import java.util.regex.Pattern;

public class UserRegistration {

    static final String namePattern = "^[A-Z][a-z]{3,30}$";
    static final String emailPattern = "(^[a-z 0-9]{0,30} *([.+/-]?[a-z 0-9]{1,20})@[a-z]{1,20}.([a-z]{2,3} *(.[a-z]{2,3}))$)";
    static final String phonePattern = "^[0-9]{2}\\s[0-9]{10}";
    static final String passwordPattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-])(?=.{8,}).*$";

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

    public boolean phoneNumber(String phone) throws UserRegistrationException {

        boolean pattern = Pattern.compile(phonePattern).matcher(phone).matches();
        if (pattern) {
            System.out.println(phone + " is a valid phone number!!");
            return true;
        } else {
            throw new UserRegistrationException(phone + " is not a valid phone number!!");
        }
    }

    public boolean password(String pass) throws UserRegistrationException {

        boolean pattern = Pattern.compile(passwordPattern).matcher(pass).matches();
        if (pattern) {
            System.out.println(pass + " is a valid password!!");
            return true;
        } else {
            throw new UserRegistrationException(pass + " is not a valid password!!");
        }
    }
}
