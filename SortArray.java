import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};

        Arrays.sort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}