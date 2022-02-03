public class Seperate_Odd_Even {

    public static void main(String[] args) {

        int arr[]={12, 17, 70, 15, 22, 65, 21, 90};
        System.out.println("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arr=separateEvenOddNumbers(arr);
        System.out.println("Array after separating even and odd numbers : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] separateEvenOddNumbers(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        for (int i = 0; i < arr.length; i++) {

            while(arr[left]%2==0)
            {
                left++;
            }
            while(arr[right]%2==1)
            {
                right--;
            }

            if(left<right)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        return arr;
    }
}
