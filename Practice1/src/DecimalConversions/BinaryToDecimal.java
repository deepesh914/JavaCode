package DecimalConversions;

//binary to decimal
import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter binary number");
        int j = sc.nextInt();
        int power = 0;
        double result = 0;
        int k = 0;
        while (j > 0) {
            k = j % 10;
            result = result + k * Math.pow(2, power);
            power++;
            j = j / 10;
        }
        System.out.println(result);
    }
}
