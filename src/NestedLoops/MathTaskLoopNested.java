package NestedLoops;

import java.util.Scanner;

public class MathTaskLoopNested {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int num2 = input.nextInt();
        int result=0;

        for (int i=num; i <=num2; i++){
            result +=i;



        }System.out.println("the sum of "+num+" "+num2+" = "+result);

    }

}
