package loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//
//        for (int i = 0; i <15; i++){
//            System.out.println("welcome "+ name);
//        }
//        for (int i =0; i<name.length(); i++){
//            System.out.println(name.charAt(i)+ " of index"+ i);
//        }
//       // int num = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            System.out.println();

              if  (i % 2 ==0){

                System.out.println(i +" even") ;
            }
        }




    }
}
