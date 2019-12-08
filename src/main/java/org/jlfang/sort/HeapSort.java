package org.jlfang.sort;

import java.util.Arrays;

/**
 * @author Cris
 * @description 堆排序
 *
 * Time Complexity: O(nlogn)
 * Space Complexity: O(1)
 *
 * 完全二叉树特性：左边子节点位置=当前父节点位置的两倍+1，右边子节点位置=当前父节点的两倍+2
 *
 * @date 2019/12/2
 */
public class HeapSort {

    public static int[] sort(int[] arr){
        int[] source = Arrays.copyOf(arr,arr.length);
        for(int i=0;i<source.length;i++){
            maxHeapify(source,source.length-i);
            SortUtils.swap(0,source.length-1-i,source);
        }
        return source;
    }

    public static void maxHeapify(int[] arr, int size){
        for(int i = arr.length-1;i>=0;i--){
            heapify(arr,i,size);
        }
    }

    public static void heapify(int[] arr, int currentRootNode, int size){
        if(currentRootNode < size){
            int left = currentRootNode * 2 + 1;
            int right = currentRootNode * 2 + 2;

            int max = currentRootNode;

            if(left < size && arr[max] < arr[left] ){
                    max = left;
            }
            if( right <size && arr[max] <arr[right]){
                    max = right;
            }

            if(max != currentRootNode){
                SortUtils.swap(max,currentRootNode,arr);
                heapify(arr,max,size);
            }
        }
    }
}
