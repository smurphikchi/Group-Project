package loop;

public class Patterns {
    public static void main(String[] args){
        String s ="*";


       // for (int i = 1; i <=8; i++){
           // System.out.println(s);
           // s=s+"*";
        //}
       // for (int i=-9; i <=8; i--){
          //  System.out.println(s);

       // }


       // String star = "*";

        for (int i= 0; i < 7; i++) {
            for (int space= 0; space < 6 - i; space++)
                System.out.print(" ");
            for (int star = 0; star < (2 * i +1); star++)
                System.out.print("*");
            System.out.println();

       }

     for (int i = 6; i >=0; i--) {
         for (int j = 0; j < 7- i; j++)
             System.out.print(" ");
          for (int k = 0; k < 2 * (i - 1); k++)
                System.out.print("*");
            System.out.println();
 }







     for (int i = 0; i <4; i++){
         for (int j = 0; j<3-i;j++)
             System.out.print(" ");
             for (int k = 0; k< (2*i+1); k++)
                 System.out.print("*");
                 System.out.println();
             }
        for (int i=3; i>0; i--) {
            for (int j = 0; j < 4 - i; j++)
                System.out.print(" ");
            for (int k = 0; k <= 2 * (i - 1); k++)
                System.out.print("*");
            System.out.println();
     }







        for (int i= 0; i < 8; i++) {
            for (int space= 0; space < 8 - i; space++)
                System.out.print(" ");
            for (int star = 0; star < (2 * i +1); star++)
                System.out.print("*");
            System.out.println();

        }

        for (int i = 7; i >=0; i--) {
            for (int j = 0; j < 8- i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i <4; i++){
            for (int j = 0; j<3-i;j++)
                System.out.print(" ");
            for (int k = 0; k< (2*i+1); k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i=3; i>0; i--) {
            for (int j = 0; j < 4 - i; j++)
                System.out.print(" ");
            for (int k = 0; k <= 2 * (i - 1); k++)
                System.out.print("*");
            System.out.println();
        }




         }
     }


