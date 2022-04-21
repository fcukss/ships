package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10}; //, 50402, -50, 249, 10215, 665, 2295, 7, 311};
      int lent = numbers.length-1;
        System.out.println(recursionSum(numbers, lent));
    }

    public static int recursionSum(int numbers[], int i) {

       if (i == 0) {
      //  if ( i == numbers.length){
          //  return 0;
             return numbers[0];
        } else {
            return numbers[i] + recursionSum(numbers,i -1);
        }
    }
}
