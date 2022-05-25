import java.util.Scanner;

public class ArrayMaxJump {

    /**
     * method to get similar pairs by using given conditions
     * Condition : 1 - arr[j] > arr[i]
     *      Condition : 2 - arr[j] - arr[i] >= k (user defined value)
     * @param arr
     */
    private static void getDifferenceCount(int[] arr, int maxValue) {
        int max = 0, value = 0, key = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] - arr[i] >= maxValue) {
                    if (max < (arr[j] - arr[i])) {
                        max = arr[j] - arr[i];
                        key = arr[j];
                        value = arr[i];
                    }
                }
            }
        }
        System.out.println("The max difference is : " + max + "\n" + "The pair is : (" + value + "," + key + ")");
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of elements to be added :");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements to be added :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the maximum value of a pair : ");
            int maxValue = sc.nextInt();
            getDifferenceCount(arr, maxValue);
        }
    }
}