package Array;

// FabionacciSeries up-to count 20
public class FabionacciSeries {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        int sum = 0;
        int count = 1;
        System.out.println("Fabionacci Series is : ");
        while (count <= 20) {
            System.out.print(Math.abs(i) + " ");
            // System.out.print(i+" ");
            sum = i + j;
            i = j;
            j = sum;
            count++;
        }

    }

}
