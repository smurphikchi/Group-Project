package Arrays;
import java.util.Arrays;
public class SmallAndBiggestNumbers {
    public static void main(String[] args) {
        int[] numbers = {31, 20, 25, 20, 3, 48, 26, 12};
        Arrays.sort(numbers);
        int smallest = numbers[0];
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest)
                largest = numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];

        }System.out.println(smallest+" , " +largest);

        int [ ] nums = {23, 1, 34, 3, 54, 54, 51};
        int large =nums[0];

        for (int i = 1; i<nums.length; i++){

            if(nums[i]>large){
                large=nums[i];
                System.out.println(nums[i-1]);

            }else if(nums[i]<large);
        }System.out.println(large);









    }






}







//3) Given an array with the value of: 31, 20, 25, 20, 3, 48, 26, 12
//        Print out the biggest and smallest values in the array
//        4) Given an array of values: 23, 1, 34, 3, 54, 54, 51
//        Print the biggest two values. Only Unique values
//        > The result here should be:
//        54
//        51
//        Collapse




