import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        //checking for voting eligibility
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the age");
        // int age = sc.nextInt();
        // if (age >= 18)
        //     System.out.println("Eligible to vote");
        // else
        //     System.out.println("Not Eligible to Vote");
        // sc.close();

        //if-else - Biggest of two numbers
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            if(a>b)
                System.out.println("First number is largest");
            else
                System.out.println("Second is largest"); 



    }

}
