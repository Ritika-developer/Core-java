public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8}; // Missing number is 5
        int n = arr.length + 1; // Since one number is missing, total numbers should be n+1

        int total = (n * (n + 1)) / 2; // Sum of first n natural numbers
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        int missing = total - sum;
        System.out.println("Missing number is: " + missing);
    }
}
