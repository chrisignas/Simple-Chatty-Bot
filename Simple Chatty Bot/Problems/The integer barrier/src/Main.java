import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (sum < 1000) {
            int num = scanner.nextInt();

            sum = sum + num;
            if (num == 0) {
                break;
            }
        }
        if (sum >= 1000) {
            sum -= 1000;
        }
        System.out.println(sum);
    }
}