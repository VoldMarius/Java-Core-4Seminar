package module;

import lombok.Data;

@Data
public class CheckerEnter {
    public static boolean check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(login.length() > 20){
            throw new WrongLoginException("Login length must be less than 20 characters");
        }
        if(password.length() > 20  ) {
            throw new WrongPasswordException("Password length must be less than 20 characters and passwords must match");

        }
        if( !password.equals(confirmPassword)){
            throw new WrongPasswordException("Password must match");

        }
        return true;
    }
}

