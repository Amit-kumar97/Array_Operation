import java.util.ArrayList;

// Delete element and after that shift element
public class EFTest2 {
    public static void main(String[] args) {
      // Concept of Arraylist
//        ArrayList<Integer> i = new ArrayList<>();
//        i.add(20);
//        i.add(10);
//        i.add(30);
//        i.add(40);
//        i.add(1,242);   // shifting the values
//        i.remove(0);       // shifting the values
//        System.out.println(i);
        int ar[] = {10,20,30,40,50};
        int index = 1;
        int i = 0;
        for (i=index; i< ar.length-1; i++)
        {
            ar[i] = ar[i+1];
        }
        ar[ar.length-1] =0;
        System.out.println("Shifted order of Array:");
        for (int j=0; j< ar.length; j++)
        {
            System.out.print(ar[j]+" ");
        }
    }
}
