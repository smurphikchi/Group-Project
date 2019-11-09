package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;
public class BookReplace {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String [] books = new String[5];
        books[0]="To the moon and back";
        books[1]="The Great Gatsby";
        books[2]="Tree growth in Brooklyn";
        books[3]="The girl on the train";
        books[4]="SMartest guys on earth";
        System.out.println("do you want to replace any book? ");
        String look=input.nextLine();
        int index = Arrays.binarySearch(books,look);


        if (index>=0) {
            System.out.println("What book you want to replace " + look + " with ");
            String answer = input.nextLine();
            books[index] = answer;
        }else {
            System.out.println("the book is not found");

        }System.out.println(Arrays.toString(books));





       // System.out.println(Arrays.toString(books));



    }


}
