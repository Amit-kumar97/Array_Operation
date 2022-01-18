import java.util.Scanner;
// Done... uploaded to git...✔

/* Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements greater than or equal to it in array myarr2[].
Example:
Imagine the size of both the arrays are 5 
myarr1[]  values  {3,4,1,2,2}
myarr2[] values  {1,2,1,3,1}
Output :
1,0,5,2,2   */
public class RamansArray {
    //------variable declaration
    int size1, size2;
    int[] myar1, myar2;
    //-----constructor
    RamansArray()
    {
        //-------- For user Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of first Array:");
        size1 = sc.nextInt();
        System.out.println("Enter the Size of Second Array:");
        size2 = sc.nextInt();
        myar1 = new int[size1];
        myar2 = new int[size2];
        System.out.println("Enter the Elements of first Array:");
        for (int i = 0; i<myar1.length ; i++) {
            myar1[i] = sc.nextInt();
        }
        System.out.println("Enter the Elements of Second Array:");
        for (int j = 0; j<myar2.length ; j++) {
            myar2[j] = sc.nextInt();
        }
    }
    // ------- method here for implementing logic
    public void countduplicate()
    {
        // -----1st loop for traversing each element of 1st array with the each other element of 2nd Array
        // -----2nd loop for second Array
        for (int i = 0; i < myar1.length ; i++) {
            int c = 0;        //----------Temporary variable for counting the greatest or equal values for each element in another array
            for (int j = 0; j < myar2.length; j++) {
                if(myar1[i]<=myar2[j])
                {
                    c++;
                }
                else {}
            }
            if(i<myar1.length-1)
            {
                System.out.print(c+",");
            }
            else
            {
                System.out.print(c);
            }
        }
      //  return myar1.length;    ----------- optional ,it is used when if we are using method with return type statement
    }
}
// Execution class
class RamansTest
{
    public static void main(String[] args) {
        RamansArray obj = new RamansArray();           // -------creating constructor
        obj.countduplicate();                       // ----calling method
    }
}
