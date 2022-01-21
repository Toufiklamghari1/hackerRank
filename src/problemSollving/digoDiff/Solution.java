package problemSollving.digoDiff;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
      /*  int ltr =0;
        for (int i=0;i< arr.size();i++){

            for (int j=0;j<arr.get(i).size();j++)
            {
                if(i==j){
                    ltr += arr.get(i).get(j);
                }
                else{}
                if(j==arr.get(i).size()-i-1){
                    ltr -= arr.get(i).get(j);
                }
            }

        }
        return Math.abs(ltr);*/
        int leftdiagonal = 0, rightdiagonal = 0;
        for (int i = 0, j = arr.get(0).size() - 1; i < arr.get(0).size(); i++, j--) {
            leftdiagonal = leftdiagonal + arr.get(i).get(i);
            rightdiagonal = rightdiagonal + arr.get(i).get(j);
        }
        return Math.abs(leftdiagonal - rightdiagonal);
    }

}

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> ar = new ArrayList<List<Integer>>();
        ar.add(Arrays.asList(1,2,3));
        ar.add(Arrays.asList(4,5,6));
        ar.add(Arrays.asList(9,8,9));

     }
}
