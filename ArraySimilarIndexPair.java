import java.util.Scanner;

public class ArraySimilarIndexPair {

    /**
     * method to get similar pairs by using given conditions
     * Condition : 1 - arr[j] > arr[i]
     *      Condition : 2 - arr[i] == arr[j] + 1 or arr[j] = arr[i] + 1
     * @param arr
     */
    private static void getIndexValue(int[] arr){
        int count = 0,keys=0,value=0;
        System.out.println("The number of pair with similar index is : ");
        for(int i =0;i<arr.length;i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    if (arr[i] == (arr[j] + 1) || arr[j] == (arr[i] + 1)) {
                        keys = arr[i];
                        value = arr[j];
                        System.out.print("("+keys+","+value+")"+"\t");
                        count++;
                    }
                }
            }
        }
        System.out.println("\nThe total number of pair is : "+count);
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
            getIndexValue(arr);
        }
    }
}
