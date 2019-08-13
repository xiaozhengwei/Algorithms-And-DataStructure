package com.utunan;


import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Solution {

    @Test
    public void bubbleSortTest(){
        int nums[]={9,2,4,6,1,4,7,8,5,2,4,1,2,3};
        Sort.bubbleSort(nums,false);
        for(int i:nums){
            System.out.printf(String.valueOf(i)+" ");
        }
    }

    @Test
    public void insertSortTest(){
        int nums[]={9,2,4,6,1,4,7,8,5,2,4,1,2,3};
        Sort.insertSort(nums,true);
        for(int i:nums){
            System.out.printf(String.valueOf(i)+" ");
        }
    }

    @Test
    public void quickSortTest(){
        int nums[]={9,2,4,6,1,4,7,8,5,2,4,1,2,3};
        Sort.quickSort(nums,0,nums.length-1,false);
        for(int i:nums){
            System.out.printf(String.valueOf(i)+" ");
        }
    }

    @Test
    public void selectSortTest(){
        int nums[]={9,2,4,6,1,4,7,8,5,2,4,1,2,3};
        Sort.selectSort(nums,true);
        for(int i:nums){
            System.out.printf(String.valueOf(i)+" ");
        }
    }


}
