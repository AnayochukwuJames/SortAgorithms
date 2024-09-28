public class Main {
    public static void main(String[]arg){

        int arr[] = {5,4,7,3,8,2};

        int temp = 0;
        for (int i = 0; i< arr.length; i++){
            for (int j = i+1; j< arr.length; j++){
                if (arr[j] < arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
