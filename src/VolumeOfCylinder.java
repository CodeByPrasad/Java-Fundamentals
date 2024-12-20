import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius:  ");
        float rad = scan.nextFloat();

        System.out.println("Enter height:  ");
        float height = scan.nextFloat();

        double vol = 3.14 * (rad * rad) * height;

        System.out.println("Volume of cylinder is:  " + vol);
    }
}
