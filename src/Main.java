import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year : ");
        int year = input.nextInt();
        if (year <= 0) {
            System.out.print("Incorrect year...");
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else if (year % 4 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}