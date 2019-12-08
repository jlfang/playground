package org.jlfang.sort;

import java.util.Arrays;

/**
 * @author Cris
 * @description 归并排序
 *
 * Time Complexity: O(nlogn)
 * Space Complexity: O(n)
 *
 * @date 2019/11/26
 */
public class MergeSort {

    public static int[] sort(int[] nums){
        int[] copys = Arrays.copyOf(nums,nums.length);
        mergeSort(copys,0,nums.length-1);
        return copys;
    }

    public static void mergeSort(int[] nums, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) >> 1;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, end);

    }

    public static void merge(int[] nums, int left, int mid, int right) {
        int[] tmp = new int[nums.length];
        int p1 = left;
        int p2 = mid + 1;
        int k = left;
        while (p1 <= mid && p2 <= right) {
            if (nums[p1] <= nums[p2]) {
                tmp[k++] = nums[p1++];
            } else {
                tmp[k++] = nums[p2++];
            }
        }
        while (p1 <= mid) {
            tmp[k++] = nums[p1++];
        }
        while (p2 <= right) {
            tmp[k++] = nums[p2++];
        }
        for (int i = left; i <= right; i++) {
            nums[i] = tmp[i];
        }
    }
}
