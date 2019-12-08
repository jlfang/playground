package org.jlfang.sort;

/**
 * @author Cris
 * @description
 * @date 2019/11/20
 */
public class SortUtils {

    public static boolean validArray(int[] nums){
        if(null == nums || nums.length < 2){
            return false;
        }
        return true;
    }

    public static void swap(int i, int j, int[] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
