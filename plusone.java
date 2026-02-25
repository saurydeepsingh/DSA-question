import java.util.Arrays;

class PlusOne {
    public static int[] plusOne(int digits[]) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        // If all digits were 9
        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5};

        int result[] = plusOne(arr);

        System.out.println(Arrays.toString(result));
    }
}