
import java.util.Arrays;
 
/*
Replace every array element with the product of every other element 
without using a division operator
Given an integer array, replace each element with the product of 
every other element without using the division operator.

For example,

Input:  { 1, 2, 3, 4, 5 }
Output: { 120, 60, 40, 30, 24 }
 
 
Input:  { 5, 3, 4, 2, 6, 8 }
Output: { 1152, 1920, 1440, 2880, 960, 720 }
*/

class Product_Array
{
    public static int findProduct(int[] A, int n, int left, int i)
    {
        // base case: no elements left on the right
        if (i == n) {
            return 1;
        }

        int curr = A[i];

        int right = findProduct(A, n, left * A[i], i + 1);

        A[i] = left * right;

        return curr * right;
    }
 
    public static void main(String[] args)
    {
        int[] A = { 5, 3, 4, 2, 6, 8 };
 
        findProduct(A, A.length, 1, 0);
 
        System.out.println(Arrays.toString(A));
    }
}
