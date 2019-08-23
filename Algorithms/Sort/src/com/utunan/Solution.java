package com.utunan;


import org.junit.jupiter.api.Test;

public class Solution {

        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        }


    public String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer=new StringBuffer();
        char[] chars= str.toString().toCharArray();
        int length=chars.length;
        String temp="";
        for(int i=0;i<length;i++){
            if(chars[i]!=' '){
                temp=temp+ String.valueOf(chars[i]);
            }else{
                stringBuffer.append(temp);
                stringBuffer.append("%20");
                temp="";
            }
        }
        stringBuffer.append(temp);
        return stringBuffer.toString();
    }

    @Test
    public void  test(){
        replaceSpace(new StringBuffer("Hello World"));
    }


    public boolean Find(int target, int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return false;
        }
        int length = array.length - 1;
        int width = array[0].length - 1;

        int startX = 0;
        int startY = length;
        while (startX <= length && startY >= 0) {
            if (array[startX][startY] > target) {
                startY--;
            } else if (array[startX][startY] < target) {
                startX++;
            } else {
                return true;
            }
        }
        return false;
    }

    @Test
    public void test1() {
        int[][] array = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(array.length);
        System.out.println(array[0].length);
    }

    @Test
    public void bubbleSortTest() {
        int nums[] = {9, 2, 4, 6, 1, 4, 7, 8, 5, 2, 4, 1, 2, 3};
        Sort.bubbleSort(nums, false);
        for (int i : nums) {
            System.out.printf(String.valueOf(i) + " ");
        }
    }

    @Test
    public void insertSortTest() {
        int nums[] = {9, 2, 4, 6, 1, 4, 7, 8, 5, 2, 4, 1, 2, 3};
        Sort.insertSort(nums, true);
        for (int i : nums) {
            System.out.printf(String.valueOf(i) + " ");
        }
    }

    @Test
    public void quickSortTest() {
        int nums[] = {9, 2, 4, 6, 1, 4, 7, 8, 5, 2, 4, 1, 2, 3};
        Sort.quickSort(nums, 0, nums.length - 1, false);
        for (int i : nums) {
            System.out.printf(String.valueOf(i) + " ");
        }
    }

    @Test
    public void selectSortTest() {
        int nums[] = {9, 2, 4, 6, 1, 4, 7, 8, 5, 2, 4, 1, 2, 3};
        Sort.selectSort(nums, true);
        for (int i : nums) {
            System.out.printf(String.valueOf(i) + " ");
        }
    }


}
