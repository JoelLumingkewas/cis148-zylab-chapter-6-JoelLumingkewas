import java.util.Scanner;

public class TwoSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        int i;
        int[] userValues = new int[userNum];
        int smallestNum = Integer.MAX_VALUE;
        int secondNum = Integer.MAX_VALUE;

        for (i = 0; i < userNum; i++) {
            userValues[i] = scanner.nextInt();
        }

        for (i = 0; i < userNum; i++) {
            int num = userValues[i];

            if (num < smallestNum) {
                secondNum = smallestNum;
                smallestNum = num;
            }
            else if (num < secondNum && num != smallestNum) {
                secondNum = num;
            }

        }

        System.out.println(smallestNum + " " + secondNum);



    }
}
