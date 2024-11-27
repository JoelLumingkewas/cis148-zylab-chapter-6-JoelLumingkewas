import java.util.Scanner;

public class ContainsTheCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        int i;
        String[] userWords = new String[userNum];


        for ( i = 0; i < userNum; i++) {
            userWords[i] = scanner.next();
        }

        String userLetter = scanner.next();

        for (i = 0; i < userNum; i++) {
            if (userWords[i].contains(userLetter)) {
                System.out.println(userWords[i]);
            }
        }




    }
}