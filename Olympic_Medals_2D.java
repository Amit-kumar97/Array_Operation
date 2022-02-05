import java.util.Scanner;

/*
The Olympic results are given in a table, where each row represents a country, and
columns represent gold, silver, and bronze medals.
For example, the element r[0][0] is the number of gold medals earned by the 0-th country.
Write a method that takes the table as an input, and returns a new array which lists
the total number of medals for each country. For example, if we start with the table
     2   0   1
     3   2   0
     0   0   2
in which the 0-th country earned 2 + 0 + 1 = 3 medals,
the 1-st country earned 3 + 2 + 0 = 5 medals,
and the 2nd country earned 0 + 0 + 2 = 2 medals,
your method should return an array with values
   3
   5
   2
 */
//--------main class
public class Olympic_Medals_2D {
    //------------variable(Size) and Array declaration
    int ar[][];
    int m;                             //----------Represent Number of country
    int n;                             //----------Represent Number, i.e. types of medals
    //----------Constructor
    Olympic_Medals_2D()
    {
        //-----------FOR USER INPUT
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter Number of Country:");
        m = sc.nextInt();
        System.err.println("Enter Number of, Types of Medals:");
        n = sc.nextInt();
        ar = new int[m][n];                          //------------ARRAY CREATION
        System.err.println("Enter the Medals:");
        for (int i=0; i<m; i++)
        {
            for (int j=0; j< ar[i].length; j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }
        //-----------------PRINTING ALL MEDALS
        System.err.println("Medals Distribution of Countries in 2D Representation as Gold, Silver and Bronze:");
        for (int i=0; i<m; i++)
         {
            for (int j=0; j<ar[i].length; j++)
            {
                System.err.print(ar[i][j]+" ");
            }
            System.err.println();
        }
    }
    //------------METHOD FOR CALCULATING SUM OF MEDALS COUNTRYWISE 
    public void total_countrywise_Medals()
    {
        int arnew[] = new int[m];                          //-------------LOCAL ARRAY FOR STORING SUM OF CORRESPONDING COUNTRY
        int sum = 0;                                      //--------------LOCAL VARIABLE FOR CALCULATING SUN
        for (int i=0; i<m; i++)
        {
            for (int j=0; j<ar[i].length; j++)
            {
                sum += ar[i][j];
            }
            arnew[i] = sum;                                //-------------STORING SUM INTO LOCAL ARRAY
            sum = 0;               //-------------AGAIN INITIALISES WITH 0 SO THAT NEXT MEDALS SUM WILL BE STORED AT NEXT COUNTYR LOCATION
        }
        System.err.println("Total Number of Medals countrywise:");
        for (int res:arnew) {
            System.err.println(res);                          //------------PRINTING SUM
        }
    }
}
//--------------EXECUTION CLASS
class olympicmedalstest
{
    public static void main(String[] args) {
        Olympic_Medals_2D obj = new Olympic_Medals_2D();
        obj.total_countrywise_Medals();                       //-------------CALLING METHOD
    }
}
