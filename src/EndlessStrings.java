import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        System.out.println("Enter your re-printable word: ");
        userInput = keyboard.next();
        keyboard.next();
        while (userInput != "") {
            System.out.println(userInput);
            System.out.println("Enter your re-printable word: ");
            userInput = keyboard.next();

        }

    }
}