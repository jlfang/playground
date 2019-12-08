package org.jlfang.sort;

import java.util.Arrays;

/**
 * @author Cris
 * @description 快速排序
 *
 * Time Complexity: O(nlogn)
 * Space Complexity: O(logn)
 *
 * @date 2019/11/20
 */
public class QuickSort {

    public static int[] sort(int[] source){
        int[] arr = Arrays.copyOf(source,source.length);
        return quickSort(arr,0,arr.length-1);
    }

    public static int[] quickSort(int[] arr,int left, int right){
        if(left<right){
            int partitionIndex = partition(arr,left,right);
            quickSort(arr,left,partitionIndex-1);
            quickSort(arr,partitionIndex+1,right);
        }
        return arr;
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = left;
        int index = pivot+1;
        for(int i=index;i<=right;i++){
            if(arr[i]<arr[pivot]){
                SortUtils.swap(i,index,arr);
                index++;
            }
        }
        SortUtils.swap(index-1,pivot,arr);
        return index-1;
    }

}
