import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        if (age >= 18) {
            if (age >= 65) {
                System.out.println("Eligible to vote and avail Government fund");

            } else
                System.out.println("Not Eligible to avail Government fund but Eligible to vote");
        } else
            System.out.println("We are not Eligible to vote and to avail government fund");
    }
}
