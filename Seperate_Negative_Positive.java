import java.util.Arrays;

public class Seperate_Negative_Positive {
    
    public static void partition(int[] a)
    {
        int pIndex = 0;

        // each time we find a negative number, `pIndex` is incremented,
        // and that element would be placed before the pivot
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0)    // pivot is 0
            {
                swap(a, i, pIndex);
                pIndex++;
            }
        }
    }

    private static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args)
    {
        int[] a = { 9, -3, 5, -2, -8, -6, 1, 3 };

        partition(a);
        System.out.println(Arrays.toString(a));
    }
}
