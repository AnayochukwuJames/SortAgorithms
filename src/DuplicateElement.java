public class DuplicateElement {
    public static void main(String[] args) {
        String arr[] = {"James", "John", "peter", "Moses", "Micheal", "John", "Peter"};

        boolean str = false;
        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if (arr[j] == arr[i]){
                    System.out.println(arr[i]);
                    str = true;
                }
            }
        }
        if (str == false){
            System.out.println("No duplicate found");
        }
    }
}
