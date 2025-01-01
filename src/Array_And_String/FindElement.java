package Array_And_String;

public class FindElement {
    public static void main(String[] args) {

//      int arr[] = new int[5];

//      arr[0] = 4;
//      arr[1] = 5;
//
//        System.out.println(arr[6]);
////
//        String S = "anjali" ;
//        String M = new String("anjali");
//        System.out.println(S.charAt(2));


//        for(int i = 0; i < S.length();i++){
////            arr[i] = i;
//
//            System.out.print(S.charAt(i));
//
//        }

//        String S = new String("ashwini");
//        System.out.println(S.hashCode());
//
//        String concat = S.concat("meshram");
//        System.out.println(concat.hashCode());
//
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int array = findArrayLength(arr);
        System.out.println(array);

    }
    public static  int findArrayLength(int arr[]){
        return arr.length;
    }

//    public static  int findArrayLength(int arr[]){
//        int count = 0;
//           for(int i = 0; i<arr.length;i++){
//               count++;
//           }
//           return count;
//    }

}
                               