//print array and find the sum of that array

public class Main {
    public static void main(String[] args) {
        int sum = 0;
         int arr[] =  {3,5,6,8,9,10};

         for(int i=0; i<arr.length; i++){
             System.out.println(arr[i]);
             sum= sum+arr[i];
         }
        System.out.println("sum= "+sum);

        }
    }
