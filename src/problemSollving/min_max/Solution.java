package problemSollving.min_max;

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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
      List<Integer> arrSorted =  arr.stream().sorted().collect(toList());
      long Sum=0;
      for (int i=0;i<4;i++){
          Sum += arrSorted.get(i);
      }
        System.out.print(Sum +" ");
      Sum=0;
      for (int i= arrSorted.size()-4;i<arrSorted.size();i++){
          Sum += arrSorted.get(i);
      }
    System.out.println(Sum);
    }


    public static void Max(List<Integer> arr) {
        List<Integer> arrSorted =  arr.stream().sorted().collect(toList());
        int max = arrSorted.get(arrSorted.size()-1);
        int count =0;
        for (int elem : arrSorted){
            if(elem == max )
                count++;
        }
        System.out.println(count);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = Arrays.asList(100,9,7,100,100,1,10);

        Result.Max(arr);

    }
}
