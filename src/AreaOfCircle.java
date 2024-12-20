import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args){
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter radius of circle");
        double rad = scanner.nextDouble();

        double area = 3.14 * (rad * rad);

        System.out.println("area of circle is:  " + area);
    }
}
