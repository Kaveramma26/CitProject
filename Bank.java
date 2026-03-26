import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();
        System.out.println("Age= "+age);
        System.out.println("Enter the Salary");
        int sal=sc.nextInt();
        System.out.println("Salary= "+sal);
        if(age>=21 && sal>21000)
            System.out.println("Person can apply for loan");
        else
            System.out.println("Person cannot apply for loan");     
    }

    
}
