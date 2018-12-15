package main;

public class FindSmallest {

//stream connects to main

	  public static void do20() {
//elements in arra y
        int[] numbers = {88,33,55,23,64,123};

        int smallest = Integer.MAX_VALUE;

         //int smallest to find smallest int

        for(int i =0;i<numbers.length;i++) {
            if(smallest > numbers[i]) {

               smallest = numbers[i];

            }

        }

         

        System.out.println("Smallest number in array is : " +smallest);
//should print 23
    }

}

