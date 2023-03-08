package org.example;

import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,2,4,3}));
    }

    public static int maxArea(int[] height) {
        int ans = 0;
        int j = height.length-1, i = 0;
        while(i<j)
        {
            if(height[i] <= height[j])
            {
                ans = Math.max(height[i]*(j-i), ans);
                i++;
            }
            else
            {
                ans = Math.max(height[j]*(j-i), ans);
                j--;
            }
        }
        return ans;
    }
}
