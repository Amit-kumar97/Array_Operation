import java.util.Scanner;

public class EFArray02 {
    //delete the element with index and shift the array
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = {10, 20, 30, 40, 50};
        System.out.println("Enter the Index:");
        int index = sc.nextInt();
        int i = 0;
        try
        {
            for (i = index; i < ar.length-1; i++)
            {
                ar[i] = ar[i+1];
            }
            ar[i] = 0;
            for (int res:ar) {
                System.out.print(res+" ");
            }
        } catch (ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Invalid Index");
        }

    }
}
