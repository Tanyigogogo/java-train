package com.zeta.ex01;

import java.util.Arrays;

/**
 * 本文件是课后编程作业的骨架代码。
 * 原始代码给出了每一道题目的说明（注释）和方法骨架，请按照注释中的题目要求补充完成方法的内部实现。
 * 注意：要按照基本的编码规范编写代码。
 * 每一道题的代码提交后都会经过单元测试。
 */
public class Homework {

    //* 第1题：
    public static String arrayToString(int[] array) {
        String arrayString = "";
        arrayString = "{";
        int len = array.length;
        if ( len != 0) {
            for (int a = 0; a < len; a++) {
                if (a == len - 1) {
                    arrayString = arrayString + array[a] + "}";
                } else {
                    arrayString = arrayString + array[a] + ",";
                }
            }
        }else{
            arrayString = "是不是傻";
        }
        // write your code here
        return arrayString;
    }

    public static String arrayToString(double[] array) {
        String arrayString = "";
        arrayString = "{";
        int len = array.length;
        if ( len != 0) {
            for (int a = 0; a < len; a++) {
                if (a == len - 1) {
                    arrayString = arrayString + array[a] + "}";
                } else {
                    arrayString = arrayString + array[a] + ",";
                }
            }
        }else{
            arrayString = "是不是傻";
        }
        // write your code here
        return arrayString;
    }
    //* 第2题：
    public static boolean containsInArray(int[] array, int key) {
        boolean exists = false;
        int len = array.length;
        for (int a = 0; a < len ; a++ ){
            if (key == array[a]){
                exists = true;
            }
        }
        return exists;
    }

    //* 第3题：
    public static int searchInArray(int[] array, int key) {
        int index = -1;
        int len = array.length;
        for (int a = 0;a < len;a++){
            if(key == array[a]){
                index = a;
                break;
            }
        }
        return index;
    }
    //* 第4题：
    public static boolean equalsArray(int[] array1, int[] array2) {
        boolean equals = false;
        if (array1 != null && array2 != null) {
            int len1 = array1.length;
            int len2 = array2.length;
            if (len1 == len2) {
                if (len1 == 0) {
                    equals = true;
                } else {
                    for (int a = 0; a < len1; a++) {
                        if (array1[a] != array2[a]) {
                            equals = false;
                            break;
                        } else {
                            equals = true;
                        }
                    }
                }
            }
        }else if (array1 == array2){
            equals = true;
        }
        return equals;
    }
    //* 第5题：
    public static int[] copyArray(int[] array) {
        int[] copiedArray = null;
        int len = array.length;
        copiedArray = Arrays.copyOf(array,len);
        return copiedArray;
    }

    public static int[] copyArray(int[] array, int length) {
        int[] copiedArray = null;
        int len= array.length;
        if(length >= len){
            copiedArray = Arrays.copyOf(array,len);
        }else if (length > 0 && length < len){
            copiedArray = Arrays.copyOf(array,length);
        }
        return copiedArray;
    }
}