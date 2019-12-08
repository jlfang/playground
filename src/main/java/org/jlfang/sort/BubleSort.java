package org.jlfang.sort;

import java.util.Arrays;

/**
 * Buble Sort
 *
 * Time Complexity: O(n*n)
 * Space Complexity: O(1)
 *
 *
 * @author Cris
 * @description 冒泡排序
 * @date 2019/11/20
 */
public class BubleSort {

    public static int[] bubleSort(int[] nums){
        if(!SortUtils.validArray(nums)){
            return nums;
        }
        boolean flag;
        int len = nums.length;
        int[] source = Arrays.copyOf(nums,len);
        for(int i=-0;i<len;i++){
             flag = true;
            for(int j=i+1;j<len;j++){
                if(source[i]>source[j]){
                    SortUtils.swap(i,j,source);
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
        return source;
    }



}
