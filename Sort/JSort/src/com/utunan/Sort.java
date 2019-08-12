package com.utunan;

public class Sort {

    /**
     * 冒泡排序
     *
     * @Param nums : 待排序数组
     * @Param type : 排序方式(true:从小到大,false:从大到小)
     * @时间复杂度: Max:O(n2) Min:O(n) Average:O(n2)
     * @空间复杂度: O(1)
     * @稳定性 : 稳定
     */
    public static void bubbleSort(int[] nums, boolean type) {

        int length = nums.length;

        if (length <= 1) {
            return;
        }

        boolean state = true;//标记状态,若数组没有发生变化,则停止排序

        for (int i = 0; i < length - 1; i++) {
            state = true;
            for (int j = 0; j < length - i - 1; j++) {
                if (type ? nums[j] > nums[j + 1] : nums[j] < nums[j + 1]) {
                    nums[j] ^= nums[j + 1];
                    nums[j + 1] ^= nums[j];
                    nums[j] ^= nums[j + 1];
                    state = false;
                }
            }
            if (state) {
                break;
            }
        }

    }


    /**
     * 插入排序
     *
     * @Param nums : 待排序数组
     * @Param type : 排序方式(true:从小到大,false:从大到小)
     * @时间复杂度: Max:O(n2) Min:O(n) Average:O(n2)
     * @空间复杂度: O(1)
     * @稳定性 : 稳定
     */
    public static void insertSort(int[] nums, boolean type) {

        int length = nums.length;

        if (length <= 1) {
            return;
        }

        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (type ? nums[j] < nums[j - 1] : nums[j] > nums[j - 1]) {
                    nums[j] ^= nums[j - 1];
                    nums[j - 1] ^= nums[j];
                    nums[j] ^= nums[j - 1];
                }
            }
        }

    }

    /**
     * 快速排序
     *
     * @Param nums : 待排序数组
     * @Param type : 排序方式(true:从小到大,false:从大到小)
     * @时间复杂度: Max:O(n2) Min:O(n) Average:O(n2)
     * @空间复杂度: O(1)
     * @稳定性 : 不稳定
     */
    public static void quickSort(int[] nums, int start, int end, boolean type) {

        int low = start;
        int high = end;
        if (low >= high) {
            return;
        }


        int lookout = nums[start];
        while (low < high) {

            while (nums[high] >= lookout && low < high) {
                high--;
            }


            while (nums[low] <= lookout && low < high) {
                low++;
            }

            if (low < high) {
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
            }
        }
        quickSort(nums, start, low - 1, type);
        quickSort(nums, high + 1, end, type);


    }

    /**
     * 选择排序
     *
     * @Param nums : 待排序数组
     * @Param type : 排序方式(true:从小到大,false:从大到小)
     * @时间复杂度: Max:O(n2) Min:O(n2) Average:O(n2)
     * @空间复杂度: O(1)
     * @稳定性 :  不稳定
     */
    public static void selectSort(int[] nums, boolean type) {

        int length = nums.length;
        if (length <= 1) {
            return;
        }

        for (int i = 0; i < length - 1; i++) {
            int sign = nums[i];
            int cursor = i;
            for (int j = i + 1; j < length; j++) {
                if (type ? sign > nums[j] : sign < nums[j]) {
                    sign = nums[j];
                    cursor = j;

                }
            }
            nums[cursor] = nums[i];
            nums[i] = sign;
        }

    }


}
