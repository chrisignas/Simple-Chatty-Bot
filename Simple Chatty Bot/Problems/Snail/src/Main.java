import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int daysUntilTop = (a - (2 * b) - 1 + h) / (a - b);
        System.out.println(daysUntilTop);


    }
}