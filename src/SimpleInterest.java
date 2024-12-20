import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter principal: ");
        int principal = scan.nextInt();

        System.out.println("Enter rate: ");
        float rate = scan.nextFloat();

        System.out.println("Enter time: ");
        int time = scan.nextInt();

        float interest = (principal * rate * time) / 100;

        System.out.println("calculated interest is:  " + interest);

    }
}
