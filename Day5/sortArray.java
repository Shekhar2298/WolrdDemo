import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 2, 2, 1};

        Arrays.sort(arr);

        int[] count = new int[3];
        for (int num : arr) {
            count[num]++;
        }

        int index = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
