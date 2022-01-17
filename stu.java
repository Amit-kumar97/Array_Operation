import java.util.Scanner;

// Concept of Non-primitive type Array
// Problem of calculating the Average of Students Marks
public class stu {
    private int rollno;
    private int marks;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the No. of student:");
        int n = s.nextInt();
        stu arr[] = new stu[n];
        System.out.println("Enter the detail of students with Name, ROll no and Marks:");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = new stu();
            arr[i].name = s.next();
            arr[i].rollno = s.nextInt();
            arr[i].marks = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i].marks + sum;
        }
        int avg = sum/ arr.length;
        System.out.println("Average Marks of Students:"+avg);
    }
}
