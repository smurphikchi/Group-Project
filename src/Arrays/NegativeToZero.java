package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class NegativeToZero {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int [] numbers = {4,-2,-6,5,67,-20};

        for (int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                numbers[i]=0;

            }
        }System.out.println(Arrays.toString(numbers));

    }
}
