package module11_exceptions_debugging_logins.practie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserRegistrationService {

    private static final Logger log = LoggerFactory.getLogger(UserRegistrationService.class);

    public void registerUser(String email, int age){
        log.debug("Начата регистрация пользователя: email=[email], age=[age]");
        try {
            UserDataValidator.validateEmail(email);
            UserDataValidator.validateAge(age);
            log.info("Пользователь [email] успешно зарегистрирован");
        } catch (InvalidEmailException | InvalidAgeException e) {
            log.error("Ошибка регистрации пользователя", e);
        }
    }
}
