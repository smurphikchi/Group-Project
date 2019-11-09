package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysZombie {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] inhabitants= new int[8];
        for (int i = 0; i<inhabitants.length;i++){
            inhabitants[i]=input.nextInt();
        }
        boolean check = true;

        int j = 0;
        while (check) {

            int[] arrayCopy = inhabitants;
            if (inhabitants[0] == 0) {
                arrayCopy[1] = inhabitants[1] / 2;
            }
            for (int i = 0; i < inhabitants.length - 1; i++) {

                if (inhabitants[i] == 0) {
                    arrayCopy[i - 1] = inhabitants[i - 1] / 2;
                    arrayCopy[i + 1] = inhabitants[i + 1] / 2;
                }
            }
            if (inhabitants[inhabitants.length - 1] == 0) {
                arrayCopy[inhabitants.length - 1] = inhabitants[inhabitants.length - 1] / 2;
            }
            inhabitants = arrayCopy;
            System.out.println("Day " + j+Arrays.toString(inhabitants));

            //inhabitants = arrayCopy;
           // System.out.println(Arrays.toString(inhabitants));

            j++;

            int counter = 0;
            for (int element : inhabitants) {
                counter = counter + element;
            }if (counter == 0) {
                check = false;
            }
        }
    }
}
//    An array inhabitants represents cities
//    and their respective populations.
//    For example, the following arrays shows
//    8 cities and their respective populations:
//        [3, 6, 0, 4, 3, 2, 7, 1]
//        Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. After each day, every city will lose half of its population.
//        write a program to loop though each city population and make it lose half of its population until all cities have no humans left.
//        Make updates to each element in the array And print the array like below for each day: