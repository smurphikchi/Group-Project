package loop;

import java.util.Scanner;

public class ReverseTask {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
      String given = input.nextLine();
      String rev = "";


      for ( int i =given.length()-1; i>=0 ; i--) {
          rev += given.charAt(i);
      }
          System.out.println(rev.toUpperCase());

      int give = input.nextInt();
      int i =1;


      while(i<=give){

          System.out.println(i++);


      }


    }
}
