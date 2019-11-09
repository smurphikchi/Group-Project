package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class InhabitantsProject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 1; i < inhabitants.length; i++) {

            // for(int i = 1; i < inhabitants.length; i++)
            if (inhabitants[i] > 0 && inhabitants[i - 1] == 0)
                inhabitants[i] /= -2;

            for (int j = inhabitants.length - 2; j >= 0; j--) {
                if (inhabitants[j] < 0)
                    inhabitants[i] = -inhabitants[i];
                else if (inhabitants[i] > 0 && inhabitants[i + 1] == 0)
                    inhabitants[i] /= 2;
            }
        }
       // Scanner input = new Scanner(System.in);
        int[] inhabitant = new int[8];
        for(int i=0; i<inhabitant.length; i++) {
            inhabitant[i] = input.nextInt();
        }

        // Take every number from array and divide by 2 and store same index

        //TODO. Write you code below this line.


        int day =0;
        int sumOfppl=0;

        System.out.println("Day "+day+" "+Arrays.toString(inhabitant));

        do{
            day++;
            sumOfppl=0;

            for(int i=0; i<inhabitant.length; i++){

                inhabitant[i]= inhabitant[i]/2;
                sumOfppl+=inhabitant[i];

            }

            System.out.println("Day "+day+" "+Arrays.toString(inhabitant));

        }while(sumOfppl!=0);

        System.out.println("---- EXTINCT ----");



    }
}





//
//        for (int i = 0; i < inhabitants.length; i++) {
//
//           inhabitants[i] = input.nextInt();
//        }for (int i = 1; i <inhabitants.length; i++){
//
//            if (inhabitants[i] > 0 && inhabitants[i - 1] == 0)
//                inhabitants[i] /= -2;
//
//            for (int j = inhabitants.length - 2; j >= 0; j--) {
//
//                if (inhabitants[j] < 0) {
//                    inhabitants[j] = -inhabitants[j];
//
//                } else if (inhabitants[j] > 0 && inhabitants[j + 1] == 0) {
//                    inhabitants[j] /= 2;
//                }
//            }
//
//
//            System.out.println("Day " + counter + " " + Arrays.toString(inhabitants));
//
//        }
//







//
//    int days = 0;
//    int index = 0;
//       System.out.println("Day" + " " + days + " " + Arrays.toString(inhabitants));
//               while (index<9) {
//        for (int i = 0; i < inhabitants.length; i++) {
//        inhabitants[i] = inhabitants[i] / 2;
//        }
//        days++;
//        System.out.println("Day" + " " + days + " " + Arrays.toString(inhabitants));
//        index=1;
//        for (int j=0; j<inhabitants.length; j++) {
//        if (inhabitants[j]==0) {
//        index++;
//        }
//        }
//        }