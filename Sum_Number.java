import java.util.Scanner;

public class Sum_Numbers {

    //-----------Returns sum of all digits in numbers from 1 to n
    //-----------method 1 , time complexity=O(n)
    static int sumOfDigitsFrom1ToN(int n)
    {
        int result = 0;                    //---------initialize result

        //----------One by one compute sum of digits in every number from 1 to n
        for (int x = 1; x <= n; x++)
            result += sumOfDigits(x);

        return result;
    }

    //----------A utility function to compute sum of digits in a given number x
    //---------method 2, time complexity=O(1)
    static int sumOfDigits(int x)
    {
        //--------utilising a formula
        int sum = 0;
        while (x != 0)
        {
            sum += x % 10;
            x   = x / 10;
        }
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(Ststem.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        System.out.println("Sum of digits in numbers"+" from 1 to " + n + " is "+ sumOfDigitsFrom1ToN(n));
    }
}
