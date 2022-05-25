import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ArrayIndexCombination {

    /**
     * method to return default index combination without swapping index value
     * @param a array[]
     * @param b array[]
     * @return count
     */
    private static int defaultCombination(int[] a, int[] b){
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                result = result + (a[i] * b[j] * (i + j));
            }
        }
        return result;
    }

    /**
     * method to return default combination after swapping index value
     * @param a array[]
     * @param b array[]
     * @param type1
     * @return count
     */
    public static int defaultCombination(int[] a, int[] b, int @NotNull [] type1) {
        int result;
        if (type1[0] == 1) {
            result = 0;
            int[] result1 = new int[a.length];
            Arrays.setAll(result1, i -> a[i]);
            int temp1 = type1[1];
            int temp2 = type1[2];
            result1[temp1] = b[temp2];
            b[temp2] = a[temp1];

            for (int i = 0; i < result1.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    result = result + (result1[i] * b[j] * (i + j));
                }
            }
        }
        else if(type1[1] == 2){
            result = 0;
            int[] result1 = new int[a.length];
            Arrays.setAll(result1, i -> a[i]);
            int temp1 = type1[1];
            int temp2 = type1[2];
            a[temp1] = a[temp2];
            a[temp2] = result1[temp1];
            for (int i = 0; i < result1.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    result = result + (result1[i] * b[j] * (i + j));
                }
            }
        }
        else{
            result = 0;
            int[] result1 = new int[b.length];
            Arrays.setAll(result1, i -> b[i]);
            int temp1 = type1[1];
            int temp2 = type1[2];
            b[temp1] = b[temp2];
            b[temp2] = result1[temp1];
            for (int i = 0; i < result1.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    result = result + (result1[i] * b[j] * (i + j));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String result;
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{7, 6};
        int[] type1 = new int[]{1,2,1};
        result = defaultCombination(a,b)+","+defaultCombination(a,b,type1);
        System.out.println(result);
    }
}
