package IfElsestatements;

import java.util.Scanner;

public class Statement5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        int evens = 0;
        int odds = 0;
        if (num1 % 2 == 0){
            evens++;
        }
        else if (num1 % 1 == 1){
            odds++;
        }
        else if (num2 % 2 ==0){
            evens++;
        }
        else if (num2 % 1 ==1) {
            odds++;
        }
        else if (num3 % 2 ==0) {
            evens++;
        }
        else if ( num3 % 1 == 1 ){
            odds++;
        }
        else if (num4 % 2 == 0) {
            evens++;
        }
        else if  (num4 %1 ==1){
            odds++;
        }
        else if (num5 % 2 == 0){
            evens++;
        }
        else if (num5 % 1 == 1){
            odds++;
        }
         System.out.println(evens);
        System.out.println(odds);

    }
}
