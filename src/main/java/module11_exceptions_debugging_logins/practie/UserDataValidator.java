package module11_exceptions_debugging_logins.practie;

public class UserDataValidator {
    public static void validateEmail(String email) throws InvalidEmailException {
        if (email == null) {
            throw new InvalidEmailException("null");
        }
        if (!email.contains("@")) {
            throw new InvalidEmailException(email);
            }
        if (!email.contains(".")){
            throw new InvalidEmailException(email);
        }
        if (email.length() < 5) {
            throw new InvalidEmailException(email);
        }

    }
    public static void validateAge(int age) throws InvalidAgeException{
        if (0 < age || age > 150){
            throw new InvalidAgeException(age);
        }
    }
}
