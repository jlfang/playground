package org.jlfang.sort;

/**
 * @author Cris
 * @description 希尔排序
 * @date 2019/12/5
 */
public class ShellSort {

    public static int[] sort(int[] source){
        int h =1;
        while(h < source.length/3){
            h = h * 3 + 1;
        }

        while(h>=1){
            for(int i=h;i < source.length;i++){
                for(int j=i;j>=h && source[j]<source[j-h];j-=h){
                    SortUtils.swap(j,j-h,source);
                }
            }
            h/=3;
        }

        return source;
    }
}
