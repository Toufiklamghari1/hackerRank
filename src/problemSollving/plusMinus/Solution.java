package problemSollving.plusMinus;

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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int p=0,n=0,z=0;
        for(int c : arr){
            if(c>0)
                p++;
            else if(c<0)
                n++;
            else
                z++;
        }
        DecimalFormat df = new DecimalFormat("###.######");
        System.out.printf("%.6f",(float)p/arr.size());
        System.out.printf("%.6f",(float)n/arr.size());
        System.out.printf("%.6f",(float)z/arr.size());

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = Arrays.asList(1,1,0,-1,-1);
        Result.plusMinus(arr);
    }
}
