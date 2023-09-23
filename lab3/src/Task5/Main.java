package Task5;

import java.util.Scanner;
public class Main {
    public static boolean checking(String login, String password, String confirmPassword){
        try {
            if (login.length() > 20 || !login.matches("\\w+") || login.matches("[а-яА-Я]")) {
                throw new WrongLoginException("Login is incorrect");
            }
            if (password.length() > 20 || !password.matches("\\w+") || password.matches("[а-яА-Я]")) {
                throw new WrongPasswordException("Password is incorrect");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Passwords don't match");
            }
            return true;
        } catch (WrongLoginException e) {
            System.out.println(e);
            return false;
        } catch (WrongPasswordException p) {
            System.out.println(p);
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Login: ");
        String login = reader.nextLine();
        System.out.println();

        System.out.print("Password: ");
        String password = reader.nextLine();
        System.out.println();

        System.out.print("Confirm your password: ");
        String confirmPassword = reader.nextLine();

        System.out.println();

        if (checking(login, password, confirmPassword)){
            System.out.println("Authorization passed");
        } else {
            System.out.println("Incorrect input");
        }

    }
}
