import java.util.Arrays;

public class Passingfunction {
    public static void main(String[] args) {
    int [] nums = {5, 4, 6, 8, 9,};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr) {
        arr[0] = 99;
    }


}
