package Array_And_String;

public class FindOutElement {
    public static void main(String[] args) {

        int numbers[] = {10, 20 , 30, 40, 50};
        int target = 30;

       for(int i = 0; i < numbers.length ; i++){
           if(numbers[i] == target){
               System.out.println("target"+target);
           }
       }
    }
}
