package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Java2dArray {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int sum=Integer.MIN_VALUE;
        int temp=0;
        for (int i=1;i<5;i++){
            for (int j=1;j<5;j++){
                temp=arr.get(i).get(j)
                        +arr.get(i-1).get(j-1)
                        +arr.get(i-1).get(j)
                        +arr.get(i-1).get(j+1)
                        +arr.get(i+1).get(j-1)
                        +arr.get(i+1).get(j)
                        +arr.get(i+1).get(j+1);
                // System.out.println(temp);
                if(temp>sum){
                    sum=temp;
                }
            }
        }
        System.out.println(sum);
        bufferedReader.close();
    }
}
