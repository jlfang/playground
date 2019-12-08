package org.jlfang.sort;

import java.util.Arrays;

/**
 * @author Cris
 * @description 计数排序
 * @date 2019/12/3
 */
public class CountingSort {

    public static int[] sort(int[] arr){
        int[] source = Arrays.copyOf(arr,arr.length);
        int maxVal = Integer.MIN_VALUE;
        for(int i=0;i<source.length;i++){
            if(source[i]>maxVal){
                maxVal = source[i];
            }
        }

        int bucketSize = maxVal+1;
        int[] bucket = new int[bucketSize];

        for(int num : source){
            bucket[num]++;
        }

        int index = 0;
        for(int i=0;i<bucketSize;i++){
            while (bucket[i]>0){
                source[index++] = i;
                bucket[i]--;
            }
        }
        return source;
    }

}
