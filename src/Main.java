public class Main {
    public static void main(String[] args) {
        Verification verification = new Verification();
        try {
            verification.corresponds();
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println(e.getMessage());
                }
            }
        }
