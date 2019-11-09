package LoopTasks;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();

        for (int i =0; i<50; i++){
            if (i%2!=0){
                System.out.println(i);
            }else{
                System.out.println("Even number here");
            }
        }
        String name;
        for (int i = 0; i<5; i++) {
            System.out.println("Enter name " + (i + 1));
            name = sc.nextLine();
            System.out.println(name);
        }

    }
}
