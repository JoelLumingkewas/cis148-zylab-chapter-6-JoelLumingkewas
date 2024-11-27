import java.util.Scanner;

public class ElementsInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        int i;
        int[] userValues = new int[userNum];


        for (i = 0; i < userValues.length; i++) {
            userValues[i] = scanner.nextInt();
        }

        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();


        for (i = 0; i < userValues.length; i++) {
            if (userValues[i] >= lowerBound && userValues[i] < upperBound) {
                System.out.print(userValues[i] + " ");
            }
        }

        System.out.println();







    }
}

