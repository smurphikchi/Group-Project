package Arrays;

public class CityNames {
    public static void main(String[] args) {

//        1) Write a program and create String array called cities. Initialize the cities with cities below:
//        Chicago, New York, Madison, Miami, Washington
//        Iterate through each city and check if Chicago is inside the cities.
//                Print "Windy city found" if Chicago exists in the array. "Windy city not found" otherwise.

        String[] cities = {"miami", "New York", "Madison", "Washington","chicago"};
        boolean check = false;
        for (String city : cities) {
            if (city.equalsIgnoreCase("Chicago")) {
                check=true;
            }
        }
        if(check) {
        System.out.println("Windy city found");
            }
        else{
             System.out.println("Windy city not found");


            }
        String[] words ={"Bread","Cucumber","banana","mango","Apple","cookies"};

        boolean upper = false;
        int count = 0;
                for (String word: words){
                    char start= word.charAt(0);
                    if (start>=65 && start<=90){
                        upper =true;
                        count++;
                        System.out.println(word);

                    }

                   // System.out.println(count);
        }

        System.out.println(count);

        }


    }