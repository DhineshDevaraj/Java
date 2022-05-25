import java.util.*;

public class MaxSubArray {

    private static int[] printPairs(int[] arr,ArrayList newList) {
        System.out.println("The sub array who's sum value is a perfect square number is : ");
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (newList.contains(arr[i] + arr[j])) {
                    if ((arr[i] + arr[j]) > temp) {
                        temp = (arr[i] + arr[j]);
                        System.out.println("(" + arr[i] + ", " + arr[j] + ")" + " and the value is : " + temp);
                    }
                }
            }
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of elements to be added which should have more than 2:");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n < 2) {
                System.out.println("Array Length should be greater than 2 : ");
            }
            int[] arr = new int[n];
            System.out.println("Enter the elements to be added :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> newList = new ArrayList<Integer>();
            for(int i = 1 ; i < 1000;i++){
                newList.add(i*i);
            }
            printPairs(arr,newList);
        }
    }
}
