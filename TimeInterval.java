import java.util.Arrays;
import java.util.Scanner;

//----------------------------Problem of non-Primitive type Array------------------
/* GLA University there is various department. It is asked to every dept to conduct meeting for all the employees of 
 GLA University. The central Management asked the dept kindly share starting time and ending time of the meeting in 
 24 hours format so that after verifying it will be circulated among the GLA employees.
 But there is a problem that before circulating the meeting information, the central management will find out if there  
 are any clashes between time or not. If there are clashes it means the employee cannot attend all the meetings. 
 Can you help central management to find it out  
 */
public class TimeInterval {
    //---------Declaring variable
    int start;
    int end;
    //---------parameterised constructor 
    TimeInterval(int start, int end)
    {
        this.start = start;
        this.end = end;
    }
    //---------Method for implementing the logic
    public static boolean canAttendMeeting(TimeInterval ar[])
    {
        //--------Declaring 2 local array of type integer for storing stating and end time of the meeting
        int start[] = new int[ar.length];
        int end[] = new int[ar.length];
        for (int i=0;i<ar.length; i++)
        {
            start[i] = ar[i].start;
            end[i] = ar[i].end;
        }
        //---------Sorting the Array for checking the clashes on meeting ,for this we are comparing 
        //---------the end timing of first meeting with the starting timing of second meeting
        Arrays.sort(start);
        Arrays.sort(end);
        for (int i=0; i<ar.length-1; i++)
        {
            if(start[i+1]<=end[i])
            {
                return false;
            }
        }
        return true;
    }
}
//-----------Execution Class
class timeintervaltest
{
    public static void main(String[] args) {
        //--------for user input creating the object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Meeting:");
        //--------taking the number of meetings from the user
        int n = sc.nextInt();
        //--------creating non-primitive type array
        TimeInterval ar[] = new TimeInterval[n];
        System.out.println("Enter the Starting and End Time of Meetings:");
        //-------getting the input from the user
        for (int i=0; i<ar.length; i++)
        {
            ar[i] = new TimeInterval(sc.nextInt(), sc.nextInt());
        }
        boolean res = TimeInterval.canAttendMeeting(ar);
        if(res ==false)
        {
            System.out.println("Clashes are There in the Schedule of meetings.");
        }
        else
        {
            System.out.println("No Clashes in the Timing of meetings.");
            System.out.println("Starting Time of Meetings:         End Time of Meetings:");
            for (int i=0; i<ar.length; i++) 
            {
                System.out.println(ar[i].start+"                                  "+ar[i].end);
            }
        }
    }
}
