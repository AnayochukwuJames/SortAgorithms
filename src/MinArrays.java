public class MinArrays {
public static void main(String[]args){
    int arr[] = {24,87,89,63,61,14,18,4899};

    int min = arr[0];
    for (int i = 1; i< arr.length; i++){
        if(arr[i]< min){
            min = arr[i];
        }
    }
    System.out.print(min);
}
}
