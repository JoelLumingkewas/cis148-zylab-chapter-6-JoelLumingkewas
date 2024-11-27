import java.util.Scanner;

public class OutputValuesBelow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        int i;
        int[] userValues = new int[userNum];   // List of integers from input


        for (i = 0; i < userValues.length; i++) {
            userValues[i] = scanner.nextInt();
        }

        int userThresh = scanner.nextInt();

        for (i = 0; i < userValues.length; i++) {
            if (userValues[i] <= userThresh) {
                System.out.print(userValues[i] + " ");
            }
        }

        System.out.println();



    }
}
