package org.jlfang.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Cris
 * @description 桶排序
 * @date 2019/12/3
 */
public class BucketSort {

    public static int[] sort(int[] arr){
        int[] source = Arrays.copyOf(arr,arr.length);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num : source){
            if(num < min){
                min = num;
            }
            else if( num > max){
                max = num;
            }
        }

        int bucketNum = (int) Math.floor((max-min)/source.length+1);
        List<List<Integer>> buckets = new ArrayList<>(bucketNum);
        for(int i=0;i<bucketNum;i++){
            buckets.add(new ArrayList<>());
        }
        for(int i=0;i<source.length;i++){
            int index = (source[i]-min)/source.length;
            buckets.get(index).add(source[i]);
        }

        for(int i=0;i<buckets.size();i++){
            Collections.sort(buckets.get(i));
        }

        int index = 0;
        for(int i=0;i<buckets.size();i++){
            for(int j=0;j<buckets.get(i).size();j++){
                source[index++] = buckets.get(i).get(j);
            }
        }
        return source;


    }
}
