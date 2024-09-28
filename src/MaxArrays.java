public class MaxArrays {
    public static void main(String[] args) {
        int arr[] = {50,20,40,30,60,80,76};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
