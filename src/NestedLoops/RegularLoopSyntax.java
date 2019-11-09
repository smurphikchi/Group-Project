package NestedLoops;

import java.util.Scanner;

public class RegularLoopSyntax {
    public static void main(String[]args){




        for (int i = 0 ;i<5; i++){
            System.out.println("i is "+i);
            for (int j = 0;j<6; j++){
                System.out.println("j is "+j);
            }
            System.out.println();
        }


        for (int i=0; i<5; i++){
            int run=3;
            while(run!=0){
                System.out.println(run--);
            }
            System.out.println();
        }

        Scanner input = new Scanner(System.in);

        int num=input.nextInt();


        for (int i = 1; i<=num;i++){
            for (int j=1; j<=num; j++){
                System.out.print("# ");
            }
            System.out.println();
        }


        int am = 5;
        for (int i = 0; i<am; i++){
            for (int j = 0; j<am-i; j++){
                System.out.print(" ");
                for (int k = 0; k<(2*i+1);k++){
                    System.out.print("*");
                }
            }System.out.println();
        }

       // int b =input.nextInt();

        for (int i = 1; i<=10; i++) {

            for (int j = 1; j <= 10; j++) {


                System.out.println(i + " x " + j + " = " + (i * j));


            }
            System.out.println();
        }







    }
}
