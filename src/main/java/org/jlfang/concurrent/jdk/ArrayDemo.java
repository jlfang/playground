package org.jlfang.concurrent.jdk;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author Cris
 * @description
 * @date 2019/12/2
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[][] people = {{1,2},{2,2}};


        LinkedList<int[]> list = new LinkedList<>();
        for (int[] i : people) {
            list.add(i[1], i);
        }
        list.toArray();
    }
}
