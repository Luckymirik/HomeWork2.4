import java.util.Scanner;

public class Verification implements VerificationService {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    String b = scanner.nextLine();
    String c = scanner.nextLine();
    private Client client = new Client(a, b, c);


    public void corresponds()
            throws WrongPasswordException, WrongLoginException {
        if (client.getLogin().length() >= 20) {
            throw new WrongLoginException("Логин превышает значение");
        }
        if (!client.getLogin().matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongLoginException("Используйте только латинские буквы, цифры и знак подчеркивания");
        }

        if (client.getPassword().length() >= 20) {
            throw new WrongPasswordException("Пароль превышает значение");
        }
        if (!client.getPassword().matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongPasswordException("Используйте только латинские буквы, цифры и знак подчеркивания");
        }
        if (!client.getPassword().equals(client.getConfirmPassword())) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
    }
}