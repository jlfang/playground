package org.jlfang.sort;

import java.util.Arrays;

/**
 * Selection Sort
 *
 * Time Complexity: O(n*n)
 * Space Complexity: O(1)
 *
 * @author Cris
 * @description
 * @date 2019/11/20
 */
public class SelectionSort {

    public static int[] selectionSort(int[] nums){
        if(!SortUtils.validArray(nums)){
            return nums;
        }
        int min;
        int len = nums.length;
        int[] source = Arrays.copyOf(nums,len);
        for(int i=0;i<len;i++){
            min = i;
            for(int j=i+1;j<len;j++){
                if(source[min]>source[j]){
                    min = j;
                }
            }
            if(min!=i){
                SortUtils.swap(i,min,source);
            }
        }


        return source;
    }
}
