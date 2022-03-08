public class Leaders_inArray {

    static void leaders_Array(int arr[], int n) {

        // Time Complexity - O(n^2)
        for (int i = 0; i < n; i++) {
            int j;

            for (j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    break;
                }
            }
            if (j == n) {
                System.out.println(arr[j - 1] + " ");
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 14, 12, 70, 15, 99, 65, 21, 190 };
        leaders_Array(arr, arr.length);
    }
}
