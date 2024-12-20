import java.util.Scanner;

public class ToFahrenheit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in celcius:  ");
        int cel = scanner.nextInt();

        int fahr = (cel * 9/5) + 32;
         System.out.println("temperature in fahrenheit:  " + fahr);
    }
}
