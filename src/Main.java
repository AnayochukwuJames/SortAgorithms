public class Main {
    public static void main(String[] args) {
        int arr[] = {5,4,7,2,8,1,3};

        System.out.print("Original Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        int temp =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.print("\nSorted Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
