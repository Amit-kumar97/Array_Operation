package ArrayLists;

import java.util.Scanner;

/*
Program to find the second largest number in array Java by taking input values from the end-user.

Output for the different test-cases:-

Enter length of the array: 5
Enter array elements:
25 10 35 15 45
Second Largest element = 35

Enter length of the array: 5
Enter array elements:
-30 -50 10 -20 -35
Second largest element = -20
 */
public class SecondLargest {

    //------------method to find second largest number in array
    public static int secondLargest(int[] arr) {

        //--------------declare variables
        int fmax = 0;
        int smax = 0;

        //---------------assign first element to fmax, smax
        fmax = arr[0];
        smax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (fmax < arr[i]) {
                smax = fmax;
                fmax = arr[i];
            } else if(smax < arr[i]) {
                smax = arr[i];
            }
        }

        return smax;
    }

    //------------main method
    public static void main(String[] args) {
        //--------------create Scanner class object to read input
        Scanner sc = new  Scanner(System.in);

        //-------------declare variables
        int length = 0;
        int numbers[] = null;

        //-------------take length of the array
        System.out.print("Enter length of the array: ");
        length = sc.nextInt();

        //-------------create array
        numbers = new int[length];

        //------------take array inputs
        System.out.println("Enter array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        //-----------method call
        System.out.println("Second largest element = "
                + secondLargest(numbers));

        // close Scanner
        sc.close();
    }
}
