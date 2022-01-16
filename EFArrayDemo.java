import java.lang.module.FindException;
import java.util.Scanner;

//  =>DSA: 12-01-2022 Example of Array With Different Operations
public class EFArrayDemo {
    int[] ar;
    // constructor
    EFArrayDemo()
    {
        Scanner s  = new Scanner(System.in);
        int size = s.nextInt();
        ar = new int[size];
        System.out.println("Enter the values");
        for (int i=0; i<ar.length; i++)
        {
            ar[i] = s.nextInt();
        }
    }
    // method for traverse the array
    public void traverse()
    {
        for (int i=0; i<ar.length; i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    // method for insert the value with index
    public  void insert(int index, int value) throws ArrayIndexOutOfBoundsException
    {
        ar[index] = value;
        for (int res:ar)
        {
            System.out.print(res+" ");
        }
    }
    //method to print the specific value from the array
    public void getvalue(int index) throws  ArrayIndexOutOfBoundsException
    {
        System.out.println(ar[index]);
    }
    // method for searching a value
    public void search(int value)
    {
        for(int i=0; i<ar.length; i++)
        {
            if (ar[i]==value) {
                System.out.println("Value found");
                return;
            }
        }
        System.out.println("Value not found");
    }
    // method to delete the value from the array
    public void deletevalue(int value)
    {
        for (int i=0; i<ar.length; i++)
        {
            if (ar[i]==value)
            {
                ar[i] = Integer.MIN_VALUE;
                System.out.println("Value is Deleted with Integer's Minimum Value");
                for(int res:ar) {
                    System.out.print(res+" ");
                }
                return;
            }
        }
        System.out.println("Value not found in Array");
    }
    // Method to delete the value through index
    public void delete(int index) throws ArrayIndexOutOfBoundsException
    {
        ar[index]=Integer.MIN_VALUE;
        System.out.println("Value is Deleted with Integer's Minimum Value");
        for (int res:ar) {
            System.out.println(res);
        }
    }
    // method for deleting whole array
    public void deletearray()
    {
        ar=null;                                                  // array are considerded as reference data type
        for (int res:ar) {
            System.out.print(res+" ");
        }
    }
}
//execution class
class EFTest
{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Size of Array.");
        EFArrayDemo obj = new EFArrayDemo();
        System.out.println("Operation performed on the Array:\n1- For 'Traverse' the Array.\n2- For 'Insert' with index and Value.\n3- For 'GetValue' wih Index.\n4- For 'Searching' the value.\n5- For deleting the value with 'Value'.\n6- For Deleting the value with 'Index'\n7- For Deleting Complete Array.");
        System.out.println("Enter the Suitable NUmber to perform Suitable Operation on Array.");
        int n = sc.nextInt();
        try
        {
            switch (n)
            {
                case 1:
                    obj.traverse();
                    break;
                case 2:
                    System.out.println("Enter the Index and Value to insert in array");
                    int index = sc.nextInt();
                    int value = sc.nextInt();
                    obj.insert(index, value);
                    break;
                case 3:
                    System.out.println("Enter the Index for Getting the value");
                    int index1 = sc.nextInt();
                    obj.getvalue(index1);
                    break;
                case 4:
                    System.out.println("Enter the Value for searching in the Array");
                    int val = sc.nextInt();
                    obj.search(val);
                    break;
                case 5:
                    System.out.println("Enter the Value for deleting from Array");
                    int value1 = sc.nextInt();
                    obj.deletevalue(value1);
                    break;
                case 6:
                    System.out.println("Enter the Index for deleting from Array");
                    int indx = sc.nextInt();
                    obj.delete(indx);
                case 7:
                    obj.deletearray();
            }
        }
        catch (ArrayIndexOutOfBoundsException cj)
        {
            System.out.println("Invalid Index");
        }
        catch (NullPointerException jj)
        {
            System.out.println("Null Array");
        }
    }
}
