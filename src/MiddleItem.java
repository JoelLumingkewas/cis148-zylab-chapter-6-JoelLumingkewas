import java.util.Scanner;

public class MiddleItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userValues = new int[9];  // Set of data specified by the user
        int i;
        int count = 0;

        while (true) {
            int num = scanner.nextInt();

            if (num < 0) {
                break;
            }

            if (count > 9) {
                System.out.println("Too many inputs");
                return;
            }
            userValues[count++] = num;
        }

        if (count > 0 && count % 2 != 0) {
            System.out.println(userValues[count / 2]);
        }
        else {
            System.out.println("Too many inputs");
        }

    }
}