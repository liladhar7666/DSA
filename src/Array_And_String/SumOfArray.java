package Array_And_String;

public class SumOfArray {
    public static void main(String[] args) {

        int arr[] = {10, 29, 43, 22, 50,80};

        int sum = 0;

//        for(int i = 0; i < arr.length ;i++){
//              sum += arr[i];
//        }

//        for(int i = 0; i < arr.length ;i+=2){
//              sum += arr[i];
//        }
//
        for(int i = 0; i < arr.length ;i++){
              if(i % 2 == 0){
                  sum += arr[i];
              }
        }
        System.out.println(sum);
    }
}
