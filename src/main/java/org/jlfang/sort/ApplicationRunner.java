package org.jlfang.sort;

import java.util.Arrays;

/**
 * @author Cris
 * @description
 * @date 2019/11/20
 */
public class ApplicationRunner {

    public static void main(String[] args) {
        int[] nums = new int[]{8,5,1,3,2,9,4,7,6};
        System.out.println("******Buble Sort Start*******");
        System.out.println("Before Sort: "+ Arrays.toString(nums));
        int[] res1 = BubleSort.bubleSort(nums);
        System.out.println("After Sort:  "+Arrays.toString(res1));
        System.out.println("==============================");
        System.out.println();
        System.out.println("******Selection Sort Start*******");
        System.out.println("Before Sort: "+ Arrays.toString(nums));
        int[] res2 = SelectionSort.selectionSort(nums);
        System.out.println("After Sort:  "+Arrays.toString(res2));
        System.out.println("==============================");
        System.out.println("******Merge Sort Start*******");
        System.out.println("Before Sort: "+ Arrays.toString(nums));
        int[] res3 = MergeSort.sort(nums);
        System.out.println("After Sort:  "+Arrays.toString(res3));
        System.out.println("==============================");
        System.out.println("******Quick Sort Start*******");
        System.out.println("Before Sort: "+ Arrays.toString(nums));
        int[] res4 = QuickSort.sort(nums);
        System.out.println("After Sort:  "+Arrays.toString(res4));
        System.out.println("==============================");
        System.out.println("******Max Heap Sort Start*******");
        System.out.println("Before Sort: "+ Arrays.toString(nums));
        int[] res5 = HeapSort.sort(nums);
        System.out.println("After Sort:  "+Arrays.toString(res5));
        System.out.println("==============================");
        System.out.println("******Bucket Sort Start*******");
        System.out.println("Before Sort: "+ Arrays.toString(nums));
        int[] res6 = BucketSort.sort(nums);
        System.out.println("After Sort:  "+Arrays.toString(res6));
        System.out.println("==============================");
        System.out.println("******Counting Sort Start*******");
        System.out.println("Before Sort: "+ Arrays.toString(nums));
        int[] res7 = CountingSort.sort(nums);
        System.out.println("After Sort:  "+Arrays.toString(res7));
        System.out.println("==============================");
    }

}
