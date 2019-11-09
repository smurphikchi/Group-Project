package Methods;
import java.util.Arrays;
public class SplitTask {
    public static void main(String[] args){
        String str = "this is given word amd this is thebiggestword";
        String [] arr=str.split(" ");
        int longer=0;

for (String word1:arr){
    if(word1.length()>longer){
        longer =word1.length();


    }
}for (String word1:arr){
    if (word1.length()==longer){
        System.out.println(word1);
    }
        }
//    if (numbers[i] > largest)
//        largest = numbers[i];
//    else if (numbers[i] < smallest)
//        smallest = numbers[i];
//
//}System.out.println(smallest+" , " +largest);
//
//        int [ ] nums = {23, 1, 34, 3, 54, 54, 51};
//        int large =nums[0];
//
//        for (int i = 1; i<nums.length; i++){
//
//            if(nums[i]>large){
//                large=nums[i];
//                System.out.println(nums[i-1]);
//
//            }else if(nums[i]<large);
//        }System.out.println(large);
//}












    }
}
