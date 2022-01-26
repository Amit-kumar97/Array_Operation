import java.util.Scanner;

public class SumRowsColumn {

  //---------- main method
  public static void main(String[] args) {

    //--------- declare variables
    int row = 0;
    int column = 0;
    int a[][] = null;                     //------------- matrix
    
    //-------------------- create Scanner class object to read input
    Scanner scan = new Scanner(System.in);

    //----------------- ask row and column size
    System.out.println("Enter row and column size: ");
    row = scan.nextInt();
    column = scan.nextInt();

    //--------------- initialize matrices
    a = new int[row][column];

    // -----------------read matrix A
    System.out.println("Enter Matrix: ");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        a[i][j] = scan.nextInt();
      }
    }

    //---------------- variables
    int rowsum;
    int columnsum;

    // -----------------find row sum and column sum
    for (int i = 0; i < 3; i++) {

      rowsum = 0;
      columnsum = 0;

      for (int j = 0; j < 3; j++) {
        rowsum += a[i][j];
        columnsum += a[j][i];
      }

      System.out.println("Row-" + (i + 1) + " sum = " + rowsum);
      System.out.println("Column-" + (i + 1) + " sum = " + columnsum);
    }
    scan.close();                             //------------- close Scanner
  }
}
