package ArrayLists;


//----------Given an integer array, print all subarrays with zero-sum.
/*
A naive solution is to consider all subarrays and find their sum. If the subarray sum is equal to 0, print it.
The time complexity of the naive solution is O(n3) as there are n2 subarrays in an array of size n, and it takes O(n)
time to find the sum of its elements. We can optimize the method to run in O(n2) time by calculating the subarray
sum in constant time.
 */
//--------he problem deals with subarrays that are contiguous,
// -------i.e., whose elements occupy consecutive positions in the array.
public class SumZeroes {

    //----------Function to print all subarrays with a zero-sum in a given array
    public static void printAllSubarrays(int[] nums)
    {
        //------consider all subarrays starting from `i`
        for (int i = 0; i < nums.length; i++)
        {
            int sum = 0;

            //---------consider all subarrays ending at `j`
            for (int j = i; j < nums.length; j++)
            {
                //----------sum of elements so far
                sum += nums[j];

                //----------if the sum is seen before, we have found a subarray with zero-sum
                if (sum == 0) {
                    System.out.println("Subarray [" + i + "-" + j + "]");
                }
            }
        }
    }

    public static void main (String[] args)
    {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        printAllSubarrays(nums);
    }
}
