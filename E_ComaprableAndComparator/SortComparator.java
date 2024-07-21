package E_ComaprableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

public class SortComparator {

    // Sort 2 d matrix

    public static void main(String[] args) {

        /*

            int a[][] = {
                    {2, 1, 5},
                    {7, 2, 5},
                    {9, 2, 1}
            };

         */
            int a[][] = {
                    {1, 4, 5},
                    {1, 5, 5},
                    {1, 2, 1}
            };


        // a is an array of array that why we passed int[]

        /*
            Arrays.sort(a, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return 0;
                }
            });
         */

        Arrays.sort(a,(arr1,arr2)->{
            if(arr1[0] == arr2[0]){
                return arr1[1] - arr2[1];
            }
            return arr1[0] - arr2[0];
        });

        for(int e[] : a){
            for(int element : e)
            {
              System.out.print(element+" ");
            }
            System.out.println();
        }

        /*
            2 1 5
            7 2 5
            9 2 1
         */

    }
}
